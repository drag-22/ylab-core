package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void max(){
        var arr = new int[][]{{1,2},{4,5}};
        assertEquals(5,Main.max(arr));
    }
    @Test
    public void min(){
        var arr = new int[][]{{1,2},{4,5}};
        assertEquals(1,Main.min(arr));
    }
    @Test
    public void avg(){
        var arr = new int[][]{{1,2},{4,5}};
        assertEquals(3.0,Main.avg(arr));
    }

}
