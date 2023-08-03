public class Point implements Cloneable{

    public int x;
    public int y;
    public String a;

    public Point(int x, int y, String a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }

    @Override
    public Object clone() {
        Object clone =null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){}

        return clone;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", a='" + a + '\'' +
                '}';
    }
}
