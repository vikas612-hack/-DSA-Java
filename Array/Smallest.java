public class Smallest {
    public static void main(String[] args){
        int[] arr={15, 4, 28, 2, 19};
        int largest = Integer.MIN_VALUE;
        int sceondlar = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }else if(arr[i] < sceondlar){
                sceondlar = arr[i];
            }
        }
        System.out.println(largest+" "+sceondlar);
    }
}
