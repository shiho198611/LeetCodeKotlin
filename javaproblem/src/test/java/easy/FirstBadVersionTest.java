package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion;

    @Before
    public void initTest() {
        firstBadVersion = Mockito.spy(FirstBadVersion.class);
    }

    @Test
    public void firstBadVersion_Test01() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).then(mockBadVersions(3));

        int result = firstBadVersion.firstBadVersion(5);

        Assert.assertEquals(result, 4);
    }

    @Test
    public void firstBadVersion_Test02() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).then(mockBadVersions(3));

        int result = firstBadVersion.firstBadVersion(6);

        Assert.assertEquals(result, 4);
    }

    @Test
    public void firstBadVersion_Test03() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).then(mockBadVersions(1702766718));

        int result = firstBadVersion.firstBadVersion(2126753390);

        Assert.assertEquals(result, 1702766719);
    }

    @Test
    public void firstBadVersion_Test04() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).then(mockBadVersions(1));

        int result = firstBadVersion.firstBadVersion(2);

        Assert.assertEquals(result, 2);
    }

    @Test
    public void firstBadVersion_Test05() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).then(mockBadVersions(1));

        int result = firstBadVersion.firstBadVersion(3);

        Assert.assertEquals(result, 2);
    }

    @Test
    public void firstBadVersion_Test06() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).thenReturn(true);

        int result = firstBadVersion.firstBadVersion(2);

        Assert.assertEquals(result, 1);
    }

    @Test
    public void firstBadVersion_Test07() {

        Mockito.when(firstBadVersion.isBadVersion(Mockito.anyInt())).thenReturn(true);

        int result = firstBadVersion.firstBadVersion(1);

        Assert.assertEquals(result, 1);
    }


    private Answer<Boolean> mockBadVersions(int badIndex) {
        return invocation -> {
            int index = (int)invocation.getArguments()[0];
            return index > badIndex;
        };
    }

}
