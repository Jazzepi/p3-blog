package com.pinnegar;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void calculator_can_mix_operations() throws Exception {
        //ARRANGE
        Calculator.SubtractingCalculator subtractingCalculator = calculator.subtract(0);
        Calculator.DividingCalculator dividingCalculator = calculator.divide(-4);

        //ACT
        int subtractingAnswer = subtractingCalculator.from(-500);
        int dividingAnswer = dividingCalculator.by(2);

        //ASSERT
        assertThat(subtractingAnswer).isEqualTo(-500);
        assertThat(dividingAnswer).isEqualTo(-2);
    }

    @Test
    public void calculator_should_divide_negative_numbers() throws Exception {
        assertThat(calculator.divide(-4).by(2)).isEqualTo(-2);
    }

    @Test
    public void calculator_should_subtract() {
        assertThat(calculator.subtract(500).from(-3)).isEqualTo(-503);
    }

    @Test
    public void calculator_should_subtract_both_negative_numbers() {
        assertThat(calculator.subtract(-100).from(-3)).isEqualTo(97);
    }

    @Test
    public void calculator_should_divide_by_negative_numbers() throws Exception {
        assertThat(calculator.divide(10).by(-3)).isEqualTo(-3);
    }

    @Test(expected = Exception.class)
    public void calculator_should_throw_exception() throws Exception {
        assertThat(calculator.divide(-100).by(0)).isEqualTo(97);
    }

}
