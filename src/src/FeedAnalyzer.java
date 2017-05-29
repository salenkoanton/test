/**
 * Created by Alpha on 29.05.2017.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Alpha on 29.05.2017.
 */
public class FeedAnalyzer {
    private FeedMessage toAnalyze;
    public FeedAnalyzer(FeedMessage item){
        toAnalyze = item;
    }
    public void Analyze(){
        String data = toAnalyze.toString();
        String[] lexems = data.split("[ \t\n\r,.]");
        List<String> words = new ArrayList<String>();
        for (String lex: lexems) {
            if (lex.length() > 2)
                words
        }
    }
}
