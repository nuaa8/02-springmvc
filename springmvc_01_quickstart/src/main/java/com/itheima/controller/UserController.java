package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//1.导入springmvc的jar包
//2.定义controller  （定义表现层控制器bean）
//2.1使用@Controller定义bean
@Controller
public class UserController {

    //2.2设置使用当前操作的访问路径  (设置映射路径为/save，即外部访问路径)
    @RequestMapping("/save")
    //2.3设置当前操作的返回值类型   (设置当前操作返回结果为指定json数据（本质上是一个字符串信息）)
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'info':'springmvc'}"; //返回一的json数据
    }

    //设置映射路径为/delete，即外部访问路径
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user save ...");
        return "{'info':'springmvc delete'}";
    }
}
