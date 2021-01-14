package com.fivem.iscow.iscowcloud.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.fivem.iscow.iscowcloud.exception.IsCowException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/is-cow")
public class IsCowController {
    @GetMapping("getIsCow")
    @SentinelResource(value="gic",fallback = "limit")
    public String getIsCow(){
        return "is-cow";
    }
    @GetMapping("getGroup")
    @SentinelResource("grp")
    public String getGroup(){
        return "group";
    }
    @GetMapping("default")
    public String getDefault(){
        return "default";
    }

    public String limit(){
        return "sentinel 限流";
    }
}
