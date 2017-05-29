/**
 * Created by Alpha on 29.05.2017.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.util.List;

public class Client {
    private URL url;
    private URLConnection connection;
    private InputStream stream;
    private List<FeedMessage> data;
    public Client(String urlHostName) throws IOException {
        try {
            url = new URL(urlHostName);
            connection = url.openConnection();
            connection.connect();
            XMLParser parser = new XMLParser(connection.getInputStream());
            data = parser.getData();
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }
    public List<FeedMessage> getData(){
        return data;
    }
}
