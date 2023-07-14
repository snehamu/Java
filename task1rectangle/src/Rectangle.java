public class Rectangle {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int breadth;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int calculateperimeter() {
        int perimeter = 2*(length+breadth);
        return perimeter;
    }

}
