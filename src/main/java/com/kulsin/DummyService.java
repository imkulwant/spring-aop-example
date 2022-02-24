package com.kulsin;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public String printMessage(String msg) {
        System.out.println(msg);
        return msg;
    }

}
