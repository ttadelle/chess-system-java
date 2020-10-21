package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Posi��o de origem: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Posi��o de destino: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.perforChessMove(source,target);
		}
	}
}
