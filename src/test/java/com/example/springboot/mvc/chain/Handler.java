package com.example.springboot.mvc.chain;

import com.example.springboot.mvc.dto.CommendParam;

public abstract class Handler {
    private Handler nextHandler;

    private CommendParam commendParam;

    public Handler(CommendParam commendParam) {
        this.commendParam = commendParam;
    }

    public Handler setNext(Handler handler){
        this.nextHandler=handler;
        return handler;
    }

    public  abstract boolean doNeed(CommendParam commendParam);

    protected void done(CommendParam commendParam){
        System.out.println("----进入抽象类方法-----");

    }

    public void support(CommendParam commendParam){
        //while(this.nextHandler!=null){
            if(doNeed(commendParam)){
                done(commendParam);
            }
            nextHandler.support(commendParam);
        //}

    }
}
