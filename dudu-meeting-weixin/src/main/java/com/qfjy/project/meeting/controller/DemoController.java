package com.qfjy.project.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DemoController
 * @Author guoweixin
 * @Description TODO
 * @Date 2020/10/27 14:28
 * @Created by Administrator
 */
@Controller
public class DemoController {

    @RequestMapping("demo")
    @ResponseBody
    public String demo(){
        return "Hello dudu-meeting-weixin  Controller";
    }

}
