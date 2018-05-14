package flashcard.gui;

import flashcard.Library;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ClickListener implements ActionListener {

    private Library library;
    private JTextField input;
    private JTextField output;

    public ClickListener(Library library, JTextField input, JTextField output) {
        this.library = library;
        this.input = input;
        this.output = output;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String input = this.input.getText();

        if (library.translate(input).isEmpty()) {
            this.output.setText("N/A");
        } else {
            this.output.setText(library.translate(input));
        }

    }

}
