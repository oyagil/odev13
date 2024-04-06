package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test1 {

    @Test
    public void hesaplaMaas_25GunAltinda() {
        int calisilanGunSayisi = 20;
        double expectedMaas = 20 * 500; // 25 günden azsa sadece günlük maaş çarpılır
        double actualMaas = MuhasebeProgrami.hesaplaMaas(calisilanGunSayisi);
        assertEquals(actualMaas, expectedMaas);
    }

    @Test
    public void hesaplaMaas_25GunUstu() {
        int calisilanGunSayisi = 30;
        double expectedMaas = (25 * 500) + ((30 - 25) * 1000); // 25 günü aşan her gün için ekstra prim eklenir
        double actualMaas = MuhasebeProgrami.hesaplaMaas(calisilanGunSayisi);
        assertEquals(actualMaas, expectedMaas);
    }
}

