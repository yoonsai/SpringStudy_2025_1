package com.example.poly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {
    public String bark(String bark){
        return bark;
    }

    public void eat(){
        log.info("먹는다");
    }

    public void sleep(){
        log.info("잔다");
    }
}
