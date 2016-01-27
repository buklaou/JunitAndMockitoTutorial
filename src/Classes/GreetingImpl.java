package Classes;

/**
 * Created by Raffi on 12/29/2015.
 */
public class GreetingImpl implements IGreeting {

    @Override
    public String greet(String name) {

        return "Hello " + name;
    }
}
