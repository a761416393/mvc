package com.example.springboot.mvc.chain;

import com.example.springboot.mvc.dto.CommendParam;

public class CCC extends Handler{


    public CCC(CommendParam commendParam) {
        super(commendParam);
    }

    @Override
    public boolean doNeed(CommendParam commendParam) {
        return true;
    }

    protected void done(CommendParam commendParam){
        System.out.println("----进CCC类方法-----");

    }

}
