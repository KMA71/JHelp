/**
 * обрабатывает запросы к целочисленным столбцам таблиц БД
 * возвращает значение строкой
 */

package base;

import java.sql.*;

public class SimpleDBQuerry {

    //TODO более гибкую возможность обработки типов колонок
    public String getIntQuery(String query, String columnLabel, String dbName) {
        GetPropertyValues properties = new GetPropertyValues();
        //выбор из двух баз, если больше - переделать на switch case
        String url = "";
        try {
        if (dbName.toLowerCase().equals("portal")) {
            url = properties.getPropValues("urlP");

            } else if (dbName.toLowerCase().equals("core")) {
                url = "jdbc:mysql://192.168.0.4:3306/core" +
                        "?verifyServerCertificate=false" +
                        "&useSSL=false" +
                        "&requireSSL=false" +
                        "&useLegacyDatetimeCode=false" +
                        "&amp" +
                        "&serverTimezone=UTC";
            } else {
                return "No " + dbName + " database founded";
            }


        } catch(Exception e) {
            e.printStackTrace();
        }

        String userDB = "";
        String pswDB = "";

        try {
            userDB = properties.getPropValues("userDB");
            pswDB = properties.getPropValues("pswDB");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //for Example: String query = "SELECT errors_limit FROM `user` WHERE username = \"nfb\"";

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
