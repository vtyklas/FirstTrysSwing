package Swing;

import javax.swing.*;
import java.awt.*;


public class SetLayout {

    public final String[] buttonNames = {"Przycisk 1", "P 2", "Wiekszy przycisk numer 3", "Przycisk 4", "P5"};
    public final String[] borderLayoutPos = {"Center","East","North","West","South"};
    public SetLayout() {
        SwingUtilities.invokeLater(
                () -> createGUI()
        );
    }


    protected void createGUI() {
        JFrame frame = new JFrame("Style w Swingu");
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int hight = Toolkit.getDefaultToolkit().getScreenSize().height;

        frame.setSize(width / 4, hight / 4);

        int frameWidth = frame.getSize().width;
        int frameHeight = frame.getSize().height;

        frame.setLocation((width - frameWidth) / 2, (hight - frameHeight) / 2);

        String choice = "A";


        switch (choice) {
            case "A":
                BorderLayout bl = new BorderLayout();
                frame.setLayout(bl);
                for (int i = 0; i < 5; i++) {

                    bl.addLayoutComponent(frame.add(new JButton(buttonNames[i])),borderLayoutPos[i]);

                }
                frame.pack();
                break;
        }

    }
}



