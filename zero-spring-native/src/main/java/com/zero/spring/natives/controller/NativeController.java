package com.zero.spring.natives.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("native")
public class NativeController {

    @PostMapping("say")
    public Map<String, Object> say() {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("code", 200);
            map.put("status", "success");
            map.put("message", "Welcome to Service");
            map.put("result", "服务正常运行中");
            return map;
        } catch (Exception e) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", 200);
            map.put("status", "error");
            map.put("message", e.getMessage());
            map.put("result", e);
            return map;
        }
    }

}
