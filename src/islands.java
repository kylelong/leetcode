/**
 * Created by kylel95 on 12/20/18.
 */
public class islands {
    public static void main(String [] args){
        islands i = new islands();
//        {'1','1','1','1','0'},
//        {'1','1','0','1','0'},
//        {'1','1','0','0','0'},
//        {'0','0','0','0','0'}
        char [][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        int num  = i.numIslands(grid);
        System.out.println(num);
    }


    public static void visit(int i, int j, char[][] grid){
     if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
         return;
     }
     grid[i][j] = '0';
     visit(i + 1, j, grid); //go down one row
     visit(i - 1, j, grid); //go up one row
     visit(i, j + 1, grid); //go right one column
     visit(i, j - 1, grid); //go left one column


    }
    public int numIslands(char[][] grid) {
        if(grid == null) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    visit(i,j,grid);

                }
            }
        }
        return count;
    }
}
