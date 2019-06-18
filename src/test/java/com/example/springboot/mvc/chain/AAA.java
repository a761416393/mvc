package com.example.springboot.mvc.chain;

import com.example.springboot.mvc.dto.CommendParam;

public class AAA extends Handler{



    @Override
    public boolean doNeed(CommendParam commendParam) {
        return true;
    }

    public void done(CommendParam commendParam){
        System.out.println("----进AAA类方法-----");

    }

}
