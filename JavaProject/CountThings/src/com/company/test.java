package com.company;

import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void MCDC(){
        referentieFoto minimumaantal = new referentieFoto();

       Assert.assertTrue(minimumaantal.uploaden(4,4,4));
       Assert.assertFalse(minimumaantal.uploaden(1,2,5));
       Assert.assertFalse(minimumaantal.uploaden(2,2,5));
       Assert.assertFalse(minimumaantal.uploaden(3,3,7));
    }

    @Test
    public void UploadGeslaagd(){
        Assert.assertTrue(true);
    }

    @Test
    public void FotoVergeleken(){
        Assert.assertTrue(true);
    }

}
