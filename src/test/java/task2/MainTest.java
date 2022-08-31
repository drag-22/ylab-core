package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {
    @Test
    public void sortTest(){
        int[] array = {5,6,3,2,5,1,4,9};
        Main.sort(array);
        var expected= new int[]{1, 2, 3, 4, 5, 5, 6, 9};
        assertArrayEquals(expected,array);
    }
}
