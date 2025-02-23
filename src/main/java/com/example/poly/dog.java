package com.example.poly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class dog extends Animal{
    @Override
    public String bark(String bark){
        return bark;
    }
    @Override
    public void eat(){
        log.info("강아지 밥을 먹는다");
    }
    @Override
    public void sleep(){
        log.info("강아지가 잠을 잔다");
    }

    public void dogOnly(){
        log.info("강아지만 되는 기능");
    }
}
