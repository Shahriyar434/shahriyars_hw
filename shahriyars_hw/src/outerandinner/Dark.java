package outerandinner;

public class Dark {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

class Outer {
    int outer_x = 100;
    int outer_x_2 = 200;

    void test() {
        Inner inner = new Inner();
        inner.display();
        inner.sum();
    }

    class Inner {
        void display() {
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_x_2 = " + outer_x_2);
        }

        void sum() {
            int result = outer_x + outer_x_2;
            System.out.println("sum of outer_x и outer_x_2 = " + result);
        }
    }
}
