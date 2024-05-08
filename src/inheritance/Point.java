package inheritance;

import java.util.Iterator;

public class Point implements Iterable{
    private int x;
    private int y;

    @Override
    public Iterator iterator() {
        return null;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("Object reference is same");
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            System.out.println("Object either is null or not point type.");
            return false;
        }

        Point point = (Point) obj;

        if(x == point.x && y == point.y) {
            System.out.println("Both objects are equal.");
        }

        return x == point.x && y == point.y;
    }

}
