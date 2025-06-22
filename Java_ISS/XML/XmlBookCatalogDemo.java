package XML;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;

public class XmlBookCatalogDemo {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:\\docs\\Java_ISS\\src\\XML\\books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("book");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) node;
                    String isbn = elem.getAttribute("isbn");
                    String title = elem.getElementsByTagName("title").item(0).getTextContent();
                    String author = elem.getElementsByTagName("author").item(0).getTextContent();
                    String year = elem.getElementsByTagName("year").item(0).getTextContent();
                    System.out.println("Book ISBN: " + isbn + ", Title: " + title +
                            ", Author: " + author + ", Year: " + year);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}