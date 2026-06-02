public class Zero {
    public static void main(String[] args){
        int[] arr={1, 0, 2, 0, 3, 4, 0};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] != 0){
                    continue;
                }else{
                    int swap=arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
            
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }

        }
    }

