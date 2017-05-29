/**
 * Created by Alpha on 29.05.2017.
 */
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import java.util.LinkedList;
import java.util.List;

public class XMLParseHandler extends DefaultHandler{
    private LinkedList<FeedMessage> list = new LinkedList<FeedMessage>();
    FeedMessage currentFeed = new FeedMessage();
    String thisElement = "";

    public List<FeedMessage> getResult(){
        return list;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("item")) {
            currentFeed = new FeedMessage();
            list.add(currentFeed);
        }
        else if (thisElement.equals("title")) {
            currentFeed.setTitle(new String(ch, start, length));
        }
        else if (thisElement.equals("description")) {
            currentFeed.setDescription(new String(ch, start, length));
        }
        else if (thisElement.equals("pubDate")) {
            currentFeed.setPubDate(new String(ch, start, length));
        }

    }

    @Override
    public void endDocument() {
        System.out.println("Stop parse XML...");
    }
}