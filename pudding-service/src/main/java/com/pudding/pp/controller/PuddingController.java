package com.pudding.pp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: ð¨ð³MJLIÂ° â
 * @Date: 2022/2/24 ä¸å5:21
 * @Name: PuddingController
 */
@RestController
public class PuddingController {

    @GetMapping ("/test")
    public HashMap demo () {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("msg" , "æåï¼");
        objectObjectHashMap.put("code" , 200);
        objectObjectHashMap.put("data" , "null");
        return objectObjectHashMap;

    }
}
