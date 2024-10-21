import java.util.ArrayList;
import java.util.List;
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // Метод добавления наблюдателя
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Метод удаления наблюдателя
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Метод установки состояния
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    // Метод получения состояния
    public String getState() {
        return state;
    }

    // Метод уведомления всех наблюдателей
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}