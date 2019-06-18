package com.example.springboot.mvc.chain;

import com.example.springboot.mvc.dto.CommendParam;

public class Start extends Handler{


    @Override
    public boolean doNeed(CommendParam commendParam) {
        return true;
    }

    public  void done(CommendParam commendParam){
        System.out.println("----进开始类方法-----");
        super.done(commendParam);
    }

}
