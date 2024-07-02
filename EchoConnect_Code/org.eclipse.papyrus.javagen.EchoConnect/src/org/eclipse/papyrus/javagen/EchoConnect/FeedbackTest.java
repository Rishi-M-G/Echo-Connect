package org.eclipse.papyrus.javagen.EchoConnect;

import org.junit.jupiter.api.Test;

import EchoConnect.Feedback;

import static org.junit.jupiter.api.Assertions.*;

public class FeedbackTest {

    @Test
    public void testGiveFeedback() {
        Feedback feedback = new Feedback();

        // Giving feedback
        feedback.GiveFeedback("Great service!");

        // Check if the feedback is added to the list
        assertEquals(1, feedback.getCustomerFeedback().size());
        assertTrue(feedback.getCustomerFeedback().contains("Great service!"));
    }

    @Test
    public void testGiveMultipleFeedback() {
        Feedback feedback = new Feedback();

        // Giving multiple feedback
        feedback.GiveFeedback("Excellent job!");
        feedback.GiveFeedback("Prompt response!");

        // Check if all feedback are added to the list
        assertEquals(2, feedback.getCustomerFeedback().size());
        assertTrue(feedback.getCustomerFeedback().contains("Excellent job!"));
        assertTrue(feedback.getCustomerFeedback().contains("Prompt response!"));
    }
}
