package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 8/28/16.
 */
public class ProblemTwo {
    public static void main(String[] args){
     System.out.println(calculateAge(1987,2016));
    }
    public static String calculateAge(int birthYear, int currentYear) {
        int age = currentYear - birthYear;
        String output = "You are either " + (age -1) + " or " + age + ".";
        return output;
        //can also just return the statement

    }

}
