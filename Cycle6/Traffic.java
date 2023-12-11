import javax.swing.*;
import java.awt.*;

public class Traffic {
    JLabel light;
    JRadioButton red;
    JRadioButton yel;
    JRadioButton gr;
    public Traffic() {
        // Frame
        JFrame win = new JFrame("Traffic");
        win.setSize(400, 400);
        win.setLayout(new GridLayout(4,1));

        //label
        light = new JLabel();
        light.setOpaque(true);

        //red
        red = new JRadioButton("RED");
        red.setHorizontalAlignment(JRadioButton.CENTER);
        red.addActionListener(e -> light.setBackground(Color.RED));

        //yellow
        yel = new JRadioButton("YELLOW");
        yel.setHorizontalAlignment(JRadioButton.CENTER);
        yel.addActionListener(e -> light.setBackground(Color.YELLOW));

        //green
        gr = new JRadioButton("GREEN");
        gr.setHorizontalAlignment(JRadioButton.CENTER);
        gr.addActionListener(e -> light.setBackground(Color.GREEN));

        ButtonGroup btnG = new ButtonGroup();
        btnG.add(red);
        btnG.add(yel);
        btnG.add(gr);

        win.add(light);
        win.add(red);
        win.add(yel);
        win.add(gr);

        // Setup
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.getContentPane().setBackground(Color.BLACK);
        win.setVisible(true);
    }

    public static void main(String[] args) {
        new Traffic();
    }
}
