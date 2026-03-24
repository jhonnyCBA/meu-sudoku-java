package sudoku;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static boolean isValid(Board board) {
        int[][] grid = board.getGrid();

        // Validar linhas
        for (int i = 0; i < 9; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!set.add(grid[i][j])) return false;
            }
        }

        // Validar colunas
        for (int j = 0; j < 9; j++) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (!set.add(grid[i][j])) return false;
            }
        }

        // Validar blocos 3x3
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Integer> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (!set.add(grid[i][j])) return false;
                    }
                }
            }
        }

        return true;
    }
}