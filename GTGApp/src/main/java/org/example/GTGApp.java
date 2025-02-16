package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GTGApp {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("GTG");
        jf.setSize(300, 250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);

        jf.add(panel);
        JMenuBar jmb = new JMenuBar();
        jf.setJMenuBar(jmb);

        JMenu application = new JMenu("Application");
        jmb.add(application);

        JMenuItem open = new JMenuItem("Open ...");
        application.add(open);
        application.addSeparator();
        JMenuItem close = new JMenuItem("Close");
        application.add(close);

        JMenu edit = new JMenu("Edit");
        jmb.add(edit);
        JMenuItem finish = new JMenuItem("Finish");
        edit.add(finish);

        JMenu view = new JMenu("View");
        jmb.add(view);
        JMenuItem viewed = new JMenuItem("Viewed");
        view.add(viewed);

        JMenu navigate = new JMenu("Navigate");
        jmb.add(navigate);
        JMenuItem done = new JMenuItem("Done");
        navigate.add(done);

        JMenu about = new JMenu("About");
        jmb.add(about);
        JMenuItem exit = new JMenuItem("Exit");
        about.add(exit);

        jf.setVisible(true);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registration register = new Registration();
                register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                register.setVisible(true);
            }
        });
    }
}
