import java.util.*;

/**
 * Created by kylel95 on 11/8/18.
 */
public class spiralMatrix {
    static boolean visited[][];
   public static List<Integer> list = new ArrayList<>();
     public static void main(String [] args){
         int [][] arr = {{1,2,3, 4},
                         {5,6,7, 8},
                         {9,10, 11, 12},
                         {13, 14, 15, 16}};

         for(int l: spiralOrder(arr)){
             System.out.print(l + " ");
         }
     }
     public static void visit(int i, int j, int[][]matrix){
         if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || visited[i][j] == true) return;
         visited[i][j] = true;
         list.add(matrix[i][j]);
         visit(i, j + 1, matrix); //go right
         visit(i + 1, j, matrix);//go down
         visit(i, j - 1, matrix);//go left
         visit(i -1, j, matrix);//go up
     }
    public static List<Integer> spiralOrder(int[][] matrix) {
        visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
               visit(i, j, matrix);
            }

        }
         return list;
    }

}
