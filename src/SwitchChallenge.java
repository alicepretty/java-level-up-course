public class SwitchChallenge {
    public static void main(String[] args) {
        char NOTE = 'E';
       phonetAlphabet(NOTE);
       int number = -1;
        printNumberInWord(number);


        }
        public static void phonetAlphabet(char NOTE){
            switch(NOTE){
                case 'A':
                    System.out.println("the matching word is : Able");
                    break;
                case 'B':
                    System.out.println("The matching word is : Baker");
                    break;
                case 'C':
                    System.out.println("The matching word is : Charlie");
                    break;
                case 'D':
                    System.out.println("The matching word is : Dog");
                    break;
                case 'E':
                    System.out.println("The matching word is : Easy");
                    break;
                default:
                    System.out.println("They are not Nato");

        }
    }

    public static void printNumberInWord(int number){
//        int number = 1;
        switch(number){
            case 0:
                System.out.println(number + "is" + " " +"ZERO");
                break;
            case 1:
                System.out.println(number + "is" + " " +"ONE");
                break;
            case 2:
                System.out.println(number + "is" + " " +"Two");
                break;
            case 3:
                System.out.println(number + "is" + " " +"THREE");
                break;
            case 4:
                System.out.println(number + "is" + " " +"FOUR");
                break;
            case 5:
                System.out.println(number + "is" + " " +"FIVE");
                break;
            default:
                System.out.println(number + "is not whole number");



        }

    }
}
