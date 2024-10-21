import java.util.ArrayList;
import java.util.List;
class ConcreteObserver2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer 2 получил обновление: " + message);
    }
}