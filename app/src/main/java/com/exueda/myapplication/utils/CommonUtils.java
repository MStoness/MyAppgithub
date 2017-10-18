package com.exueda.myapplication.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by exueda on 2017/10/18.
 */

public class CommonUtils {


    public static List<String> getData() {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            stringList.add(i + "假的");
        }

        return stringList;
    }
}
