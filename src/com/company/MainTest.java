package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void poleStożka() {
        //given
        int wynik = 13;
        int r = 6;

        //when
        double sprawdzenie = Main.poleStożka(r);

        //then

        assertEquals(wynik, sprawdzenie);


    }

}