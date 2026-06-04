public class Maxi {

    static int Max(int[] a, int l){

        if(l == 0){
            return a[0];
        }

        int prevMax = Max(a, l-1);

        return ?;
    }

    public static void main(String[] args){

        int[] arr = {2,8,4,6};

        System.out.println(Max(arr, arr.length-1));

    }
}