package System;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class userProfileTest {

    private userProfile user;

    @Before
    public void setUp() {
        user = new userProfile();
    }

    @Test
    public void testSetPayment() {
        eWallet wallet = new eWallet();
        user.setPayment(wallet);
        assertEquals(wallet, user.getService());
    }

    @Test
    public void testSetFName() {
        user.setFName("John");
        assertEquals("John", user.getFName());
    }

    @Test
    public void testSetLName() {
        user.setLName("Doe");
        assertEquals("Doe", user.getLName());
    }

    @Test
    public void testSetID() {
        user.setID(123);
        assertEquals(123, user.getID());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("password123");
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testSetPhone() {
        user.setPhone(123456789);
        assertEquals(123456789, user.getPhone());
    }

    @Test
    public void testSetLocation() {
        user.setLocation("City");
        assertEquals("City", user.getLocation());
    }

    @Test
    public void testSetRule() {
        user.setRule("User");
        assertEquals("User", user.getRule());
    }

    @Test
    public void testGetFullName() {
        user.setFName("John");
        user.setLName("Doe");
        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void testGetID() {
        user.setID(456);
        assertEquals(456, user.getID());
    }

    @Test
    public void testGetPassword() {
        user.setPassword("securePassword");
        assertEquals("securePassword", user.getPassword());
    }

    @Test
    public void testGetEmail() {
        user.setEmail("user@example.com");
        assertEquals("user@example.com", user.getEmail());
    }

    @Test
    public void testGetPhone() {
        user.setPhone(987654321);
        assertEquals(987654321, user.getPhone());
    }

    @Test
    public void testGetRule() {
        user.setRule("Admin");
        assertEquals("Admin", user.getRule());
    }
}
