import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SolutionTest {
    @Test
    public void deleteAndEarnTest1() {
        Assert.assertEquals(6, new Solution().deleteAndEarn(new int[]{3, 4, 2}));
    }

    @Test
    public void arrayToMapTest1() {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 4, 4, 4, 5, 5, 5, 5};
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 4);
        expected.put(3, 3);
        expected.put(4, 16);
        expected.put(5, 25);

        Assert.assertEquals(expected, new Solution().arrayToMap(array));
    }
}

