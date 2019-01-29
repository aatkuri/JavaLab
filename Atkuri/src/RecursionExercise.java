public class RecursionExercise {

    public static void main(String[] args) {
        System.out.println(mystery("Bearcats"));
        System.out.println(mystery("Northwest Bearcats Defeat Fort Hays"));
    }

    public static String mystery(String str) {
        if (!str.contains(" ")) {
            return " DONE";
        } else {
            return str.substring(str.indexOf(" ") + 1, str.indexOf(" ") + 2)
                    + mystery(str.substring(str.indexOf(" ") + 1));
        }
    }

}
