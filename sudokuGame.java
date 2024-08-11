import java.util.Set;
import java.util.HashSet;

public class sudokuGame {
    private Set<Integer>[][] candidates;
    private int[][] grid;
    private int[][] solutions;


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
                for(int k = 1; k < 10; k++){
                    if(this.grid[i][j] > 0){
                        candidates[i][j].remove(grid[k][j]);
                    }
                }
                //check row
                for(int k = 1; k < 10; k++){
                    if(this.grid[i][j] > 0){
                        candidates[i][j].remove(grid[i][k]);
                    }
                }
                if(this.grid[i][j] > 0){
                    int midRow = (i/3) * 3 + 1;
                    int midColumn = (j/3) * 3 + 1;
                    //check square  
                        //find equation to middle of each square then +/- 1 in all directions
                    for(int x = -1; x < 2; x++){
                        for(int y = -1; y < 2; y++){
                            candidates[i][j].remove(grid[midRow + x][midColumn + y]);
                            
                        }
                    }
                }
                
            }
        }
        

    }
}
public static void main(String[] args){

}