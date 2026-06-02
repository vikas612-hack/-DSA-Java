public class Occurance {
    public static void main(String[] args){
        int[] arr={5,1,5,2,5,3};
        int target = 5;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count +=1;
            }
        }
        System.out.println("Element Occur in Array: "+count);
    }
}
