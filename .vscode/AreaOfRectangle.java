class First {
    int x;
    int y;

    void area(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Area of rectangel: " + x * y);
    }

    void perimeter(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("perimeter of rectange : " + (x + y) * 2);
    }
}

class AreaOfRectangle {
    public static void main(String[] args) {
        First f1 = new First();
        f1.area(35, 45);
        f1.perimeter(5, 7);

    }

}
