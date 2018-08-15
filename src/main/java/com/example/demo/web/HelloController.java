package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/index1")
    public String index1(HttpServletRequest request){
        request.setAttribute("title","web页面");
        request.setAttribute("desc","进入web页面");
        // 返回的 index 默认映射到 src/main/resources/templates/xxxx.html
        return "ThyPage";
    }

    /**
     * 获取参数测试
     * @param map
     * @param urlarg
     * @return
     */
    @GetMapping("/thypage")
    public ModelAndView ThyPage(HashMap<String,Object> map, String urlarg) {
        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("ThyPage");
        view.addObject("title","页面名称");
        view.addObject("desc", "欢迎进入battcn-web 系统");
        map.put("backendValue","hello");
        map.put("fontendValue",urlarg);
        return view;
    }
}
