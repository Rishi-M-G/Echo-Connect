package org.eclipse.papyrus.javagen.EchoConnect;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import EchoConnect.Payment;

class PaymentAndBillingTest {

    @Test
    void testSetDefaultMethod_CreditCard() {
        Payment payment = new Payment(1, "Pending", new Date(), "", "credit card");
        payment.SetDefaultMethod();
        assertEquals("Credit Card", payment.PaymentMethod);
    }

    @Test
    void testSetDefaultMethod_BankTransfer() {
        Payment payment = new Payment(1, "Pending", new Date(), "", "bank transfer");
        payment.SetDefaultMethod();
        assertEquals("Bank Transfer", payment.PaymentMethod);
    }

    @Test
    void testSetDefaultMethod_Wallet() {
        Payment payment = new Payment(1, "Pending", new Date(), "", "wallet");
        payment.SetDefaultMethod();
        assertEquals("Wallet", payment.PaymentMethod);
    }

   
    void testInitiatePayment_UseDefaultMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Payment payment = new Payment(1, "Pending", new Date(), "", "credit card");
        payment.InitiatePayment();

        System.setOut(System.out);
        assertTrue(outputStream.toString().contains("Paying Using default payment method: Credit Card"));
        assertEquals("Completed", payment.PaymentStatus);
    }
}