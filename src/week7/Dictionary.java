package week7;
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> translations;

    public Dictionary() {
        translations = new HashMap<String, String>();
        // <finnish word, english word>
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public int amountOfWords() {
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : translations.keySet()) {
            list.add(key + " = " + translations.get(key));
        }
        return list;

    }

}