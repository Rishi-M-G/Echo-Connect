package org.eclipse.papyrus.javagen.EchoConnect;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import EchoConnect.Support;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SupportTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testRaiseTicket() {
    	Support support = new Support();
        Support.Ticket ticket = support.new Ticket(1, "Open", "High", "John Doe", "Support Team", "Description");
        ticket.RaiseTicket();
        assertEquals("New support ticket raised!", getConsoleOutput());
    }

    @Test
    public void testAssignTicket() {
    	Support support = new Support();
        Support.Ticket ticket = support.new Ticket(1, "Open", "High", "John Doe", "Support Team", "Description");
        ticket.AssignTicket();
        assertEquals("Ticket assigned to: Support Team", getConsoleOutput());
    }

    @Test
    public void testSetPriority() {
    	Support support = new Support();
        Support.Ticket ticket = support.new Ticket(1, "Open", "High", "John Doe", "Support Team", "Description");
        ticket.SetPriority();
        assertEquals("Priority set to: High", getConsoleOutput());
    }

    @Test
    public void testReassignTicket() {
    	Support support = new Support();
        Support.Ticket ticket = support.new Ticket(1, "Open", "High", "John Doe", "Support Team", "Description");
        ticket.ReassignTicket();
        assertEquals("Ticket reassigned to: John Doe", getConsoleOutput());
    }

    @Test
    public void testChangeTicketStatus() {
    	Support support = new Support();
        Support.Ticket ticket = support.new Ticket(1, "Open", "High", "John Doe", "Support Team", "Description");
        
        ticket.ChangeTicketStatus();
        assertEquals("Ticket status changed to: Open", getConsoleOutput());
    }

    

    @Test
    public void testAccessTicket() {
    	Support support = new Support();
        Support.Ticket ticket = support.new Ticket(1, "Open", "High", "John Doe", "Support Team", "Description");
        ticket.AccessTicket();
        assertEquals("Accessing ticket...", getConsoleOutput());
    }

    @Test
    public void testFilterTickets() {
        Support support = new Support();
        support.FilterTickets();
        assertEquals("Filtering tickets...", getConsoleOutput());
    }

    // Helper method to capture console output
    private String getConsoleOutput() {
        return outContent.toString().trim();
    }
}
