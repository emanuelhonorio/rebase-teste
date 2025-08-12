import controllers.GameController;

public class Main {
    public static void main(String[] args) {
        GameController game = new GameController();
        System.out.println("Inicio do jogo");
        game.jogar();
        game.sair();
    }
}