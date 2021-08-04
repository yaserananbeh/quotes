package app;
import java.util.Map;

public class Quats {
    private String author;
    private String text;

    public  Quats(){

    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }


    public Quats(Map randomItem) {
        this.author= (String) randomItem.get("author");

        String test=(String)randomItem.get("text");
        int until=test.length()-4;

        this.text = test.substring(4,until);
    }
    @Override
    public String toString() {
        return "Quats{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}