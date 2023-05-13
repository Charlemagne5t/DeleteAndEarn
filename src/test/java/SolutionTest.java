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
    public void deleteAndEarnTest2() {
        Assert.assertEquals(9, new Solution().deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }
    @Test
    public void deleteAndEarnTest3() {
        Assert.assertEquals(18, new Solution().deleteAndEarn(new int[]{1,1,1,2,4,5,5,5,6}));
    }
}

