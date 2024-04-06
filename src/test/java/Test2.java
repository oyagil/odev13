package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test2 {

    @DataProvider(name = "maasTestData")
    public Object[][] maasData() {
        return new Object[][]{
                {20, 20 * 500.0}, // 25 günden azsa sadece günlük maaş çarpılır
                {30, (25 * 500) + ((30 - 25) * 1000.0)} // 25 günü aşan her gün için ekstra prim eklenir
        };
    }

    @Test(dataProvider = "maasTestData")
    public void hesaplaMaas(int calisilanGunSayisi, double expectedMaas) {
        double actualMaas = MuhasebeProgrami.hesaplaMaas(calisilanGunSayisi);
        assertEquals(actualMaas, expectedMaas);
    }
}
