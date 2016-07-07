package primefactor;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeFactorTest {

    private static List list(int... ints) {
        List<Integer> list = new ArrayList();
        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactor.generate(1));
    }

    @Test
    public void given_a_prime_number_should_return_that_number() {
        assertEquals(list(2), PrimeFactor.generate(2));
        assertEquals(list(3), PrimeFactor.generate(3));
        assertEquals(list(5), PrimeFactor.generate(5));
        assertNotEquals(list(514), PrimeFactor.generate(514));
    }

    @Test
    public void testFour() {
        assertEquals(list(2, 2), PrimeFactor.generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(list(2, 3), PrimeFactor.generate(6));
    }

    @Test
    public void testEight() {
        assertEquals(list(2, 2, 2), PrimeFactor.generate(8));
    }
    
     @Test
    public void testFortyTwo() {
        assertEquals(list(2, 3, 7), PrimeFactor.generate(42));
    }

}
