class UserBiasHelper {
    static int addIfEven(int num, int numTries) {
        if (num % 2 == 0) {
            return numTries + 1;
        } else {
            return numTries;
        }
    }

    static void printResults(int numTries, int numEvens) {
        double percent = numTries * .2;
        int numOdds = numTries - numEvens;
        int diff = Math.abs(numEvens - numOdds);
        if (diff >= percent) {
            System.out.printf("%d tries: %d even, %d odd. BIASED", numTries, numEvens, numOdds);
        } else {
            System.out.printf("%d tries: %d even, %d odd. NOT BIASED", numTries, numEvens, numOdds);
        }


    }
}
