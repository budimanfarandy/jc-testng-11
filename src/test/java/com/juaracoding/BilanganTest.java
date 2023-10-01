package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BilanganTest {


    //testBilanganGenap
    @Test
    public void testBilanganGenap(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(4),"genap");
    }
    //testBilanganGanjil
    @Test
    public void testBilanganGanjil(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGenapGanjil(5),"ganjil");
    }
}
