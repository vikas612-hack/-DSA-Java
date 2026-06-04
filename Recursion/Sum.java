public class Sum {
    static int SumDig(int n){
        int total=0;
        if(n == 0){
            return 0;
        }
        
        return  n+SumDig(n-1);
        

    }
    public static void main(String[] args){
        System.out.println(SumDig(5));
    }
}
