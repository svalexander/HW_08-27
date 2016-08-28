package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 8/28/16.
 */
public class ProblemThree {
    public static void main(String[] args) {

        String checkThisString = "Happy Valentine's Day Xoxoxo";
        System.out.println(checkLetter(checkThisString));
    }

    public static boolean checkLetter(String str) {
        int numX = 0;
        int numO = 0;
        for ( int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'x') {
                numX++;
            }
            if (Character.toLowerCase(str.charAt(i)) == 'o') {
                numO++;
            }
        }
        return numO == numX ; //since the return type of this method is a boolean we do not need an if statement that returns true or false
        }
    }

