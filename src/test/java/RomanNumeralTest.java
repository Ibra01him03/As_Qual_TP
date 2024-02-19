package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Exercice 0 Test:
public class RomanNumeralTest {
    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        // le test avec la valeur "XX" qui vaut 20 normalement  ne donne pas la resulta attendu 20
        int result = roman.convert("XX");
        Assertions.assertEquals(20, result);

    }



}

