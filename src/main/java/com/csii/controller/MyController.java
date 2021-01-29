package com.csii.controller;

import com.csii.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @Auther:niulipeng
 * @Date:2021/1/10
 * @Description:com.csii.controller
 * @Version:1.0
 */
@Controller
public class MyController {
//    @RequestMapping("/hello")
//    public String sayHello(){
//        return "Hello";
//    }
    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello SpringBoot");
        return "hello";
    }

    @RequestMapping("thymeleaf")
    public String thymeleaf(ModelMap map, HttpSession session){
        session.setAttribute("name","zhangsan");
        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
        map.put("thObject",new Person("zhangsan",12, Arrays.asList(new String[]{"play","books"})));
        return "thymeleaf";
    }

    @RequestMapping("login")
    public String login(Model model){
        return "login";
    }
}
