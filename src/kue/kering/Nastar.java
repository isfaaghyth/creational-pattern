package kue.kering;

import type.KueKering;

public class Nastar extends KueKering {

    @Override
    public float price() {
       return 25.0f;
    }

    @Override
    public String name() {
        return "Nastar";
    }
    
}
