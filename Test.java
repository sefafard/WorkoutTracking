import java.time.*;
public class Test {

    public static void main(String[] args) {
        if (args.length == 6) {
            System.out.println("Command line args:  ");
            //echo args
            for (int i=0;i<args.length; i++) {
                System.out.print(args[i] + " ");
           }
        System.out.println(" ");
        /* int duration = Integer.parseInt(args[4]);
        Workout workout1 = new Workout(args[0], args[1], args[2], args[3], duration, args[5]);
        System.out.println(workout1.startWorkout());
        System.out.println(workout1.performWorkout());
        System.out.println(workout1.endWorkout());
        */
        LocalTime thisSec = LocalTime.now();
        System.out.printf("now: %s%n", LocalDateTime.now());
        System.out.printf("Time now: H: %s M: %s S: %s", thisSec.getHour(), thisSec.getMinute(), thisSec.getSecond());
        }
        else {
        System.out.println("format is:  cmd date, start time, end time, workout type, duration, then comments");
        return;
        }        
    }
    
    //methods
    public String toString() {
        return String.format("");
    }
    
}