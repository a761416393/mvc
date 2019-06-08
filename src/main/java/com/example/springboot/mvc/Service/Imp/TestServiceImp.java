package com.example.springboot.mvc.Service.Imp;

import com.example.springboot.mvc.Service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService {
    @Override
    public void testService() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
