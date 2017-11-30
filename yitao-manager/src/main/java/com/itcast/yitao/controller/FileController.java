package com.itcast.yitao.controller;

import com.itcast.yitao.utils.FilesUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by 311198 on 2017/4/6.
 */
@Controller
@RequestMapping("/file")
public class FileController {


    @RequestMapping("upload")
    @ResponseBody
    public String DownLoad(@RequestParam(name = "uploadFile") MultipartFile multipartFile) {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        //调用保存文件的帮助类进行保存文件，并返回文件的相对路径
        String filePath = FilesUtils.FilesUpload_transferTo( multipartFile, "/files/upload");
        return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }

    @RequestMapping("/uploadProgress")
    public ModelAndView DownLoad(ModelAndView modelAndView) {
        modelAndView.setViewName("/register");
        return modelAndView;
    }

    @RequestMapping("/getmethod")
    public ModelAndView getmethod(ModelAndView modelAndView,String username ) throws UnsupportedEncodingException {
        System.out.println("----------"+username);
        String utfStr = new String(username.getBytes("iso-8859-1"), "utf-8");
        System.out.println("---------utf-8"+utfStr);
        modelAndView.setViewName("/register");
        return modelAndView;
    }


}
