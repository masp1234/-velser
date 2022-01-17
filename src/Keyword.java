public class Keyword {

    private String word;
    private String definition;
    private String[] seeAlso;
    

    public boolean matches(String word) {
        return this.word.equalsIgnoreCase(word);
    }
}
