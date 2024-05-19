package top.ytazwc.exceptions;

/**
 * @author 花木凋零成兰
 * @title DynamicFields
 * @date 2024/5/19 19:35
 * @package top.ytazwc.exceptions
 * @description 异常链
 */
public class DynamicFields {

    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            fields[i] = new Object[] {null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }
    // 判断是否存在 对应字段
    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    // 字段所在索引
    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNum;
    }

    // 存入一个字段 若字段长度不够 则进行扩容 并重新存入
    private int makeField(String id) {
        for (int i = 0; i < fields.length; ++i) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        Object[][] tmp = new Object[fields.length + 1][2];
        System.arraycopy(fields, 0, tmp, 0, fields.length);
        for (int i = fields.length; i < tmp.length; i ++) {
            tmp[i] = new Object[] {null, null};
        }
        fields = tmp;
        return makeField(id);
    }

    // 获取字段id 对应的值
    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            // 如果不存在该字段 则存入
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            // 获取对应id 的旧值
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("d", "A new value for d");
            df.setField("number3", 11);
            System.out.println("df: " +df);
            System.out.println("df.getField(\"d\") : " +df.getField("d"));
            Object field = df.setField("d", null);
        } catch (NoSuchFieldException | DynamicFieldsException e) {
            e.printStackTrace(System.out);
        }
    }

}

class DynamicFieldsException extends Exception {

}


