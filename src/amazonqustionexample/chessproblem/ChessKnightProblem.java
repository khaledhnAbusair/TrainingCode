package amazonqustionexample.chessproblem;

import static amazonqustionexample.chessproblem.ChessKnight.BFS;

public class ChessKnightProblem {
    public static void main(String[] args) {
        int N = 8;

        // source coordinates
        Node src = new Node(0, 7);

        // destination coordinates
        Node dest = new Node(7, 0);

        System.out.println("Minimum number of steps required is " + BFS(src, dest, N));
    }


}
