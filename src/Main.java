import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfWeek weekDay = DayOfWeek.TUES;
                //skapat en instans av vårt ENUM
        System.out.printf("Name is %s, Ordinal Value = %d%n",
                weekDay.name(), weekDay.ordinal());
        /*
        %s formats strings.
            %d formats decimal integers.
            %f formats floating-point numbers.
            %b formats booleans.
            %c formats characters.
            %t formats date/time values.
            %n results in the platform-specific
        */

        for (int i = 0; i < 10; i++){
            weekDay = getRandomDay();
        }
    }
}

public static DayOfWeek getRandomDay(){
    //skapa en random integer
    int randomInt = new Random().nextInt(7);
    //bound: 7 betyder att den slumpar mellan de 7 förbestämda dagarna. basically hur många sidor tärningen har
    var allDays = DayOfWeek.values();

    return allDays[randomInt];
}