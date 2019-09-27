package basetest;

import base.SimpleXMLParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SimpleXMLParserTest {

    SimpleXMLParser parser = new SimpleXMLParser();

    @ParameterizedTest
    @DisplayName("печать значений всех нод")
    @CsvSource({"lastname, 0", "firstname, 0", "middlename, 0", "birthday, 1", "lastname, 1", "firstname, 1", "middlename, 1", "birthday, 1"})
    void getNodeValueTest(String nName, int nNum) {
        System.out.println(parser.getNodeValue(nName, nNum));
    }
}
