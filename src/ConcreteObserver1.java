import java.util.ArrayList;
import java.util.List;

class ConcreteObserver1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer 1 получил обновление: " + message);
    }
}