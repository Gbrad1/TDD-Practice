import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main newMain;


    @org.junit.Before
    public void setUp() throws Exception {
        newMain = new Main();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void whatever() {
        //Given
        Integer[] testArray = {1, 2, 3, 4};
        Integer expected = 50;
        //When
        Integer actual = newMain.getSum(testArray);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newTest() {
        //Given
        Integer[] testArray = {1, 2, 3, 4};
        Integer expected = 50;
        //When
        Integer actual = newMain.fasterSum(testArray);
        //Then
        Assert.assertEquals(expected, actual);
    }
}