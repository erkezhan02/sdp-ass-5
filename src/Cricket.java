class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Игра в крикет инициализирована.");
    }

    @Override
    void startPlay() {
        System.out.println("Игра в крикет началась.");
    }

    @Override
    void endPlay() {
        System.out.println("Игра в крикет завершена.");
    }
}