package com.example.poly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class cat extends Animal{
    @Override
    public String bark(String bark){
        return bark;
    }
    @Override
    public void eat(){
        log.info("고양이가 밥을 먹는다");
    }
    @Override
    public void sleep(){
        log.info("고양이가 잠을 잔다");
    }
    public void catOnly(){
        log.info("고양이만 되는 기능");
    }
}
