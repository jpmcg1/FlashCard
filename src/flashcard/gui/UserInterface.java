package flashcard.gui;

import flashcard.Library;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Library library;
    private JButton engToJap;
    private JButton japToEng;
    private JTextField input;
    private JTextField output;

    public UserInterface(Library library) {
        this.library = library;
    }

    @Override
    public void run() {
        frame = new JFrame("Dictionary");
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        this.input = new JTextField("");
        this.output = new JTextField("");
        
        container.add(this.input);
        container.add(createPanel());
        container.add(this.output);
        
        ClickListener engJap = new ClickListener(this.library, this.input, this.output);
        this.engToJap.addActionListener(engJap);
        ClickListener japEng = new ClickListener(this.library, this.input, this.output);
        this.japToEng.addActionListener(japEng);
    }
    
    public JPanel createPanel(){
        JPanel panel = new JPanel(new GridLayout(2,1));
        
        this.engToJap = new JButton("ENG-JAP");
        this.japToEng = new JButton("JAP-ENG");
        
        panel.add(this.engToJap);
        panel.add(this.japToEng);
        
        return panel;
    }
    
    public JFrame getFrame() {
        return frame;
    }

}
