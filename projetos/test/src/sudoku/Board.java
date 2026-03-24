package sudoku;

public class Board {

    private int[][] grid = new int[9][9];

    public void load(String input) {
        String[] entries = input.split(" ");

        for (String entry : entries) {
            String[] parts = entry.split(";");

            String[] position = parts[0].split(",");
            int row = Integer.parseInt(position[0]);
            int col = Integer.parseInt(position[1]);

            int value = Integer.parseInt(parts[1].split(",")[0]);

            grid[row][col] = value;
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public void print() {
        System.out.println("\nTabuleiro:");

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("-------------------------");

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");

                System.out.print(grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }
}