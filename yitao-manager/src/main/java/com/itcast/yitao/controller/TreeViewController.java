package com.itcast.yitao.controller;

import com.alibaba.fastjson.JSON;
import com.itcast.yitao.pojo.TreeEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 311198 on 2016/12/10.
 */
@Controller
@RequestMapping("/tree")
public class TreeViewController {


    //   跳转到首页
    @RequestMapping("skip")
    public ModelAndView skip(ModelAndView modelAndView) {
        modelAndView.setViewName("/treeview");
        return modelAndView;
    }

    //表示表示将功能处理方法将生产json格式的数据，此时根据请求头中的Accept进行匹配，如请求头“Accept:application/json”时即可匹配
    @RequestMapping(value = "initTreeView", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    //表示该方法的返回结果直接写入HTTP response body中，返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；
    @ResponseBody
    public String initTreeView() {
        TreeEntity treeEntity = new TreeEntity();
        TreeEntity treeEntity1 = new TreeEntity();
        TreeEntity treeEntity2 = new TreeEntity();
        TreeEntity treeEntity3 = new TreeEntity();
        TreeEntity treeEntity4 = new TreeEntity();
        treeEntity.setId("1");
        treeEntity1.setId("11");
        treeEntity2.setId("111");
        treeEntity3.setId("1111");
        treeEntity4.setId("1112");
        treeEntity.setpId("0");
        treeEntity1.setpId("1");
        treeEntity2.setpId("11");
        treeEntity3.setpId("111");
        treeEntity4.setpId("111");
        treeEntity.setName("根节点");
        treeEntity1.setName("level1节点");
        treeEntity2.setName("level2节点");
        treeEntity3.setName("level3节点");
        treeEntity4.setName("level4节点");
        List<TreeEntity> list = new ArrayList<>();
        list.add(treeEntity);
        list.add(treeEntity1);
        list.add(treeEntity2);
        list.add(treeEntity3);
        list.add(treeEntity4);
        String treeNodes = JSON.toJSONString(list);
        return treeNodes;
    }

    //    跳转到表单页面
    @RequestMapping("/addInfo")
    public ModelAndView addInfo(ModelAndView modelAndView, @RequestParam(name = "id", defaultValue = "") String id) {
        modelAndView.setViewName("addInfo");
        modelAndView.addObject("pId", id);
        return modelAndView;
    }

    //添加表单信息
    @RequestMapping("/addNode")
    public ResponseEntity<TreeEntity> addForm(@ModelAttribute TreeEntity treeEntity) {
        try {
            String id = treeEntity.getId();
            String name = treeEntity.getName();
            String pId = treeEntity.getpId();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(treeEntity);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(treeEntity);
    }


    //    回显表单信息
    @RequestMapping(value = "updateInfo")
    public ModelAndView updateInfo(@RequestParam String id) {
        TreeEntity treeEntity = new TreeEntity();
        treeEntity.setId("1112");
        treeEntity.setName("level4节点");
        treeEntity.setpId("111");
        treeEntity.setIsRank(1);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updateInfo");
        modelAndView.addObject("treeEntity", treeEntity);
        return modelAndView;
    }

    //    修改操作
    @RequestMapping("updateNode")
    public ResponseEntity<TreeEntity> updateNode(@ModelAttribute TreeEntity treeEntity) {
        treeEntity.getId();
        treeEntity.getName();
        treeEntity.getpId();
        return ResponseEntity.status(HttpStatus.CREATED).body(treeEntity);
    }

    //    删除操作
    @RequestMapping("delNode")
    public ResponseEntity<TreeEntity> delNode(@RequestParam String id) {
        TreeEntity treeEntity = new TreeEntity();
        treeEntity.setId("1112");
        treeEntity.setName("level4节点");
        treeEntity.setpId("111");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(treeEntity);
    }


}
