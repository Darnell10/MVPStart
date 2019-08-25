package com.example.mvpstart;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private Calculator testSubject = new Calculator();

    @Test
    public void GivenInputIs0_whenFeatureOnIsCalled_ReturnAsResult() {
        //Given
        String input = "0";
        int expect = 0;

        //when
        int result = testSubject.featureOne(input);

        //then

        Assert.assertEquals(result, expect);
    }


    @Test
    public void GivenInputIsString_whenFeatureIsCalled_ReturnAResult() {
        // Given
        String input = "Hello World";
        int expect = 0;

        //when
        int result = testSubject.featureOne(input);

        //then
        Assert.assertEquals(result, expect);


    }

    @Test
    public void GivenInputNegativeNumber() {
        //given
        String input = "-1";
        int expected = 0;

        //when
        int result = testSubject.featureOne(input);

        //then

        Assert.assertEquals(result, expected);
    }

    @Test
    public void GivenInputIsString_WhenFeatureOneIsCalled_Return0AsResult() {
        //Given
        String input = "Hello World";
        int expected = 0;

        //when
        int result = testSubject.featureOne(input);

        //Then
        Assert.assertEquals(result, expected);
    }
}
