package com.example.testingexample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsClassUnitTest {
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_removeExcessiveSpacesFromStringIsCalled_Then_NullPointerExceptionIsThrown(){
        Utils.removeExcessiveSpacesFromString(null);
    }

    @Test
    public void Given_EmptyString_When_removeExcessiveSpacesFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_removeExcessiveSpacesFromStringIsCalled_Then_EmptyStringIsReturned(){
        final String givenString = "   ";

        final String expectedResult = "";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_removeExcessiveSpacesFromStringIsCalled_Then_StringWithoutExcessiveSpacesIsReturned(){
        final String givenString = "Hello   world yey!  ";

        final String expectedResult = "Hello world yey!";
        final String actualResult = Utils.removeExcessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void Given_TextString_When_removeNumbersFromStringIsCalledWithNull_Then_ExceptionIsReturned(){
        final String givenString = null;
        Utils.removeExcessiveSpacesFromString(givenString);
    }

    @Test
    public void Given_EmptyString_When_removeNumbersFromStringIsCalledWithEmpty_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeNumbersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_AllLettersString_When_removeNumbersFromStringIsCalled_Then_ReturnedInitialString(){
        final String givenString = "abc";

        final String expectedResult = "abc";
        final String actualResult = Utils.removeNumbersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_AlphanumericString_When_removeNumbersFromStringIsCalled_Then_ReturnedLettersString(){
        final String givenString = "a1b2c";

        final String expectedResult = "abc";
        final String actualResult = Utils.removeNumbersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_AllNumbers_When_removeNumbersFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "123";

        final String expectedResult = "";
        final String actualResult = Utils.removeNumbersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }



    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_removeLettersFromStringIsCalled_Then_ExceptionIsReturned(){
        final String givenString = null;
        Utils.removeLettersFromString(givenString);
    }

    @Test
    public void Given_EmptyString_When_removeLettersFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeLettersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_AllLettersString_When_removeLettersFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "abc";

        final String expectedResult = "";
        final String actualResult = Utils.removeLettersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_AlphanumericString_When_removeLettersFromStringIsCalled_Then_ReturnedNumbersString(){
        final String givenString = "a1b2c";

        final String expectedResult = "12";
        final String actualResult = Utils.removeLettersFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }



//    @Test
//    public void Given_LettersString_When_changeCharactersToUnicodeIsCalledWithNumbersOnly_Then_ReturnedInitialString(){
//        final String givenString = "abc";
//
//        final String expectedResult = "979899";
//        final String actualResult = Utils.changeCharactersToUnicode(givenString);
//
//        assertEquals(expectedResult, actualResult);
//    }
}
