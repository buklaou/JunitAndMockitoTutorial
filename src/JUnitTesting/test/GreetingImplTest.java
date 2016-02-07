package JUnitTesting.test;

import JUnitTesting.Classes.GreetingImpl;
import JUnitTesting.Classes.Greeting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Raffi on 12/29/2015.
 */

/*Test methods should always be void. Make sure to give meaningful names.
* It's a good habit to JUnitTesting.Classes.test separately for different scenarios.*/

public class GreetingImplTest {

    private Greeting greeting;

    /*@Before and @After run before and after each JUnitTesting.Classes.test case.*/
    @Before
    public void setup() {
        System.out.println("Setup");
        greeting = new GreetingImpl();
    }
    @Test
    public void testGreet() {
        System.out.println("testGreet");
        //Should return a valid output.
        String result = greeting.greet("Junit");
        assertNotNull(result);
        assertEquals("Hello Junit", result);

    }

    /*OrderBOException Testing*/
    @Test(expected = IllegalArgumentException.class)
    public void greetExceptionForNull() {
        System.out.println("greetExceptionForNull");
        /*The greet should throw an OrderBOException for name is null.*/
        greeting.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetExceptionForEmptyString() {
        System.out.println("greetExceptionForEmptyString");
        /*The greet should throw an exception for name is null.*/
        greeting.greet("");
    }

    @After
    public void teardown() {
        System.out.println("teardown");
        greeting = null;
    }

}