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
        List panier = new ArrayList<String>();
        panier.add("L1");
        assertEquals(8.0,kataPotter.calculPrix((ArrayList) panier));
    }

    @Test
    public void testIfPanierContains3ElementsWith0Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L2");
        panier.add("L3");
        assertEquals(8 * 3 * 0.9,kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains4ElementsWith0Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L2");
        panier.add("L3");
        panier.add("L4");
        assertEquals(8 * 4 * 0.8,kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains5ElementsWith0Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L2");
        panier.add("L3");
        panier.add("L4");
        panier.add("L5");
        assertEquals(8 * 5 * 0.75,kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains2ElementsWith2Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        assertEquals(2 * (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains6ElementsWith2Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        panier.add("L3");
        panier.add("L4");
        assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains3ElementsWith1Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        assertEquals(8 + (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains4ElementsWith2Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        assertEquals(2 * (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testIfPanierContains5ElementsWith2Dup(){
        List panier = new ArrayList<String>();
        panier.add("L1");
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        panier.add("L3");
        panier.add("L4");
        assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95),kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testEdge(){
        List panier = new ArrayList<String>();
        panier.add("L0");
        panier.add("L0");
        panier.add("L1");
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        panier.add("L3");
        panier.add("L4");
        assertEquals(2 * (8 * 4 * 0.8),kataPotter.calculPrix((ArrayList) panier));
    }
    @Test
    public void testEdge1(){
        List panier = new ArrayList<String>();
        panier.add("L0");
        panier.add("L0");
        panier.add("L0");
        panier.add("L0");
        panier.add("L0");
        panier.add("L1");
        panier.add("L1");
        panier.add("L1");
        panier.add("L1");
        panier.add("L1");
        panier.add("L2");
        panier.add("L2");
        panier.add("L2");
        panier.add("L2");
        panier.add("L3");
        panier.add("L3");
        panier.add("L3");
        panier.add("L3");
        panier.add("L3");
        panier.add("L4");
        panier.add("L4");
        panier.add("L4");
        panier.add("L4");
        assertEquals(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8),kataPotter.calculPrix((ArrayList) panier));
    }

}
