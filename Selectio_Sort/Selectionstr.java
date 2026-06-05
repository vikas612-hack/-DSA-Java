public class Selectionstr {
    public static void main(String[] args){
     String[] arr={"Banana","Apple","Mango"};

     for(int i=0;i<arr.length-2;i++){
        int ind=i;
        for(int j=i+1;j<arr.length;j++){
             if(arr[j].compareTo(arr[ind]) < 0) {
                    ind = j;
                }
        }
        String temp= arr[i];
        arr[i] = arr[ind];
        arr[ind] = temp;
     }
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}
