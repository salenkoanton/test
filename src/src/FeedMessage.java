/**
 * Created by Alpha on 29.05.2017.
 */
import org.omg.CORBA.Object;

import java.io.Serializable;
public class FeedMessage implements Serializable{
    private String title = "";
    private String description = "";
    private String pubDate = "";
    public FeedMessage(){}
    public void setTitle(String title){
        this.title += title;
    }
    public void setDescription(String description){
        this.description += description;
    }
    public void setPubDate(String pubDate){
        this.pubDate += pubDate;
    }
    public String toString(){
        return title + "\n" + description + "\n" + pubDate + "\n\n";
    }

}
