package com.example.springboot.mvc.Listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("--销毁进听器---"+sre.getSource());

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("--进入进听器---"+sre.getSource());

    }
}