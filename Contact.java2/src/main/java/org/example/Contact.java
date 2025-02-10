package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   class Contact implements ActionListener {
    public static void main(String[] args){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        JLabel userlabel = new JLabel("Name:");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        JTextField userText = new JTextField();
        userText.setBounds(100,20,165,25);
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

        JButton backButton = new JButton("Back to List");
        backButton.setBounds(10, 120, 130, 25);
        backButton.addActionListener(e -> {

            System.out.println("Returning to Contact List");
        });
        panel.add(backButton);

        JButton button = new JButton("Add New Contact");
        button.setBounds(150, 120, 140, 25);
        button.addActionListener(new Contact());
        panel.add(button);

        JButton viewButton = new JButton("View Details");
        viewButton.setBounds(100, 160, 150, 25);
        panel.add(viewButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Contact Saved");
    }
}
