package com.fivem.iscow.iscowcloud.exception;

import org.springframework.stereotype.Service;

@Service
public class IsCowException {
    public static String Limit(){
        return "sentinel 限流";
    }
}
