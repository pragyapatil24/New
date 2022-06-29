    public class reverseString {
        public static void main(String[] args) {
            String s = "winner";
            int length = s.length();
            System.out.println(s);
            System.out.println("Length: " + length);
            for (int i = 5; i <= s.length(); i--) {
                System.out.print(s.charAt(i));
            }

        }
    }




