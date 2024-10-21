class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Игрок в состоянии старта");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Стартовое состояние";
    }
}