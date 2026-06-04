public class Factorial {
    static int Fibo(int n){
        if(n == 0){
            return 1;
        }

        return n * Fibo(n-1);
    }
    public static void main(String[] args){
        System.out.println(Fibo(5));
    }
}
