package base.jacksontry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TempoTest {


    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String str = "{\"someKey\":\"asdf\",\"someKey2\":\"fdsa\"}";

        Mapping mapping = null;
        try {
            mapping = mapper.readValue(str, Mapping.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(mapping.getSomeKey() + " " + mapping.getSomeKey2());

/*
        try {
            mapper.writeValue(new File(".\\mapping.txt"), mapping);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        String str1 = null;
        try {
            str1 = mapper.writeValueAsString(mapping);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(str1);


    }
}
