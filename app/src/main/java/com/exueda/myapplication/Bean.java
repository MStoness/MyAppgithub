package com.exueda.myapplication;

/**
 * Created by exueda on 2017/9/8.
 */

public class Bean implements HaListener{

    public static int getZhi() {
        return zhi;
    }

    public static void setZhi(int zhi) {
        Bean.zhi = zhi;
    }

    public static int zhi=10;



    public HaListener getData(){

        return null;
    }


    @Override
    public void hh() {

    }
}
