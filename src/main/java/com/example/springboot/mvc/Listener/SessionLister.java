package com.example.springboot.mvc.Listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionLister implements HttpSessionListener {
    public static int count =0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ++count;
        System.out.println("--session进听器创建---"+count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("--session进听器销毁---"+count);

    }
}
