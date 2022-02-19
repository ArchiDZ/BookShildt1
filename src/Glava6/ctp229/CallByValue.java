package Glava6.ctp229;

public class CallByValue {
    public static void runCallByValue(){
        Test ob = new Test();
        int a = 15;
        int b = 20;

        System.out.println("a и b перед вызовом метода-->"
        +a+" "+b);
        ob.noChange(a,b);

        System.out.println("a и b после вызова метода-->"
        +a+" "+b);
    }
}
