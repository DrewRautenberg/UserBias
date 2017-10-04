public class UserBiasHelper {
    public static int addIfEven(int num, int numTries){
        int out;
        out = numTries+num;
        return out;
    }
    public static void printResults(int numTries, int numEvens){
        double percent = numTries*.2;
        int numOdds = numTries-numEvens;
        int diff = Math.abs(numEvens-numOdds);
        if (diff >= percent){
            System.out.printf("%d tries: %d even, %d odd. BIASED", numTries, numEvens, numOdds);
        }
        else {
            System.out.printf("%d tries: %d even, %d odd. NOT BIASED", numTries, numEvens, numOdds);
        }



    }
}
