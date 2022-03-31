package chapter3;

public class Calculator {
    public static void main(String [] args) {
        System.out.println("Calculator class started");
        Calculator calc=new Calculator();
        int a=10;
        int b=5;
        // new를 사용해서 초기화하면 참조 자료형(내맘대로 만들 수 있음)
        // 그렇지 않고 바로 초기화 하면 기본 자료형
        System.out.println(calc.add(a,b));
        System.out.println(calc.subtract(a,b));
        System.out.println(calc.multiply(a,b));
        System.out.println(calc.divide(a,b));
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}
