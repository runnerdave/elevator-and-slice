import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by runnerdave on 17/10/16.
 */
public class SliceTaskTest {
    @Test
    public void test03() {
        SliceTask cdr = new SliceTask();
        assertEquals(4, cdr.solution(new int[]{5, 4, 4, 5, 0, 12}));
    }

    @Test
    public void test04() {
        SliceTask cdr = new SliceTask();
        assertEquals(3, cdr.solution(new int[]{5, 4, 5, 0, 12}));
    }

    @Test
    public void test05() {
        SliceTask cdr = new SliceTask();
        assertEquals(0, cdr.solution(new int[]{5, 4, 1, 0, 12}));
    }

    @Test
    public void test06() {
        SliceTask cdr = new SliceTask();
        assertEquals(2, cdr.solution(new int[]{5, 5, 5, 5, 5}));
    }
}
