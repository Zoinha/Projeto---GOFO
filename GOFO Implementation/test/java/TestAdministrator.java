import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAdministrator {

    private Administrator admin;

    @Before
    public void setUp() {
        admin = new Administrator();
    }

    @Test
    public void testGetApproved() {
        assertNotNull(admin.Approved);
        assertEquals(0, admin.Approved.size());
    }

    @Test
    public void testApprovePlayground() {
        // Simulate adding a playground to the Requested list
        Playground playground = new Playground();
        admin.Requested.add(playground);

        // Simulate user input for approval
        System.setIn(new ByteArrayInputStream("yes".getBytes()));

        admin.approvePlayground();

        assertEquals(0, admin.Requested.size());
        assertEquals(1, admin.Approved.size());
    }

    @Test
    public void testSearchByName() {
        // Simulate adding a playground to the Approved list
        Playground playground = new Playground();
        playground.setName("Test Playground");
        admin.Approved.add(playground);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        admin.searchByName("Test Playground");

        assertTrue(outContent.toString().contains("PlayGround Name : Test Playground"));
    }

}
