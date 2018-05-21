public class recordWorkout {

    static String comment;

     public static void main (String[] args) {
        if (args.length < 5) {
            System.out.println("Required command line arguments missing.");
            System.out.println("Format is:");
            System.out.println("      <CMD> Workout Date, Workout Start Time, Workout End Time, Workout Type, Duration (in minutes), Comments <optional>");
            System.out.println("      [Enclose mulitple words in quotes for Workout Type and Comments]");
            return;
        }
        String argsecho ="";
        for (int i=0; i<args.length; i++) {
            argsecho = argsecho + args[i];
            if (i<(args.length-1)) {
                argsecho = argsecho + ",";}
        }
        System.out.println("Cmd line args = " + argsecho);

        if (args.length == 5) {
            comment = "";
        }
        else {
            comment = args[5];
        }
        Workout workout = new Workout(args[0],args[1],args[2],args[3],Integer.parseInt(args[4]),comment);
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