package sudoku;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Informe o tabuleiro como argumento.");
            return;
        }

        Board board = new Board();
        board.load(args[0]);

        board.print();

        if (Validator.isValid(board)) {
            System.out.println("\nTabuleiro válido!");
        } else {
            System.out.println("\nTabuleiro inválido!");
        }
    }
}