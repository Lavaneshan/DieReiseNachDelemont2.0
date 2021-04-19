


public class Action {
	int Gewinner;
//hier wird gechekt wer gewonnen hat
	public int checker(int check1, int check2, int check3, int check4, int check5, int check6, int check7, int check8,
			int check9) {
//Es gibt 8 mögliche Kombinationen in TicTacToe zu gewinnen, diese sind hier aufgeführt, zählt aber nur für den Spieler 1
		if (check1 == 1 && check2 == 1 && check3 == 1) {
			Gewinner = 1;
		}
		if (check1 == 1 && check4 == 1 && check7 == 1) {
			Gewinner = 1;
		}
		if (check1 == 1 && check5 == 1 && check9 == 1) {
			Gewinner = 1;
		}
		if (check2 == 1 && check5 == 1 && check8 == 1) {
			Gewinner = 1;
		}
		if (check3 == 1 && check6 == 1 && check9 == 1) {
			Gewinner = 1;
		}
		if (check3 == 1 && check5 == 1 && check7 == 1) {
			Gewinner = 1;
		}
		if (check4 == 1 && check5 == 1 && check6 == 1) {
			Gewinner = 1;
		}
		if (check7 == 1 && check8 == 1 && check9 == 1) {
			Gewinner = 1;
		}
//Es gibt 8 mögliche Kombinationen in TicTacToe zu gewinnen, diese sind hier aufgeführt, zählt aber nur für den Spieler 2
		if (check1 == 2 && check2 == 2 && check3 == 2) {
			Gewinner = 2;
		}
		if (check1 == 2 && check4 == 2 && check7 == 2) {
			Gewinner = 2;
		}
		if (check1 == 2 && check5 == 2 && check9 == 2) {
			Gewinner = 2;
		}
		if (check2 == 2 && check5 == 2 && check8 == 2) {
			Gewinner = 2;
		}
		if (check3 == 2 && check6 == 2 && check9 == 2) {
			Gewinner = 2;
		}
		if (check3 == 2 && check5 == 2 && check7 == 2) {
			Gewinner = 2;
		}
		if (check4 == 2 && check5 == 2 && check6 == 2) {
			Gewinner = 2;
		}
		if (check7 == 2 && check8 == 2 && check9 == 2) {
			Gewinner = 2;
		}
//Hier wird der Gewinner dann züruckgegeben
		return Gewinner;

	}
	
}
