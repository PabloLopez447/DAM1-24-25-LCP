package ud2.funciones;

/*
* Diseñar una función recursiva que calcule el enésimo término de la serie de
Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores
de la serie, es decir:
fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 1
*/

public class E0412 {
    public static int fibo(int a){
        int fibo = 0;
        switch (a) {
            case 1, 0:
                fibo = 1;
                break;
            default:
                fibo = fibo(a-1) + fibo(a-2);
                break;
        }
        return fibo;
    }
    public static void main(String[] args) {
        System.out.println(fibo(1));
    }
}