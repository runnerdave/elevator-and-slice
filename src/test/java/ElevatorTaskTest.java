import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by runnerdave on 17/10/16.
 */
public class ElevatorTaskTest {
    @Test
    public void test03() {
        ElevatorTask cdr = new ElevatorTask();
        assertEquals(6, cdr.solution(new int[]{40, 40, 100, 80, 20}, new int[]{3, 3, 2, 2, 3}, 3, 5, 200));
    }

    @Test
    public void test04() {
        ElevatorTask cdr = new ElevatorTask();
        assertEquals(5, cdr.solution(new int[]{60, 80, 40}, new int[]{2, 3, 5}, 5, 2, 200));
    }

    @Test
    public void test05() {
        ElevatorTask cdr = new ElevatorTask();
        assertEquals(2, cdr.solution(new int[]{60}, new int[]{2}, 5, 2, 200));
    }

    @Test
    public void test06() {
        ElevatorTask cdr = new ElevatorTask();
        assertEquals(6, cdr.solution(new int[]{60, 80, 40}, new int[]{2, 3, 5}, 5, 2, 80));
    }
}
