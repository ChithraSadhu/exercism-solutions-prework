class PrimeCalculator {

    private static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    int nth(int nth) {

        if(nth<1) throw new IllegalArgumentException();

        int count = 0; // Counter for prime numbers
        int number = 2; // Current number to check

        while (count < nth) {
            if (isPrime(number)) {
                count++;
                if (count == nth) {
                    break;
                }
            }
            number++;
        }
        return number;
    }

}
