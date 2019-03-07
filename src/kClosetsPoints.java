/**
 * Created by kylel95 on 1/12/19.
 */
import java.util.*;
public class kClosetsPoints {
    public static void main(String [] args){
        int [][] arr = {{1,3}, {-2, 2}};
        for(int [] a: new kClosetsPoints().kClosest(arr, 1)){
            System.out.println(a[0] + "," + a[1]);
        }

    }
    public int[][] kClosest(int[][] points, int K) {
       List<Point> list = new ArrayList<>();
       for(int [] p: points){
           list.add(new Point(p[0], p[1], distance(p[0], p[1])));
       }

       Collections.sort(list, new Comparator<Point>() {
           @Override
           public int compare(Point p1, Point p2) {
               if (p1.distance > p2.distance) {
                   return 1;
               } else if (p1.distance < p2.distance) {
                   return -1;
               }
               return 0;
           }

       });
        for(int i = 0; i < K; i++){
            System.out.println(list.get(i).x + "," + list.get(i).y);
        }

        return new int [K][K];



    }
    public static int distance(int x, int y){
        return (int)Math.sqrt( Math.pow(x - 0,2)+ Math.pow(y - 0, 2));
    }
    static class Point{
        int x;
        int y;
        int distance;
        public Point(int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
