/* PROGRAM:  UserBias
 * AUTHOR:  Drew Rautenberg           DESIGNER:  Dr. Kaminski
 * DESCRIPTION:  This modular program evaluates whether a user is biased 
 *      towards EVEN numbers or ODD numbers.  (NOTE:  It's just a small sample
 *      (N of 20), so it's really not scientific).
 * TO DO:
 *      Add a separate UserBiasHelper class (in a separate .java file).
 *      Write the 2 methods in that class:  addIfEven and printResults.
 *      Uncomment the 2 lines in the code below which call those methods.
 *      OUTPUT to console: (printed from printResults) [for example]:
 *                  20 tries:  9 even, 11 odd - NOT BIASED
 *          or      20 tries:  14 even, 6 odd - BIASED
 *          [NOTE:  to decide bias (inside printResults):
 *                  It's BIASED if the difference between numEvens and numOdds
 *                      is >= 20% of nTries.
 *                  Otherwise it's NOT BIASED.
 *****************************************************************************/
import javax.swing.JOptionPane;

public class UserBias {

    public static void main(String[] args) {
        int numTries = 20;
        int num;
        int numEvens = 0;
        for (int count = 1; count <= numTries; count++) {
            num = getNum(count,numTries);
            numEvens = UserBiasHelper.addIfEven(num, numEvens);
        }
        UserBiasHelper.printResults(numTries, numEvens);
        System.out.println("\nTHE END");
    }
    //*************************************************************************
    private static int getNum(int i, int n) {
        return Integer.parseInt(JOptionPane.showInputDialog
                ("[" + i + " of " + n + "] Enter a small integer"));
    }
}