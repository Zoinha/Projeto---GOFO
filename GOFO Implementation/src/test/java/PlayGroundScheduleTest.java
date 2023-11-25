package System;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PlayGroundScheduleTest {

    private PlayGroundSchedule playGroundSchedule;

    @Before
    public void setUp() {
        playGroundSchedule = new PlayGroundSchedule();
    }

    @Test
    public void testSetSchedule() {
        // Assuming appropriate output capturing or mocking
        // You may want to assert something about the output after this
        playGroundSchedule.setschedule();
    }

    @Test
    public void testSetPrice() {
        String temp = "50";
        SystemUI obj = new SystemUI();
        obj.setInput(temp);
        playGroundSchedule.setPrice();
        assertEquals(50, playGroundSchedule.getTimeSlotPerHour());
    }

    @Test
    public void testDisplayFreeSlots() {
        // Assuming appropriate output capturing or mocking
        // You may want to assert something about the output after this
        playGroundSchedule.displayFreeSlots();
    }

    @Test
    public void testGetTimeSlotPerHour() {
        playGroundSchedule.setTimeSlotPerHour(60);
        assertEquals(60, playGroundSchedule.getTimeSlotPerHour());
    }

    @Test
    public void testGetBegin() {
        playGroundSchedule.setBegin(9);
        assertEquals(9, playGroundSchedule.getBegin());
    }

    @Test
    public void testGetEnd() {
        playGroundSchedule.setEnd(17);
        assertEquals(17, playGroundSchedule.getEnd());
    }

    @Test
    public void testGetDayIndex() {
        assertEquals(1, playGroundSchedule.getDayIndex("sunday"));
        assertEquals(2, playGroundSchedule.getDayIndex("monday"));
        assertEquals(3, playGroundSchedule.getDayIndex("tuesday"));
        assertEquals(4, playGroundSchedule.getDayIndex("wendesday"));
        assertEquals(5, playGroundSchedule.getDayIndex("thursday"));
        assertEquals(6, playGroundSchedule.getDayIndex("friday"));
        assertEquals(7, playGroundSchedule.getDayIndex("saturday"));
        assertEquals(-1, playGroundSchedule.getDayIndex("invalidDay"));
    }

    @Test
    public void testBookSlot() {
        playGroundSchedule.setschedule();
        playGroundSchedule.bookSlot("Player1", "9", "sunday");
        assertTrue(playGroundSchedule.getSchedule().get(0).get(1).equalsIgnoreCase("Player1"));
    }

    @Test
    public void testUpdateSlot() {
        playGroundSchedule.setschedule();
        playGroundSchedule.bookSlot("Player1", "9", "sunday");
        playGroundSchedule.updateSlot("sunday", "9", "Player2");
        assertTrue(playGroundSchedule.getSchedule().get(0).get(1).equalsIgnoreCase("Player2"));
    }
}
