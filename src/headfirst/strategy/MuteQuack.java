package headfirst.strategy;

/**
 * Created by Gavin on 2017/2/10.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
