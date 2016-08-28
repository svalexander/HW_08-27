package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 8/28/16.
 */
public class ProblemFive {
    public static void main(String[] args) {
        System.out.println(chessboard(8));
    }
    public static String chessboard(int size){
        String board = "";

        for (int y = 0; y < size; y ++) {  //for every time y(the verticalplane) runs, x (the horizontal plane) then runs 8 times
            if (y % 2 == 0) {
                board += " ";
            }

            for (int x = 0; x < size; x ++){
                if ( x % 2 ==0) {
                    board += "#";
                } else {
                    board+= " ";
                }
            }
            board+= '\n';
        }
        return board;
    }
}
