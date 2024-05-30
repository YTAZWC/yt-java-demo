package top.ytazwc.annotations.database;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 花木凋零成兰
 * @title TableCreator
 * @date 2024/5/28 14:35
 * @package top.ytazwc.annotations.database
 * @description 注解处理器
 * 读取一个类文件 检查数据库的注解 生成用于创建数据库的SQL命令
 */
public class TableCreator {
    public static void check(String[] args) {
        if (args.length < 1) {
            System.out.println("arguments: annotation classes");
            System.exit(0);
        }
        for (String className : args) {
            Class<?> c1 = null;
            try {
                // 根据类全名获取 类的类类型
                c1 = Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            // 获取表名
            DBTable dbTable = c1.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.println("No DBTable annotations in class " + className);
                continue;
            }
            // 表名
            String tableName = dbTable.name();
            // 如果表名为空 则使用类名作为默认表名
            if (tableName.isEmpty()) {
                tableName = c1.getName().toUpperCase();
            }
            // 表的字段列表
            List<String> columnDefs = new ArrayList<>();
            for (Field field : c1.getDeclaredFields()) {
                String columnName = null;
                Annotation[] annotations = field.getDeclaredAnnotations();
                if (annotations.length < 1) {
                    // 说明不存在数据库字段注解
                    continue;
                }
                if (annotations[0] instanceof SQLInteger) {
                    // 若字段类型为Integer
                    SQLInteger sqlInteger = (SQLInteger) annotations[0];
                    if (sqlInteger.name().isEmpty()) {
                        // 如果没有设置字段名 则以属性名作为字段名
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sqlInteger.name();
                    }
                    columnDefs.add(columnName + " INT" + getConstraints(sqlInteger.constraints()));
                } else if (annotations[0] instanceof SQLString) {
                    // 若字段类型为String
                    SQLString sqlString = (SQLString) annotations[0];
                    if (sqlString.name().isEmpty()) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sqlString.name();
                    }
                    columnDefs.add(columnName + " VARCHAR(" + sqlString.value() + ")" + getConstraints(sqlString.constraints()));
                }
                StringBuilder createCommand = new StringBuilder("CREATE TABLE " + tableName +"(");
                for (String columnDef : columnDefs) {
                    createCommand.append("\n ").append(columnDef).append(",");
                }
                String tableCreate = createCommand.substring(0, createCommand.length()-1) + "\n);";
                System.out.println("Table Creation SQL for " + className + "is:\n" + tableCreate);
            }
        }
    }
    private static String getConstraints(Constraints con) {
        String constraints = "";
        if (!con.allowNull()) {
            constraints += " NOT NULL";
        }
        if (con.primaryKey()) {
            constraints += " PRIMARY KEY";
        }
        if (con.unique()) {
            constraints += " UNIQUE";
        }
        return constraints;
    }
}
