package System;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testSetBalance() {
        player.setBalance(200);
        assertEquals(200, player.getBalance());
    }

    @Test
    public void testDeposit() {
        player.setBalance(100);
        player.getMoney(50);
        assertEquals(150, player.getBalance());
    }

    @Test
    public void testWithdraw() {
        player.setBalance(100);
        player.withdraw(50);
        assertEquals(50, player.getBalance());
    }

    @Test
    public void testCancelBooking() {
        // You need to set up Bookedslots for this test
        // For simplicity, I'm assuming a structure like [["playground", "time"]]
        player.Bookedslots.add(new ArrayList<>(Arrays.asList("playground1", "time1")));
        player.CancelBooking("playground1", "time1");
        assertEquals(0, player.Bookedslots.size());
    }

    @Test
    public void testBookingSlots() {
        player.bookingSlots("time1", "playground1");
        // You may want to assert something about the state of Bookedslots after this
    }

    @Test
    public void testCreateTeam() {
        Player teammate = new Player();
        player.createTeam(teammate);
        assertEquals(1, player.team.size());
        assertEquals(teammate, player.team.get(0));
    }

    @Test
    public void testEditPlayerInfo() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the state of the player object after this
        player.editPlayerinfo();
    }

    @Test
    public void testGetMoney() {
        player.getMoney(50);
        assertEquals(50, player.eWallet.getBalance());
    }

    @Test
    public void testAddInbox() {
        player.addInbox("Message 1");
        assertEquals(1, player.Inbox.size());
        assertEquals("Message 1", player.Inbox.get(0));
    }

    @Test
    public void testViewInbox() {
        // Assuming you have appropriate user input mocking/stubbing
        // You may want to assert something about the output or state of the player object after this
        player.viewInbox();
    }
}
