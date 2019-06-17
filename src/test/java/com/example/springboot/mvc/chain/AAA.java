package com.example.springboot.mvc.chain;

import com.example.springboot.mvc.dto.CommendParam;

public class AAA extends Handler{


    public AAA(CommendParam commendParam) {
        super(commendParam);
    }

    @Override
    public boolean doNeed(CommendParam commendParam) {
        return true;
    }

    protected void done(CommendParam commendParam){
        System.out.println("----进AAA类方法-----");

    }

}
