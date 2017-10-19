package com.exueda.myapplication.utils;

import com.exueda.myapplication.bean.Bean;

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


    public static List<Bean> getBeanData() {

        List<Bean> stringList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            Bean bean=new Bean();
            bean.setZhi(i+"手里有本书");
            stringList.add(bean);
        }

        return stringList;
    }
}
