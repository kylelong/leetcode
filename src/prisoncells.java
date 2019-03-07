/**
 * Created by kylel95 on 12/15/18.
 */
public class prisoncells {

    public static void main(String[] args) {
        int[] cells = {1,0,0,1,0,0,1,0};
        int N = 1000000000;
        int [] arr = prisonAfterNDays(cells, N);
        for(int a: arr){
            System.out.print(a + " ");
        }


    }
    public static int[] prisonAfterNDays(int[] cells, int N) {
        for(long j = 0; j < N; j++){
            int [] n = new int[cells.length];
            n[0] = 0;
            for (int i = 1; i <= cells.length - 2; i++) {
                if (cells[i - 1] == cells[i + 1]) {
                    n[i] = 1;

                }
                else{
                    n[i] = 0;
                }

            }
            n[n.length - 1] = 0;
            cells = n;


        }
  return cells;

    }
}
