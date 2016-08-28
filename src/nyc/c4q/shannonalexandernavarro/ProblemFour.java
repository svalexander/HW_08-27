package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 8/28/16.
 */
public class ProblemFour {
    public static void main(String[] args) {
        String userWord = "happily";
        System.out.println(endsly(userWord));
    }

    public static boolean endsly(String word) {
        return word.endsWith("ly");
    }
}
