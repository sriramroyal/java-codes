public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int number){
        int lastdigit=0;
        int reverse=0;
        int value=number;
        while (number !=0 || number >0){
            lastdigit = number % 10;
            reverse = reverse * 10;
            reverse +=lastdigit;
            number /=   10;
        }
        if (value==reverse){
            return true;
        }
        return false;
    }
}
