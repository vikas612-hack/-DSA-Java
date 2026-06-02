public class LargestChar {
    public static void main(String[] args){
        String s="BACD";
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= largest){
                largest = ch;
            }
        }
        System.out.println("character "+(char)largest);
    }
}
