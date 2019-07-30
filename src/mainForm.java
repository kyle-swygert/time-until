import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton newEventButton;



    public mainForm() {

        // add components to the form
        this.add(panel1);

        // initialize the components
        this.setTitle("Time Until");
        this.setSize(1000, 500);

        // other initializers
            // close the program when the X button is pressed
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // button pressed listener
        newEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("button pressed");

            }
        });
    }


}
