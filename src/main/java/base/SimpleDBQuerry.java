/**
 * обрабатывает запросы к целочисленным столбцам таблиц БД
 * возвращает значение строкой
 */

package base;

import java.sql.*;

public class SimpleDBQuerry {

    //TODO более гибкую возможность обработки типов колонок
    public String getIntQuery(String query, String columnLabel, String dbName) {

        //выбор из двух баз, если больше - переделать на switch case
        String url;
        if (dbName.toLowerCase().equals("db_name1")) {
            url = "jdbc:mysql://192.168.0.3:3306/db_name1" +
                    "?verifyServerCertificate=false" +
                    "&useSSL=false" +
                    "&requireSSL=false" +
                    "&useLegacyDatetimeCode=false" +
                    "&amp" +
                    "&serverTimezone=UTC";
        } else if (dbName.toLowerCase().equals("db_name2")) {
            url = "jdbc:mysql://10.77.51.4:3306/db_name2" +
                    "?verifyServerCertificate=false" +
                    "&useSSL=false" +
                    "&requireSSL=false" +
                    "&useLegacyDatetimeCode=false" +
                    "&amp" +
                    "&serverTimezone=UTC";
        } else {
            return "No " + dbName + " database founded";
        }

        //пользователь и пароль (условные):
        //TODO реализовать хранение паролей в зашифрованном файле
        String userDB = "admin";
        String pswDB = "admin";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //String query = "SELECT errors_limit FROM `user` WHERE username = \"nfb\"";

        int result = 0;

        try {
            con = DriverManager.getConnection(url, userDB, pswDB);
            stmt = con.createStatement();

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                result = rs.getInt(columnLabel);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) {

            }
            try {
                stmt.close();
            } catch (SQLException se) {

            }
            try {
                rs.close();
            } catch (SQLException se) {

            }
        }

        return Integer.toString(result);
    }

}
