package aima.core.environment.eightpuzzle;

import aima.core.search.framework.GoalTest;

/**
 * @author Ravi Mohan
 * @autor Morales Rosa, Lucia (816906)
 * 
 * Modificacion del fichero EightPuzzleGoalTest original para la Practica_2
 */
public class EightPuzzleGoalTest2 implements GoalTest {
	//Se declara como static para que la variable sea compartida por todas las instancias de la clase
	static EightPuzzleBoard goal = new EightPuzzleBoard(new int[] { 0, 1, 2, 3, 4, 5,
			6, 7, 8 });

	public boolean isGoalState(Object state) {
		EightPuzzleBoard board = (EightPuzzleBoard) state;
		return board.equals(goal);
	}
	
	//Para poder modificar el estado objetivo
	//pondrá como estado objetivo el pasado como argumento
	public static void setGoalState(EightPuzzleBoard board){
		goal = board;
	}
}