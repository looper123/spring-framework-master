package com.itcast.yitao.design.model.compositeModel;

/**
 * Created by 311198 on 2017/2/9.
 */
public class Tree {

   public  TreeNode treeNode=null;

    public Tree(String name) {

        treeNode = new TreeNode(name);
    }
}
