
package flashcard;

import java.util.ArrayList;
import java.util.List;

public class Library {
    
    private List<Card> library;
    
    public Library(){
        this.library = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.library.add(card);
    }
    
    public void printList(){
        for (Card x : this.library){
            System.out.println(x);
        }
    }
    
    public int amountOfEntries(){
        return this.library.size();
    }
    
    public String translate(String word){
        String translation = "";
        for (Card x : this.library){
            if (x.getEnglish().equals(word)){
                translation += x.getJapanese();
            } else if (x.getJapanese().equals(word)){
                translation += x.getEnglish();
            }
        }
        return translation;
    }
}
