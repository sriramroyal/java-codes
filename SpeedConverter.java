public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(2);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }
            return Math.round(kilometersPerHour/1.069);
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            long milesperhour=toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milesperhour +" mi/h");
        }
    }
}
