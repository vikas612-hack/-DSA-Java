public class Countchar {
    public static void main(String[] args) {

        String s = "aaabbcc";
        StringBuilder result = new StringBuilder();

        int count = 1;

        for(int i = 0; i < s.length() - 1; i++) {

            if(s.charAt(i) == s.charAt(i + 1)) {

                count++;

            } else {

                
                result.append(s.charAt(i)+""+count);

count = 1;

            }
        }

        // handle last group

        System.out.println(result);
    }
}