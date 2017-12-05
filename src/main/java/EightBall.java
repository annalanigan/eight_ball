import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> results;

    public EightBall() {
        this.results = new ArrayList<>();
    }

    public void addResult(String answer) {
        this.results.add(answer);
    }

    public int getCount() {
        return this.results.size();
    }

    public String shake() {
        Collections.shuffle(results);
        return results.get(0);
    }

    public void remove(String word)  {
        this.results.remove(word);
    }
}
