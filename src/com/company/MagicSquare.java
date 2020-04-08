public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }


    public int rowSum(int row) {
        // <<< Complete the code >>>
        int rowSum=0;
        for(int i=0;i<grid[row].length;i++){
            rowSum+=grid[row][i];
        }
        return rowSum;
    }


    public int colSum(int col) {
        // <<< Complete the code >>>
        int colSum=0;
        for(int i=0;i<grid.length;i++){
            colSum+=grid[i][col];
        }
        return colSum;
    }


    public int upDiagSum() {
        // <<< Complete the code >>>
        int upSum=0;
        int len=grid.length-1;
        for(int i=grid.length-1;i>=0;i--){
                upSum+=grid[i][len-i];
        }
        return upSum;
    }


    public int downDiagSum() {
        // <<< Complete the code >>>
        int downSum=0;
        int len=grid.length-1;
        for(int i=0;i<grid.length;i++){
            downSum+=grid[i][len-i];
        }
        return downSum;
    }


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

