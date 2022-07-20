package com.example.demo0715.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hello")

public class Helloworld {

    @ResponseBody
    @RequestMapping("/helloworld")
    public Map<String, Object> hellowold() {
        Map<String, Object> map = new HashMap<>();
        map.put("a", "122222");
        return map;
    }
}

