package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {
    public Registration() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        this.setSize(350, 250);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(panel);
        this.setTitle("App Registration");
        panel.setLayout(null);


        JMenuBar jmb = new JMenuBar();
        this.setJMenuBar(jmb);

        JMenu registrationform = new JMenu("Registration Form");
        jmb.add(registrationform);
        JMenuItem fill = new JMenuItem("Fill");
        registrationform.add(fill);
        JMenuItem finish = new JMenuItem("Finish");
        registrationform.add(finish);

        JMenu edit = new JMenu("Edit");
        jmb.add(edit);
        JMenuItem save = new JMenuItem("Save");
        edit.add(save);

        JLabel userlabel = new JLabel("Name:");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel phonelabel = new JLabel("Phone:");
        phonelabel.setBounds(10, 50, 80, 25);
        panel.add(phonelabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(100, 50, 165, 25);
        panel.add(phoneText);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 80, 80, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 80, 165, 25);
        panel.add(emailText);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(10, 110, 80, 25);
        panel.add(addressLabel);

        JTextField addressText = new JTextField(20);
        addressText.setBounds(100, 110, 165, 25);
        panel.add(addressText);

        JButton button = new JButton("Finished Registration");
        button.setBounds(115, 150, 140, 25);
        button.addActionListener(this);
        panel.add(button);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Client Registered");
    }

    public static void main(String[] args) {
        new Registration();
    }
}
