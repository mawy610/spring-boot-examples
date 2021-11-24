package com.neo.service;

import org.springframework.stereotype.Component;

@Component
public class PrintHeihei {
    public StringBuffer printHeihei(){
        StringBuffer res = new StringBuffer();
        StringBuffer unit = new StringBuffer("嘿嘿🤤老婆🤤");
        for(int i = 0; i < 500; i ++){
            res.append(unit);
        }
        return res;
    }
}
