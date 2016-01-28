package test;

import Classes.GreetingImpl;
import Classes.Greeting;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Raffi on 12/29/2015.
 */

/*Test methods should always be void. Make sure to give meaningful names.
* It's a good habit to test separately for different scenarios.*/
public class GreetingImplTest {

    @Test
    public void testGreet() {
        //Should return a valid output.
        Greeting greeting = new GreetingImpl();
        String result = greeting.greet("Junit");
        assertNotNull(result);
        assertEquals("Hello Junit", result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void greetExceptionForNull() {
        /*The greet should throw an exception for name is null.*/
        Greeting greeting = new GreetingImpl();
        greeting.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetExceptionForEmptyString() {
        /*The greet should throw an exception for name is null.*/
        Greeting greeting = new GreetingImpl();
        greeting.greet("");
    }

}