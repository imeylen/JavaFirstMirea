package ru.mirea.task5.animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        JPanel container = new JPanel();
        CardLayout cardLayout = new CardLayout();

        ActionListener actionListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cardLayout.next(container);
            }
        };

        container.setLayout(cardLayout);

        for(int counter = 1; counter <= 10; counter++)
        {
            Animation figure = new Animation(0,0,800,480);
            //figure.SetColor(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255));

            JButton jButton = new JButton();
            jButton.add(figure.GetJFectangle());
            jButton.addActionListener(actionListener);
            container.add(jButton);
        }

        JFrame jFrame = new JFrame("Animation");
        jFrame.setPreferredSize(new Dimension(800,500));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(container, BorderLayout.CENTER);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}