package com.hdkj.lifecyle.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xu.MinZhe
 * @version V1.0
 * @Project lifecyle
 * @Package com.hdkj.lifecyle.web
 * @Description
 * @Date 2018/8/28 15:18
 */
@RestController
@RequestMapping("index")
public class IndexController {
private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    

    @GetMapping("IndexController")
    public String index() throws Exception {
        return "IndexController";
    }
    
    
}

