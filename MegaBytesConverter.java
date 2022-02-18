public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(-1024);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");

        }else {
            int megaBites = kiloBytes / 1024;
            int remainingkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBites + " MB and " + remainingkilobytes + " KB");
        }
    }
}
