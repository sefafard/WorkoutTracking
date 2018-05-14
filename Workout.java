public class Workout {

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
