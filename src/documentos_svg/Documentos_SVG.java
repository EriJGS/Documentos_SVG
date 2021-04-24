/* DESARROLLO III (23 de abril de 2021) - Tarea: Documentos SVG

Desarrollar una aplicación en Java que identifique y muestre en consola los siguientes elementos en un documento SVG.
- rectangle, con sus atributos x, y, width, height
- circle,  con sus atributos cx, cy, r
- ellipse, con sus atributos cx, cy, rx, ry
- line, con sus artibutos x1, y1, x2, y2
- polyline, con la lista de puntos que forman parte del polyline
- text, con sus artibutos x, y, font-family, font-size, 

Es necesario crear un archivo SVG que contenga al menos uno de los elementos anteriores. Para esto se puede utilizar la
aplicación SVG-Edit. 
 */

package documentos_svg;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author EricaJGS
 */
public class Documentos_SVG {

    public static void main(String[] args) {
        try {
            File inputFile = new File("icon.svg");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // El parser crea el documento DOM
            Document doc = dBuilder.parse(inputFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName() + "\n");
            Element root = doc.getDocumentElement();

            // Recuperar todas las lineas            
            NodeList linesListRect = doc.getElementsByTagName("rect");

            // Procesar cada linea, para mostrar atributos asociaddos
            for (int temp = 0; temp < linesListRect.getLength(); temp++) {
                Node nNode = linesListRect.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element line = (Element) nNode;

                    NamedNodeMap attribs = line.getAttributes();

                    String x = attribs.getNamedItem("x").getNodeValue();
                    String y = attribs.getNamedItem("y").getNodeValue();
                    String w = attribs.getNamedItem("width").getNodeValue();
                    String h = attribs.getNamedItem("height").getNodeValue();

                    System.out.printf("rect: (%s, %s, %s, %s)\n", x, y, w, h);
                }
            }
            
            // Recuperar todas las lineas            
            NodeList linesListCircle = doc.getElementsByTagName("circle");

            // Procesar cada linea, para mostrar atributos asociaddos
            for (int temp = 0; temp < linesListCircle.getLength(); temp++) {
                Node nNode = linesListCircle.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element line = (Element) nNode;

                    NamedNodeMap attribs = line.getAttributes();

                    String cx = attribs.getNamedItem("cx").getNodeValue();
                    String cy = attribs.getNamedItem("cy").getNodeValue();
                    String r = attribs.getNamedItem("r").getNodeValue();

                    System.out.printf("circle: (%s, %s, %s)\n", cx, cy, r);
                }
            }
            
            // Recuperar todas las lineas            
            NodeList linesListEllipse = doc.getElementsByTagName("ellipse");

            // Procesar cada linea, para mostrar atributos asociaddos
            for (int temp = 0; temp < linesListEllipse.getLength(); temp++) {
                Node nNode = linesListEllipse.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element line = (Element) nNode;

                    NamedNodeMap attribs = line.getAttributes();

                    String cx = attribs.getNamedItem("cx").getNodeValue();
                    String cy = attribs.getNamedItem("cy").getNodeValue();
                    String rx = attribs.getNamedItem("rx").getNodeValue();
                    String ry = attribs.getNamedItem("ry").getNodeValue();

                    System.out.printf("ellipse: (%s, %s, %s, %s)\n", cx, cy, rx, ry);
                }
            }
            
            // Recuperar todas las lineas            
            NodeList linesListLine = doc.getElementsByTagName("line");

            // Procesar cada linea, para mostrar atributos asociaddos
            for (int temp = 0; temp < linesListLine.getLength(); temp++) {
                Node nNode = linesListLine.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element line = (Element) nNode;

                    NamedNodeMap attribs = line.getAttributes();

                    String x1 = attribs.getNamedItem("x1").getNodeValue();
                    String y1 = attribs.getNamedItem("y1").getNodeValue();
                    String x2 = attribs.getNamedItem("x2").getNodeValue();
                    String y2 = attribs.getNamedItem("y2").getNodeValue();

                    System.out.printf("line: (%s, %s, %s, %s)\n", x1, y1, x2, y2);
                }
            }
            
            // Recuperar todas las lineas            
            NodeList linesListPolyline = doc.getElementsByTagName("polyline");

            // Procesar cada linea, para mostrar atributos asociaddos
            for (int temp = 0; temp < linesListPolyline.getLength(); temp++) {
                Node nNode = linesListPolyline.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element line = (Element) nNode;

                    NamedNodeMap attribs = line.getAttributes();

                    String points = attribs.getNamedItem("points").getNodeValue();

                    System.out.printf("polyline: (%s)\n", points);
                }
            }
            
            // Recuperar todas las lineas            
            NodeList linesListText = doc.getElementsByTagName("text");

            // Procesar cada linea, para mostrar atributos asociaddos
            for (int temp = 0; temp < linesListText.getLength(); temp++) {
                Node nNode = linesListText.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element line = (Element) nNode;

                    NamedNodeMap attribs = line.getAttributes();

                    String x = attribs.getNamedItem("x").getNodeValue();
                    String y = attribs.getNamedItem("y").getNodeValue();
                    String fontFamily = attribs.getNamedItem("font-family").getNodeValue();
                    String fontSize = attribs.getNamedItem("font-size").getNodeValue();

                    System.out.printf("text: (%s, %s, %s, %s)\n", x, y, fontFamily, fontSize);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
