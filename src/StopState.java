class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Игрок в состоянии остановки");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Состояние остановки";
    }
}