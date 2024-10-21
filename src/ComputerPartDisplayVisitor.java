class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Отображение клавиатуры.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Отображение монитора.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Отображение мыши.");
    }
}