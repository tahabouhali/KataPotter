import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kataPotterTest {
    private KataPotter kataPotter;
    @BeforeEach
    public void setUp(){
        kataPotter = new KataPotter();
    }

    @Test
    public void shoudReturn8ifOneBOOK(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        assertEquals(8.0,kataPotter.calculPrix((ArrayList) basket));
    }

    @Test
    public void testIfbasketContains3ElementsWith0Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L2");
        basket.add("L3");
        assertEquals(8 * 3 * 0.9,kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains4ElementsWith0Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L2");
        basket.add("L3");
        basket.add("L4");
        assertEquals(8 * 4 * 0.8,kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains5ElementsWith0Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L2");
        basket.add("L3");
        basket.add("L4");
        basket.add("L5");
        assertEquals(8 * 5 * 0.75,kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains2ElementsWith2Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        assertEquals(2 * (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains6ElementsWith2Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        basket.add("L3");
        basket.add("L4");
        assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains3ElementsWith1Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        assertEquals(8 + (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains4ElementsWith2Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        assertEquals(2 * (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testIfbasketContains5ElementsWith2Dup(){
        List basket = new ArrayList<String>();
        basket.add("L1");
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        basket.add("L3");
        basket.add("L4");
        assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testEdge(){
        List basket = new ArrayList<String>();
        basket.add("L0");
        basket.add("L0");
        basket.add("L1");
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        basket.add("L3");
        basket.add("L4");
        assertEquals(2 * (8 * 4 * 0.8),kataPotter.calculPrix((ArrayList) basket));
    }
    @Test
    public void testEdge1(){
        List basket = new ArrayList<String>();
        basket.add("L0");
        basket.add("L0");
        basket.add("L0");
        basket.add("L0");
        basket.add("L0");
        basket.add("L1");
        basket.add("L1");
        basket.add("L1");
        basket.add("L1");
        basket.add("L1");
        basket.add("L2");
        basket.add("L2");
        basket.add("L2");
        basket.add("L2");
        basket.add("L3");
        basket.add("L3");
        basket.add("L3");
        basket.add("L3");
        basket.add("L3");
        basket.add("L4");
        basket.add("L4");
        basket.add("L4");
        basket.add("L4");
        assertEquals(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8),kataPotter.calculPrix((ArrayList) basket));
    }

}
