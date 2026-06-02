public class Positive {
    public static void main(String[] args){
        int[] arr={-2, 5, -1, 7, 9};
        int posCount = 0;
        int negCount = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i] > 0){
                posCount++;
            }else{
               negCount++; 
            }
        }
        //negCount = arr.length - posCount;
        System.out.println("Positive number: "+posCount);
        System.out.println("Negative Number: "+negCount);
    }
}
