import java.util.Set;
import java.util.HashSet;

public class sudokuGame {
    Set<Integer>[][] candidates;
    int[][] grid;
    int[][] solutions;
}

@SuppressWarnings("unchecked")
public sudokuGame(int[][] grid){
    this.grid = grid;
    //establish potential options for each block
    candidates = new HashSet[9][9];
    for(int i = 0; i < candidates.length; i++){
        for(int j = 0; j < candidates.length; j++){
            //initializes each element to {1,2,3,4,5,6,7,8,9}
            candidates[i][j] = new HashSet<Integer>();
            for(int k = 1; k < 10; k++){
                candidates[i][j].add(k);
            }
            //check column
            
            //check row
            //check square  
                //find equation to middle of each square then +/- 1 in all directions
        }
    }
    

}



public printSudoku(){

}

public Set<Integer>[][] checkRow (Set<Integer>[][] grid){

}

public int[][] solve(int[][] grid){

}

public void printSudoku(int[][] grid){

}

public static void main(String[] args){

}