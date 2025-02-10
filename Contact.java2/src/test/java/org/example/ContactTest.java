package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    private JButton addButton;
    private JButton backButton;
    private JButton viewButton;
    private Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact();
        addButton = new JButton("Add New Contact");
        backButton = new JButton("Back to List");
        viewButton = new JButton("View Details");

        addButton.addActionListener(contact);
        backButton.addActionListener(e -> System.out.println("Returning to Contact List"));
    }

    @Test
    void testAddNewContactButtonAction() {
        assertEquals(1, addButton.getActionListeners().length);
        assertDoesNotThrow(() -> addButton.doClick());
    }

    @Test
    void testBackToListButtonAction() {
        assertEquals(1, backButton.getActionListeners().length);
        assertDoesNotThrow(() -> backButton.doClick());
    }

    @Test
    void testViewDetailsButtonExists() {
        assertNotNull(viewButton);
    }

    @Test
    void testActionPerformed() {
        assertDoesNotThrow(() -> contact.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Test")));
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void actionPerformed() {
    }
}
