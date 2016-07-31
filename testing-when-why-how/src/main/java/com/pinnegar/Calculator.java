package com.pinnegar;

public class Calculator {

    public SubtractingCalculator subtract(int dividend) {
        return new SubtractingCalculator(dividend);
    }

    public class SubtractingCalculator {
        private int subtractor;

        private SubtractingCalculator(int subtractor) {
            this.subtractor = subtractor;
        }

        public int from(int startingAmount) {
            return  startingAmount - subtractor;
        }
    }


    public DividingCalculator divide(int dividend) {
        return new DividingCalculator(dividend);
    }

    public class DividingCalculator {
        private int dividend;

        private DividingCalculator(int dividend) {
            this.dividend = dividend;
        }

        public int by(int divisor) throws Exception {
            if (divisor == 0) {
                throw new Exception("You tried to divide [" +  dividend + "] by zero which is illegal.");
            }
            return dividend / divisor;
        }
    }
}
