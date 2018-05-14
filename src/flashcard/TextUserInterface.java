
package flashcard;

import java.util.Scanner;

class TextUserInterface {
    
    private Scanner reader;
    private Library library;
    
    public TextUserInterface(Library library){
        this.reader = new Scanner(System.in, "UTF-8");
        this.library = library;
    }
    
    public void start(){
        System.out.print("English translation: ");
        String english = reader.nextLine();
        System.out.print("Japanese translation: ");
        String japanese = reader.nextLine();
        
        this.library.add(new Card(english, japanese));
    }
}
