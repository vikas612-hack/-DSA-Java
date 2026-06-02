public class Reverseswap {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};

        int start=0;
        int end=arr.length-1;

        while(start < end){
            int swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
