package com.example.springproxy.jdk;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BImpl implements BInterface{
    @Override
    public String call() {
      log.info("B call");
        return "B";
    }
}
