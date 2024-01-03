public class shouldWakeUp {
    public static void main(String[] args) {
        int hoursOfDay = 8;
        System.out.println(BarkingDog(true ,hoursOfDay));

    }
    public static boolean BarkingDog(boolean barking , int hoursOfDay){

        if(hoursOfDay<0 || hoursOfDay> 23){
            return false;
        }
        if (barking && (hoursOfDay < 8 || hoursOfDay >22)){
            System.out.println("a dog is barking");
            return true;
        }
        else {
            System.out.println("dog is not barking");
            return false;

        }
    }
}
