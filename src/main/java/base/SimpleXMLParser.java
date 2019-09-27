/**
 * простой обработчик xml - example.xml в корне проекта.
 * Для нод с одинаковым названием нужно указать порядок следования в xml
 * Данная реализация для быстрого парсинга xml-ек любого уровня вложенности,
 * но удобнее всего работать, если ноды имеют уникальные названия
 */

package base;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

public class SimpleXMLParser {

    public String getNodeValue(String nodeName, int numNode) {
        try {
            File fXmlFile = new File(".\\example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("credit_order");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    return eElement.getElementsByTagName(nodeName)
                            .item(numNode).getTextContent();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nodeName + " not found";
    }

}
