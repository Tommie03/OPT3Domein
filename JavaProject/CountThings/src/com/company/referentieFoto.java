package com.company;

public class referentieFoto {

    public Boolean uploaden(Integer refFoto, Integer minimumaantalFoto, Integer limiet){

        if (refFoto < minimumaantalFoto || minimumaantalFoto <= 3 || limiet > 6) {
            return false;
        } else {
            return true;
        }
    }
}

