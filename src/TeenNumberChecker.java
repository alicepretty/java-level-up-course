public class TeenNumberChecker {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        int c = 20;
        boolean haveTeen = hasTeen(a,b,c);
        System.out.println(haveTeen);
        int d = 13;
        boolean aTeen = isTeen(d);
        System.out.println(aTeen);

    }
    public static boolean hasTeen(int a ,int b , int c){
        if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
            return true;
        }
        else{
            return false ;
        }
    }
    public static boolean isTeen(int d){
        if(d>=13 && d<=19){
            return true;
        }
        else{
            return false;
        }
    }
}