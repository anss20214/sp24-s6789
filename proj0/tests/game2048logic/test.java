package game2048logic;

import game2048rendering.Board;
import org.junit.Test;

public class test {

    @Test
    public void test() {
        int[][] rawVals = new int[][] {
                {0, 0, 0, 0},
                {2, 4, 2, 4},
                {4, 2, 4, 2},
                {2, 4, 2, 4},
        };
        Board board = new Board(rawVals);

    }
}
