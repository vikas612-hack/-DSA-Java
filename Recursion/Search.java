public class Search {

    static int search(int[] arr, int index, int target){

        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return search(arr, index + 1, target);
    }

    public static void main(String[] args){

        int[] arr = {10,20,30,40};

        System.out.println(search(arr, 0, 30));

    }
}