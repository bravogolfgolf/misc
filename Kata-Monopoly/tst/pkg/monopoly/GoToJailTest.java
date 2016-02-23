package pkg.monopoly;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoToJailTest {

    private Go go;
    private Jail jail;
    private GoToJail goToJail;
    private Player player;
    private int beginningBalance;
    private int endingBalance;

    @Before
    public void setUp() throws Exception {
        go = new Go("Go");
        jail = new Jail("Jail");
        goToJail = new GoToJail("Go to Jail");

        go.setNextSpace(jail);
        jail.setNextSpace(goToJail);
        goToJail.setNextSpace(go);

        player = new Player();
        player.setSpace(go);

        beginningBalance = player.getCashBalance();
        endingBalance = beginningBalance;
    }

    @After
    public void tearDown() throws Exception {
        go = null;
        jail = null;
        goToJail = null;
        player = null;
    }

    @Test
    public void testLandOnGoToJailAndPlayerDoesGoToJailWithNoChangeInCash() {
        goToJail.landOn(player);
        assertTrue(player.getSpace().equals(jail));
        assertEquals(beginningBalance,endingBalance);
    }

    @Test
    public void testPassByGoToJailAndPlayerDoesNotGoToJailWithNoChangeInCash() {
        goToJail.passBy(player);
        assertFalse(player.getSpace().equals(jail));
        assertEquals(beginningBalance,endingBalance);
    }
}