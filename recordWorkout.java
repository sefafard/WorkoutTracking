import java.io.*;
import java.util.Scanner;
import java.time;

public class RecordWorkout {

    static String workoutDate, workoutStime, workoutEtime, workoutType, workoutCmt;
    static Scanner s;
    static int workoutDur;

     public static void main (String[] args) {
        LocalTime thisSec = LocalTime.now();
         if (args.length > 0) {
            if (args[0].equals("?") || args[0].equals("-h") || args[0].equals("/h")) {
                System.out.println("Format is:");
                System.out.println("      <CMD> Workout Date, Workout Start Time, Workout End Time, Workout Type, Duration (in minutes), Comments <optional>");
                System.out.println("      [Enclose mulitple words in quotes for Workout Type and Comments]");
                return;
            }
            String argsecho ="";
            for (int i=0; i<args.length; i++) {
                argsecho = argsecho + args[i];
                if (i<(args.length-1)) {
                    argsecho = argsecho + " ";
                }
            }
            System.out.printf("Cmd line args = %s (args.length) = %d\n",argsecho,args.length);
            Scanner s = new Scanner(argsecho);
            System.out.println("workoutDate = " + s.next());
            System.out.println("workoutStime = " + s.next());
            System.out.println("workoutEtime = " + s.next());
            System.out.println("workoutType = " + s.next());
            System.out.println("workoutDur = " + s.nextInt());
            System.out.println("workoutCmt = " + s.next());
            s.close();
        }

        if (args.length == 6) {
            workoutDate = args[0];
            workoutStime = args[1];
            workoutEtime = args[2];
            workoutType = args[3];
            workoutDur = Integer.parseInt(args[4]);
            workoutCmt = args[5];
        }
                
        if (args.length == 0) {
            //need the date
            System.out.print("What day are you recording this workout for? (or specify 'today') ");
            workoutDate = toUpperCase(s.next());
            if (workoutDate.equals("TODAY")) {
                System.out.printf("now: %s%n", LocalDateTime.now());
                System.out.printf("Time now: H: %s M: %s S: %s", thisSec.getHour(), thisSec.getMinute(), thisSec.getSecond());
            }

        }
        
        if (args.length == 1) {
            workoutDate = args[0];
            //date=date entered in arg[0]
            System.out.print("What time did you start the workout? (or '0' to enter duration:) ");
            workoutStime = s.next();            
        }
        if (args.length == 2) {
            if (args[1].equals("0")) {
                // at this juncture, you're telling me you just want to enter a duration.
                System.out.print("Enter workout duration:  ");
                workoutDur = Integer.parseInt(s.next());
            }
            else {
                System.out.print("What time did you end the workout? ");
                workoutEtime = s.next();
            }
            
        }
        if (args.length == 3) {
            System.out.print("Enter  duration: ");
            workoutDur = Integer.parseInt(s.next());
        }

        if (args.length == 5) {
            System.out.print("Enter a comment if you wish: ");
            workoutCmt = s.next();
        }        
        
        // System.out.printf("Before calling the class:  %s %s %s %s %d %s\n", workoutDate, workoutStime, workoutEtime, workoutType, workoutDur, workoutCmt);
        Workout workout = new Workout(workoutDate, workoutStime, workoutEtime, workoutType, workoutDur, workoutCmt);
    }
}
class Workout {

    String workoutDate, workoutStartTime, workoutEndTime, workoutType, workoutComments;
    int workoutDurationInMinutes;

    //constructor
    public Workout (String workoutDate, String workoutStartTime, String workoutEndTime, String workoutType, int workoutDurationInMinutes, String workoutComments) {
        this.workoutDate = workoutDate;
        this.workoutStartTime = workoutStartTime;
        this.workoutEndTime = workoutEndTime;
        this.workoutType = workoutType;
        this.workoutDurationInMinutes = workoutDurationInMinutes;
        this.workoutComments = workoutComments;

        System.out.printf("Workout class constructor args:  %s %s %s %s %d %s\n", workoutDate, workoutStartTime, workoutEndTime, workoutType, workoutDurationInMinutes, workoutComments);
    }

    //methods
    public String startWorkout() {
        return String.format("Workout started at: %s ", workoutStartTime);
    }
    
    public String endWorkout() {
        return String.format("Workout ended at: %s ", workoutEndTime);
    }
    public String performWorkout() {
        return String.format("Worked out for a total of: %d minutes.", workoutDurationInMinutes);
    }
}