/**
 * для примера и тестирования новых свойств
 */

package base;

public class GetPropMain {
    public static void main(String[] args) {
        GetPropertyValues properties = new GetPropertyValues();
        String usr = properties.getPropValues("userDB");
        String passw = properties.getPropValues("pswDB");
        String db = properties.getPropValues("urlP");
        System.out.println(db);
        System.out.println(usr);
        System.out.println(passw);
    }
}
