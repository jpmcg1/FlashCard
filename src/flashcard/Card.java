
package flashcard;

public class Card {
    
    private String english;
    private String japanese;
    
    public Card(String english, String japanese){
        this.english = english;
        this.japanese = japanese;
    }

    public String getEnglish() {
        return english;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    @Override
    public String toString() {
        return "English: " + this.english + " ; Japanese: " + this.japanese;
    }
    
    
}
