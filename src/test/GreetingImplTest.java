package test;

import Classes.GreetingImpl;
import Classes.IGreeting;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Raffi on 12/29/2015.
 */
public class GreetingImplTest {

    @Test
    public void testGreet() {
        //Should return a valid output.
        IGreeting greeting = new GreetingImpl();
        String result = greeting.greet("Junit");
        assertNotNull(result);
        assertEquals("Hello Junit", result);

    }
}