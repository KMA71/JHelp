package base;
/**
 * при добавлении значений в config.properties необходимо расширять switch(neededProp)
 * пример config.properties в example.properties
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetPropertyValues {

    String result = "";
    InputStream inputStream;

    public String getPropValues(String neededProp) {
        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file " + propFileName + " does not exist");
            }

            Date time = new Date(System.currentTimeMillis());

            String userDB = prop.getProperty("user");
            String pswDB = prop.getProperty("psw");
            String urlDB = prop.getProperty("urlP");

            switch (neededProp) {
                case ("userDB"):
                    result = userDB;
                    break;
                case ("pswDB"):
                    result = pswDB;
                    break;
                case ("urlP"):
                    result = urlDB;
                    break;
                default:
                    result = "no " + neededProp + " value in config.properties";
                    break;
            }

            //result = "user/password is: " + userDB + " " + pswDB;
            System.out.println(result + "\nProgram Ran on " + time + "by user=" + userDB);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("broken when read properties: " + e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException ioex) {
                ioex.printStackTrace();
                System.out.println("error closing file " + ioex);
            }
        }

        return result;
    }
}
