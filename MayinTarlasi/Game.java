package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class Game {

	int rowNumber , colNumber;
	int[][] map;
	int[][] board;
	int size, row, col;
	boolean game = true;

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	public Game(int rowNumber, int colNumber) {
		super();
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int[colNumber][rowNumber];
		this.board = new int[colNumber][rowNumber];
		this.size = rowNumber * colNumber;
	}

	public void run() {
		int success = 0;
		prepareGame();
		print(map);
		System.out.println("Oyun Baþladý!");
		while (game) {
			print(board);
			System.out.println("Satýr Sayýsý:");
			row = scan.nextInt();
			System.out.println("Sütün Sayýsý:");
			col = scan.nextInt();
			if ((row < 0 || row >= rowNumber)||(board[row][col]>0 || board[row][col]== -2))  {
				System.out.println("Geçersiz Kordinat!");
				continue;
			}
			if ((col < 0 || col >= colNumber) ||(board[row][col]>0 || board[row][col]== -2)) {
				System.out.println("Geçersiz Kordinat!");
				continue;
			}
			
			if (map[row][col] != -1) {
				success++;
				check(row, col);
	
				if (success == (size - (size / 4))) {
					System.out.println("Baþardýnýz.");
					break;
				}
			} else {
				game = false;
				System.out.println("Game Over");
			}
		}
	}

	public void check(int r, int c) {
		if (board[r][c] == 0) {
			if ((c < colNumber - 1) && map[r][c + 1] == -1) {
				board[r][c]++;
			}
			if ((r < rowNumber - 1) && map[r + 1][c] == -1) {
				board[r][c]++;
			}
			if ((r > 0) && map[r - 1][c] == -1) {
				board[r][c]++;
			}
			if ((c > 0) && map[r][c - 1] == -1) {
				board[r][c]++;
			}
			if (board[r][c] == 0) {
				board[r][c] = -2;
			}
		}
	}

	public void prepareGame() {
		int randRow, randCol;
		int count = 0;
		while (count != (size / 4)) {

			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if (map[randRow][randCol] != -1) {
				map[randRow][randCol] = -1;
				count++;
			}

		}
	}

	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] >= 0)
					System.out.print(" ");
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
