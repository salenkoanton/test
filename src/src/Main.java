import java.io.IOException;

/**
 * Created by Alpha on 29.05.2017.
 */

public class Main {
    public static void main(String[] args){
        try {
            Client client = new Client("http://rss.nytimes.com/services/xml/rss/nyt/Science.xml");
            for (FeedMessage msg: client.getData()) {
                System.out.println(msg.toString());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
