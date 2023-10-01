package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;
public class KotakTest {

    @Test
    public void testLuasKotak(){
        Kotak kotak = new Kotak();
        Assert.assertEquals(kotak.luas(5),25);
    }
    @Test
    public void testVolumeKolamKotak(){
        Kotak kotak = new Kotak();
        Assert.assertEquals(kotak.volume(5),125);
    }

}
