import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestEightBall {
    EightBall eightBall;

    @Before
    public void before() {
        eightBall = new EightBall();

    }

    @Test
    public void hasAnswer() {
        assertEquals(0, eightBall.getCount());
    }

    @Test
    public void hasAnotherAnswer() {
        eightBall.addResult("Not Likely!");
        assertEquals(1, eightBall.getCount());
    }

    @Test
    public void canReturnResult() {
        eightBall.addResult("Not Likely!");
        eightBall.addResult("You Bet!");
        eightBall.addResult("Try Again");
        System.out.println(eightBall.shake());
        assertNotNull(eightBall.shake());
    }

    @Test
    public void canRemoveItem() {
        eightBall.addResult("Not Likely!");
        eightBall.addResult("You Bet!");
        eightBall.addResult("Try Again");
        eightBall.remove("Try Again");
        assertEquals(2, eightBall.getCount());
    }
}
