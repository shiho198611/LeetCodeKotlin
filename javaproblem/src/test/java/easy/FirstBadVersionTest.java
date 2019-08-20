package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion;

    @Before
    public void initTest() {
        firstBadVersion = Mockito.spy(FirstBadVersion.class);
    }

    @Test
    public void firstBadVersion_Test01() {

        Mockito.when(firstBadVersion.isBadVersion(3)).thenReturn(false);
        Mockito.when(firstBadVersion.isBadVersion(4)).thenReturn(true);
        Mockito.when(firstBadVersion.isBadVersion(5)).thenReturn(true);

        int result = firstBadVersion.firstBadVersion(5);

        System.out.println(result);

        Assert.assertEquals(result, 4);
    }

}
