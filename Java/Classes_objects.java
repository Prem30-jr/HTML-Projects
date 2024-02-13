class rectangle {
    private int l, b;

    void getdetail(int x, int y) {
        l = x;
        b = y;
    }

    int show() {
        return l * b;
    }
}

public class Classes_objects {
    public static void main(String args[]) {
        rectangle o1 = new rectangle();
        o1.getdetail(2, 4);
        System.out.println("Area :" + o1.show());
    }

}
