import controllers.GameController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        GameController gameController = new GameController();
        gameController.jogar();
        gameController.sair();
    }
}