public class Sumarray {
    static int Sum(int[] a, int l){
        if(l == 0){
            return 1;
        }
        return a[l] + Sum(a,l-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(Sum(arr,arr.length-1)); 
    }
}
