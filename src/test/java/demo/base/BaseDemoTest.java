package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";
        int expected1 = 3;
        int expected2 = 3;
        assertEquals(expected, baseDemo.print());
        assertEquals(expected1, baseDemo.sum(1,2));
    }

    @Test
    public void should_return_sum_3(){
        BaseDemo baseDemo = new BaseDemo();
        int expected = 3;
        assertEquals(expected, baseDemo.sum(1,2));
    }

    @Test
    public void should_return_sum_6(){
        BaseDemo baseDemo = new BaseDemo();
        int expected = 6;
        assertEquals(expected, baseDemo.sum(3,3));
    }
}
