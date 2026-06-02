public class Frecount {
   public static void main(String[] args){
    StringBuilder sb = new StringBuilder("aaabbcc");
    

    for(int i=0;i<sb.length();i++){
        int count = 1;
        for(int j=i+1;j<sb.length();j++){
            if(sb.charAt(i) == sb.charAt(j)){
                count++;
                sb.deleteCharAt(j);
                j--;
            }
        }
        System.out.print(sb.charAt(i)+""+count);
        count = 0;


    }
   } 
}
