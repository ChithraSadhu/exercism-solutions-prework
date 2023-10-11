import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        } else if ( o instanceof PythagoreanTriplet ) {
            PythagoreanTriplet pt = (PythagoreanTriplet) o;
            return a == pt.a && b == pt.b && c == pt.c;
        } else {
            return false;
        }
    }
    static class TripletListBuilder {
        private int n;
        private Integer maxFactor = null;
        private static final double PERIMETER_RATIO_LIMIT = 1 + 1 + Math.sqrt(2);
        TripletListBuilder thatSumTo(int sum) {
            this.n = sum;
            if ( maxFactor == null ) {
                maxFactor = n;
            }

            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a <= Math.floor(n / PERIMETER_RATIO_LIMIT); a++) {
                int numerator = a * a + (int) Math.pow(n-a, 2);
                int denominator = 2 * (n - a);
                if ( numerator % denominator == 0 ) {
                    int c = numerator / denominator;
                    if ( c <= maxFactor ) {
                        int b = n - a - c;
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            return triplets;
        }

    }

}