/**
 * используется, когда нужны некоторые часто применимые методы для заполнения различных форм
 * по большей части, интерфейс используется для обхода отсутствия множественного наследования
 */

package base;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface HelpMeths {

    //получение случайно сгенерированного e-mail в заданном домене
    default String getEmail(String appendPart) {
        int n;
        StringBuffer buf = new StringBuffer();

        for (int i = 0; i < 10; i++) {
            n = (int) (Math.random() * 26 + 97);
            buf.append(Character.toString((char) n));
        }
        return buf.append(appendPart).toString(); //appendPart for example "@.norma24.ru"
    }

    // генерация случайной строки (ASCII латиница, внимание, после J9 - char 1 byte)
    default String getRandomString(int strLength) {
        int n;
        StringBuffer buf = new StringBuffer(strLength);

        for (int i = 0; i < strLength; i++) {
            n = (int) (Math.random() * 26 + 97);
            buf.append((char) n);
        }
        return buf.toString();
    }

    //получение строки, содержащей случайное число в заданном интервале
    default String getNum(int startInterval, int endInterval) {
        endInterval -= startInterval;
        int n = (int) (Math.random() * ++endInterval) + startInterval;

        return Integer.toString(n);
    }

    //получение даты строкой
    default String getDate() {
        return (new SimpleDateFormat("dd.MM.yyyy")).format(new Date());
    }

}
