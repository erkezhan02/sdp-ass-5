public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context(); // Создаем объект контекста

        StartState startState = new StartState();
        startState.doAction(context); // Устанавливаем состояние

        System.out.println("Текущее состояние: " + context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context); // Устанавливаем другое состояние

        System.out.println("Текущее состояние: " + context.getState());
    }
}