package Point;
import java.lang.Math.*;

public class Point {

        private int x;
        private int y;

        public Point(){}

        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setX(int x){
            this.x=x;
        }
        public void setY(int y){
            this.y=y;
        }
        public double distance(){
            double x2 = 0.0;
            double y2 = 0.0;
            return Math.sqrt((y2 - this.y) * (y2 - this.y) + (x2 - this.x) * (x2 - this.x));
        }
        public double distance(int x, int y){
            double x2 = x;
            double y2 = y;
            return Math.sqrt((y2 - this.y) * (y2 - this.y) + (x2 - this.x) * (x2 - this.x));
        }
        public double distance(Point point){
            return distance(point.getX(), point.getY());
        }
}
