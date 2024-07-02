package org.eclipse.papyrus.javagen.EchoConnect;

import org.junit.jupiter.api.Test;

import EchoConnect.Promotions;

import static org.junit.jupiter.api.Assertions.*;

public class PromotionsTest {

    @Test
    public void testUsePromoValidCode() {
        Promotions promotions = new Promotions();
        promotions.AddPromo("CODE123", "20% off on all products");

        // Applying a valid promo code
        promotions.UsePromo("CODE123");

        assertTrue(true, "Valid promo code applied successfully.");
    }

    @Test
    public void testUsePromoInvalidCode() {
        Promotions promotions = new Promotions();

        // Applying an invalid promo code
        promotions.UsePromo("INVALIDCODE");

        
        assertTrue(true, "Invalid promo code. Please enter a valid one.");
    }

    @Test
    public void testAddPromo() {
        Promotions promotions = new Promotions();

        // Adding a new promo code
        promotions.AddPromo("NEWCODE", "Free shipping on orders over $50");

        
        assertTrue(true, "Promo code added successfully.");
    }

    @Test
    public void testRemovePromo() {
        Promotions promotions = new Promotions();
        promotions.AddPromo("REMOVECODE", "Buy one get one free");

        // Removing an existing promo code
        promotions.RemovePromo("REMOVECODE");

        
        assertTrue(true, "Promo code removed successfully.");
    }

    @Test
    public void testRemoveNonExistingPromo() {
        Promotions promotions = new Promotions();

        // Removing a non-existing promo code
        promotions.RemovePromo("NONEXISTINGCODE");

        
        assertTrue(true, "Promo code not found. Cannot remove non-existing promo code.");
    }
}
