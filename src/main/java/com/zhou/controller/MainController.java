package com.zhou.controller;

import com.zhou.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/5/6.
 */
@Controller
@RequestMapping("/main")
public class MainController extends BaseController {

    @RequestMapping("/index")
    public ModelAndView toIndex(){
//        return new ModelAndView(VIEW_PATH+"main");
        return new ModelAndView(VIEW_PATH+"index/index_new");
    }
}
