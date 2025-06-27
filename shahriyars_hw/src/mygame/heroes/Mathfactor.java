package mygame.heroes;

public class Mathfactor {
    public static void main(String[] args) {
        Mathunits mathunits = new Mathunits(); // создаём объект

        int my_number = mathunits.add(5, 3);
        int my_number1 = mathunits.add(10, 2);

        System.out.println(my_number);
        System.out.println(my_number1);
    }
}

class Mathunits {
    int add(int a, int b) {
        int minus = a - b;
        return minus;
    }
}


class Divider {
    void devide(int a, int b) {

            int product = a / b;
            System.out.println(product);
        }
    }

