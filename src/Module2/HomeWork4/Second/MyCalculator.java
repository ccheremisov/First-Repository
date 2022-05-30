package Module2.HomeWork4.Second;

import Module2.HomeWork4.Numerable;

public class MyCalculator implements Numerable {


    @Override
    public void minus(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    @Override
    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    @Override
    public void plus(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    @Override
    public void devide(int a, int b) {
        float result = a / b;
        System.out.println(result);
    }
}
