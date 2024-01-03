public class SpeedConverter {
    public static void main(String[] args) {
        double kilo = -5.6;
       double mile = toMilesPerHours(kilo);
        System.out.println(mile);
        double kilometerPerHour = 5;
        double miles = Math.round(kilometerPerHour/1.609);
        printConversion(kilometerPerHour);
        System.out.println(kilometerPerHour +"km/h" + " =" + miles+"mi/h");

    }

   public static  long toMilesPerHours(double kilometerPerHour){
       if( kilometerPerHour<0){
           return  -1;

       }
      return Math.round(kilometerPerHour/1.609);
   }
   public static void printConversion(double kilometerPerHour){
//        System.out.println(rounded);
        if(kilometerPerHour>0) {
            System.out.println("Invalid Value");

        }
        }

   }
