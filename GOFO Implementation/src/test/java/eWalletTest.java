package System;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class eWalletTest {

    @Test
    public void testDeposit() {
        eWallet wallet = new eWallet();
        wallet.setBalance(100);

        wallet.deposit(50);

        assertEquals(150, wallet.getBalance());
    }

    @Test
    public void testWithdraw() {
        eWallet wallet = new eWallet();
        wallet.setBalance(100);

        wallet.withdraw(50);

        assertEquals(50, wallet.getBalance());
    }

    @Test
    public void testSetBalance() {
        eWallet wallet = new eWallet();
        wallet.setBalance(200);

        assertEquals(200, wallet.getBalance());
    }
}
