package com.example.springboot.mvc.chain;

import com.example.springboot.mvc.dto.CommendParam;

public abstract class Handler {
    private Handler nextHandler;
    private CommendParam commend;
    public Handler setNext(Handler handler){
        this.nextHandler=handler;
        return handler;
    }

    public  abstract boolean doNeed(CommendParam commendParam);

    public  void done(CommendParam commendParam){
        System.out.println("----进入抽象类方法-----");
        Handler handler = this.nextHandler;
        while(handler!=null){
            if(handler.doNeed(commendParam)){
                handler.done(commendParam);
            }
            handler=handler.nextHandler;
        }
    }

    public void setCommend(CommendParam commend) {
        this.commend = commend;
    }

//    public void support(CommendParam commendParam){
//
//
//    }
}
