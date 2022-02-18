public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
    }
    public static boolean hasEqualSum(int n1,int n2,int n3){
        int sum=n1+n2;
        if(sum==n3){
            return true;
        }
        return false;
    }
}
