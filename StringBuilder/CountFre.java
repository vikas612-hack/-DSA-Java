public class CountFre {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("banana");
      
        int count=0;

        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch == 'a'){
                count++;
            }
        }

        System.out.println("Count: "+count);
    }
}
