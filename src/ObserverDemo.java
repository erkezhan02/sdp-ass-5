import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("Новое состояние 1");
        subject.setState("Новое состояние 2");
    }
}