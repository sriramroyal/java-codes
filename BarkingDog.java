public class BarkingDog {
    public static void main(String[] args) {
        BarkingDog dog=new BarkingDog();
        boolean wakeup=true;
        wakeup=shouldWakeUp(true,21);
        System.out.println(wakeup);

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking||(hourOfDay <0 || hourOfDay >23)){
            return false;
        }if(barking && (hourOfDay >8 || hourOfDay>22)){
            return true;
        }
        return false;
    }

}
