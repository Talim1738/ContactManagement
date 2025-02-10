package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

class ContactTestIntegration {

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
    void testAddNewContactIntegration() {
        assertEquals(1, addButton.getActionListeners().length);
        addButton.doClick();

    }

    @Test
    void testBackToListIntegration() {
        assertEquals(1, backButton.getActionListeners().length);
        backButton.doClick();

    }

    @Test
    void testViewDetailsButtonIntegration() {
        assertNotNull(viewButton);

    }

    @Test
    void testActionPerformedIntegration() {
        assertDoesNotThrow(() -> contact.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Test")));

    }
}
