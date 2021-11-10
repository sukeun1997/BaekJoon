package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class level2_6 {

    public static int solution(int[][] board)
    {
        int answer = 0 ;
        int map[][];

        map = new int[board.length+1][board[0].length+1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                map[i+1][j+1] = board[i][j];
            }
        }

        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if (map[i][j] != 0) {
                    map[i][j] = Math.min(Math.min(map[i - 1][j - 1], map[i - 1][j]), map[i][j - 1]) + 1;
                    answer = Math.max(answer, map[i][j]);
                }
            }
        }


        return answer * answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //solution(new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}});
        solution(new int[][]{{0,0,1,1},{1,1,1,1}});
    }
}
