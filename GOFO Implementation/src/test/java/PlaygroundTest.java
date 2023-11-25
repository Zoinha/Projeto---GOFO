package System;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void setUp() {
        playground = new Playground();
    }

    @Test
    public void testSetCancellationPeriod() {
        playground.setCancellationPeriod(7);
        assertEquals(7, playground.getCancellationPeriod());
    }

    @Test
    public void testBookingTheSlot() {
        playground.setStatus("available");
        playground.bookingTheSlot("Player1", "10:00", "Monday");
        // You may want to assert something about the state of the object or output after this
    }

    @Test
    public void testCancelBooking() {
        playground.cancelBooking("Monday", "10:00");
        // You may want to assert something about the state of the object after this
    }

    @Test
    public void testFreeSlots() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the output or state of the object after this
        playground.freeSlots();
    }

    @Test
    public void testSetName() {
        playground.setName("Playground1");
        assertEquals("Playground1", playground.getName());
    }

    @Test
    public void testSetLocation() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        playground.setLocation();
    }

    @Test
    public void testSetPrice() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        playground.setPrice();
    }

    @Test
    public void testSetStatus() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        playground.setStatus();
    }

    @Test
    public void testGetStatus() {
        playground.setStatus("available");
        assertEquals("available", playground.getStatus());
    }

    @Test
    public void testGetLocation() {
        playground.setLocation();
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        assertEquals("SomeLocation", playground.getLocation());
    }

    @Test
    public void testGetPrice() {
        playground.setPrice();
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        assertEquals(50, playground.getPrice());
    }

    @Test
    public void testGetSlotsBegin() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        assertEquals(8, playground.getSlotsBegin());
    }

    @Test
    public void testGetSlotsEnd() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the object after this
        assertEquals(18, playground.getSlotsEnd());
    }

    @Test
    public void testGetOwner() {
        playground.setOwner("John Doe");
        assertEquals("John Doe", playground.getOwner());
    }
}
