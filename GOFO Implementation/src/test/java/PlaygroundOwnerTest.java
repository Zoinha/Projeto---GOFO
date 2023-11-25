package System;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PlaygroundOwnerTest {

    private PlaygroundOwner playgroundOwner;

    @Before
    public void setUp() {
        playgroundOwner = new PlaygroundOwner();
    }

    @Test
    public void testSetBalance() {
        eWallet wallet = new eWallet();
        wallet.setBalance(1000);
        playgroundOwner.setBalance(wallet);
        assertEquals(1000, playgroundOwner.getMyBalance());
    }

    @Test
    public void testAddPlayground() {
        Playground playground = new Playground();
        playgroundOwner.addPlayground(playground);
        assertTrue(playgroundOwner.getListOfPlayground().contains(playground));
    }

    @Test
    public void testExistPlayground() {
        Playground playground = new Playground();
        playground.setName("Playground1");
        playgroundOwner.addPlayground(playground);
        assertTrue(playgroundOwner.existPlayground("Playground1"));
        assertFalse(playgroundOwner.existPlayground("NonExistentPlayground"));
    }

    @Test
    public void testUpdatePlaygroundName() {
        Playground playground = new Playground();
        playground.setName("Playground1");
        playgroundOwner.addPlayground(playground);

        playgroundOwner.updatePlaygroundName("Playground1");
        assertEquals("Playground1", playground.getName());

        playgroundOwner.updatePlaygroundName("NonExistentPlayground");
        // You may want to assert something about the state of the object after this
    }

    @Test
    public void testUpdatePlaygroundStatus() {
        Playground playground = new Playground();
        playground.setName("Playground1");
        playground.setStatus("available");
        playgroundOwner.addPlayground(playground);

        playgroundOwner.updatePlaygroundStatus("Playground1", "10:00", "Monday");
        // You may want to assert something about the state of the object after this

        playgroundOwner.updatePlaygroundStatus("NonExistentPlayground", "10:00", "Monday");
        // You may want to assert something about the state of the object after this
    }

    @Test
    public void testGetListOfPlayground() {
        Playground playground1 = new Playground();
        Playground playground2 = new Playground();
        playground1.setName("Playground1");
        playground2.setName("Playground2");

        playgroundOwner.addPlayground(playground1);
        playgroundOwner.addPlayground(playground2);

        assertTrue(playgroundOwner.getListOfPlayground().contains("Playground1"));
        assertTrue(playgroundOwner.getListOfPlayground().contains("Playground2"));
    }

    @Test
    public void testAddRecieveMsg() {
        playgroundOwner.addRecieveMsg("Message1");
        playgroundOwner.addRecieveMsg("Message2");

        assertTrue(playgroundOwner.getRecieveMsg().contains("Message1"));
        assertTrue(playgroundOwner.getRecieveMsg().contains("Message2"));
    }

    @Test
    public void testPayMoney() {
        Playground playground = new Playground();
        playground.setName("Playground1");
        playground.setPrice(50);
        playgroundOwner.addPlayground(playground);

        eWallet wallet = new eWallet();
        wallet.setBalance(100);
        playgroundOwner.setBalance(wallet);

        assertEquals(100, playgroundOwner.getMyBalance());

        int amountPaid = playgroundOwner.payMoney("Playground1", 2);
        assertEquals(100 - 2 * 50, playgroundOwner.getMyBalance());
        assertEquals(2 * 50, amountPaid);

        int amountPaidNonExistentPlayground = playgroundOwner.payMoney("NonExistentPlayground", 2);
        assertEquals(100 - 2 * 50, playgroundOwner.getMyBalance());
        assertEquals(0, amountPaidNonExistentPlayground);
    }

    @Test
    public void testDisplayRecieveMsg() {
        playgroundOwner.addRecieveMsg("Message1");
        playgroundOwner.addRecieveMsg("Message2");

        // Assuming you have appropriate output capturing or mocking
        // You may want to assert something about the output after this
        playgroundOwner.displayRecieveMsg();
    }
}
