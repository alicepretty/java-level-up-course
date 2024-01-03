public class MegaBytesConverter {
    public static void main(String[] args) {
        int kiloBytes = 3000;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
//        kiloBytes = 1;
        int megaByte = kiloBytes/1024;
        long remaining = kiloBytes%1024;
        System.out.println(kiloBytes +"KB" +""+ "="+megaByte +"MB"+ " "+ "and"+"" + remaining +"KB");

    }
}
