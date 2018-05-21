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