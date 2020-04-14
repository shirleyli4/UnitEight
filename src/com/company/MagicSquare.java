public class MagicSquare {
    /**
     * This program checks whether a square is a magical square.
     * Same sum every row, column, diagonal
     * @author Shirley Shuzhou Li
     * @since 4/6/2020
     */
    private int[][] grid;

    /**
     * initiating the object
     * @param g 2d square array object
     */

    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * Calculates the sum of given row
     * @param row the row to find value of
     * @return sum of the row given
     */
    public int rowSum(int row) {
        // <<< Complete the code >>>
        int rowSum=0;
        for(int i=0;i<grid[row].length;i++){
            rowSum+=grid[row][i];
        }
        return rowSum;
    }

    /**
     * Sum of the given column
     * @param col given column
     * @return sum of the given column
     */
    public int colSum(int col) {
        // <<< Complete the code >>>
        int colSum=0;
        for(int i=0;i<grid.length;i++){
            colSum+=grid[i][col];
        }
        return colSum;
    }

    /**
     * Find the given diagonal sum (left bottom to right top)
     * @return given diagonal sum
     */
    public int upDiagSum() {
        // <<< Complete the code >>>
        int upSum=0;
        int len=grid.length-1;
        for(int i=grid.length-1;i>=0;i--){
                upSum+=grid[i][len-i];
        }
        return upSum;
    }

    /**
     * Find the down diagonal sum (left top to right bottom)
     * @return the sum of given diagonal
     */
    public int downDiagSum() {
        // <<< Complete the code >>>
        int downSum=0;
        int len=grid.length-1;
        for(int i=0;i<grid.length;i++){
            downSum+=grid[i][len-i];
        }
        return downSum;
    }

    /**
     * whether the array is a square or not
     * @return boolean is a sqaure or not a square
     */
    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        boolean ret=true;
        int val=rowSum(0);
        int up=upDiagSum();
        int down=downDiagSum();
        for(int i=0;i<grid.length;i++){
            int row=rowSum(i);
            int col=colSum(i);
            if(val!=row||val!=col||val!=up||val!=down){
                ret=false;
            }
        }
        return ret;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

