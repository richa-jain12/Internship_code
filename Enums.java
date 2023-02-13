public class Enums {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        System.out.println("Using Switch case: ");
        switch(myVar){
            case LOW:
                System.out.println("Low Level...");
                break;
            case MEDIUM:
                System.out.println("Medium Level...");
                break;
            case HIGH:
                System.out.println("High Level...");
                break;
        }

        System.out.println("Using for loop: ");
        for(Level myVar1: Level.values()){
            System.out.println(myVar1);
        }
    }
}
