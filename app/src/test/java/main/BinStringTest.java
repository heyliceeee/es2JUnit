package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;


public class BinStringTest {
    private BinString binString;

    @BeforeEach
    void setUp(){

        binString = new BinString();
    }

    @Test
    void testSumFunction(){

        int excepted = 0;
        assertEquals(excepted, binString.sum(""), "\"\" should be 0");

        excepted = 100;
        assertEquals(excepted, binString.sum("d"), "d should be 100");

        excepted = 265;
        assertEquals(excepted, binString.sum("Add"), "Add should be 265");
    }

    @Test
    void testBinariseFunction(){

        String expected = "101";
        assertEquals(expected, binString.binarise(5), "5 should be 101");

        expected = "11111100";
        assertEquals(expected, binString.binarise(252), "252 should be 11111100");
    }

    @Test
    void testTotalConversion(){

        String expected = "1000001";
        assertEquals(expected, binString.convert("A"), "A should be 1000001");
    }
}
