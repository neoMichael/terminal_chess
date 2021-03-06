package app;

import boardgame.Board;
import chess.ChessPiece;

public class UserInterface {
	
	public static void printBoard(ChessPiece[][] pieces) {
		
		Board board = new Board();
		
		for (int i = 0; i < pieces.length; i++) {
			
			System.out.print((board.getRow() - i + " "));
			
			for (int j = 0; j < pieces.length; j++) {
				
				printPiece(pieces[i][j]);				
				
			}
			
			System.out.println();			
			
		}
		
		System.out.println("   A  B  C  D  E  F  G  H");
		
		
	}
	
	private static void printPiece(	ChessPiece piece) {
		
		System.out.print(" ");
		if(piece == null) {
			
			System.out.print("-");
			
		}else {
			
			System.out.print(piece);
		}
		
		System.out.print(" ");
	}

}
