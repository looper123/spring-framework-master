package com.itcast.yitao.controller;

import com.itcast.yitao.pojo.UserEntity;
import com.itcast.yitao.service.IUserService;
import com.itcast.yitao.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 311198 on 2016/12/1.
 */
@Controller
@RequestMapping("/user")
public class UserController  {

    @Autowired
    private IUserService userService;



    @RequestMapping("/queryAll")
    public ModelAndView queryAllUser(@RequestParam(name="num",defaultValue = "1") int num){
        Paging paging =new Paging(num,userService.counts());
        List<UserEntity> userEntities = userService.queryAllUser(num);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/pageslipt");
        modelAndView.addObject("userList", userEntities);
        modelAndView.addObject("paging",paging);
        return modelAndView;
    }

    @RequestMapping("/init")
    public ModelAndView initTest(ModelAndView modelAndView){
        modelAndView.setViewName("webSocketTest");
        return modelAndView;
    }

}
