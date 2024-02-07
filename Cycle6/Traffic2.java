import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3,1));

        Container pane = frame.getContentPane();
        ButtonGroup grp = new ButtonGroup();
        JRadioButton btn1 = new JRadioButton("RED");
        JRadioButton btn2 = new JRadioButton("YELLOW");
        JRadioButton btn3 = new JRadioButton("GREEN");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        grp.add(btn1);
        grp.add(btn2);
        grp.add(btn3);

        btn1.setHorizontalAlignment(JRadioButton.CENTER);
        btn2.setHorizontalAlignment(JRadioButton.CENTER);
        btn3.setHorizontalAlignment(JRadioButton.CENTER);

        btn1.setOpaque(false);
        btn2.setOpaque(false);
        btn3.setOpaque(false);

        btn1.addActionListener(e->pane.setBackground(Color.RED));
        btn2.addActionListener(e->pane.setBackground(Color.YELLOW));
        btn3.addActionListener(e->pane.setBackground(Color.GREEN));

    }
}
