public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int firstdigit=number;
        int lastdigit=0;
        lastdigit = number % 10;
        while (number >= 10){
            number /=10;
        }
        firstdigit=number;
        return lastdigit + firstdigit;
    }
}
