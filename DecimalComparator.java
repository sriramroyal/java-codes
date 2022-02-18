public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(9.2322,9.2223));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1 ,double num2){
        int value1=(int)(num1*1000);
        int value2=(int)(num2*1000);
        if(value1==value2){
            return true;
        }

        return false;
    }
}
