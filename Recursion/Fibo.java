public class Fibo {
    static int Fibonasis(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return Fibonasis(n-1)+ Fibonasis(n-2);
    }
    public static void main(String[] args){
        System.out.println(Fibonasis(6));
    }
}
