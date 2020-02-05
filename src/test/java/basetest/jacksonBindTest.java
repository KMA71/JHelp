package basetest;

import base.jacksontry.Mapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class jacksonBindTest {

    @Test
    @DisplayName("Jackson JSON binding")
    void jBindTest() {
        ObjectMapper mapper = new ObjectMapper();
        String str = "{\"someKey\":\"asdf\",\"someKey2\":\"fdsa\"}";

        Mapping mapping = null;
        try {
            mapping = mapper.readValue(str, Mapping.class);
        } catch (
                JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(mapping.getSomeKey() + " " + mapping.getSomeKey2());

        String str1 = null;
        try {
            str1 = mapper.writeValueAsString(mapping);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(str1);

        assertTrue(true);
    }
}
