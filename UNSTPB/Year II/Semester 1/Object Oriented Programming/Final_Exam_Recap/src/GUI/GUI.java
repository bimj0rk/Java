//Exam model
package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class GUI extends Frame{
    private Integer width = 350; //width of GUI frame
    private Integer height = 350; //height of GUI frame

    private Panel panel = new Panel(); //adds panel so it's visible

    private TextArea booksTextArea = new TextArea(5, 10); //text area
    private Button getContentButton = new Button("Get Content"); //button
    private Label checkboxLabel = new Label("Type of Publication:"); //title of checkbox list

    private CheckboxGroup checkboxGroup = new CheckboxGroup(); //checkbox list
    private Checkbox checkboxBook = new Checkbox("Book", checkboxGroup, false); //book box
    private Checkbox checkboxJournal = new Checkbox("Journal", checkboxGroup, false); //journal box
    private Checkbox checkboxMagazine = new Checkbox("Magazine", checkboxGroup, false); //magazine box

    private Label isbnLabel = new Label("ISBN"); //ISBN label for text field
    private TextField isbnTextField = new TextField(); //ISBN text field

    private Label priceLabel = new Label("Price"); //Price label for text field
    private TextField priceTextField = new TextField(); //Price text field

    private Button addButton = new Button("Add"); //Add button
    private Button getMostExpensiveButton = new Button("Get Most Expensive"); //Get Most Expensive button

    private Label mosteExpensivePriceLabel = new Label("Price"); //Price Most Expensive label for text field
    private TextField mostExpensivePriceTextField = new TextField(); //Price Most Expensive text field

    private GetContentEvent getEvent = new GetContentEvent();

    public GUI(){
        setSize(width, height); //sets the side of the GUI box
        setLayout(new GridLayout(8, 1)); //sets the layout

        getContentButton.addActionListener(getEvent); //adds the action listener for the content button
        
        //add all items
        add(panel);
        panel.add(booksTextArea);
        panel.add(getContentButton);
        panel.add(checkboxLabel);
        panel.add(checkboxBook);
        panel.add(checkboxJournal);
        panel.add(checkboxMagazine);
        panel.add(isbnLabel);
        panel.add(isbnTextField);
        panel.add(priceLabel);
        panel.add(priceTextField);
        panel.add(addButton);
        panel.add(getMostExpensiveButton);
        panel.add(mosteExpensivePriceLabel);
        panel.add(mostExpensivePriceTextField);
    }

    class GetContentEvent implements ActionListener{
        public void actionPerformed(ActionEvent action){
            booksTextArea.append("book"); //writes in desired area the word "book" when "Get Content" is pressed
        }
    }
}