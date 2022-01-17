import java.util.ArrayList;
import java.util.Scanner;

public class Article {

    private String heading;
    private String body;
    private String author;


    public void setHeading(String heading) {
        this.heading = heading;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getLongestWord() {
        String[] words = body.split(" ");
        String longestWord = words[0];
        for (String string: words) {
            if (string.length() > longestWord.length()) {
                longestWord = string;
            }
        }
        return longestWord;
    }

    public ArrayList<String> getUniqueWords() {
        ArrayList<String> uniqueWords = new ArrayList<>();
        Scanner reader = new Scanner(body);
        uniqueWords.add(reader.next());
        while (reader.hasNext()) {
            String word = reader.next();
            for (int i = 0; i < uniqueWords.size(); i++) {
                if (!uniqueWords.get(i).equalsIgnoreCase(word)) {
                    uniqueWords.add(word);
                }
            }
        }
        return uniqueWords;
    }

    public static void main(String[] args) {
        Article article = new Article();
        article.setAuthor("Martin");
        article.setBody("In to am attended desirous raptures " +
                "declared diverted confined at. Collected " +
                "instantly remaining up certainly to necessary " +
                "as. Over walk dull into son boy door went new. " +
                "At or happiness commanded daughters as. Is " +
                "handsome an declared at received in extended " +
                "vicinity subjects. Into miss on he over been " +
                "late pain an. Only week bore boy what fat case " +
                "left use. Match round scale now sex style far times. Your me past an \n" +
                "\n" +
                "Carried nothing on am warrant towards. Polite " +
                "in of in oh needed itself silent course. " +
                "Assistance travelling so especially do prosperous " +
                "appearance mr no celebrated. Wanted easily my " +
                "called formed suffer. Songs hoped sense as taken " +
                "ye mirth at. Believe fat how six drawing pursuit " +
                "minutes far. Same do seen head am part it dear open to. Whatever may scarcely judgment had.");
        article.setHeading("Hello hello.");
        System.out.println(article.getLongestWord());
        System.out.println(article.getUniqueWords());
    }

}
