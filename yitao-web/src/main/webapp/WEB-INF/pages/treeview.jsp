<%--
  Created by IntelliJ IDEA.
  User: 311198
  Date: 2016/12/9
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <%--控制网页为全屏幕大小 用于iphone手机端开发--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootStrap/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootStrap/css/bootstrap-theme.min.css">

    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/zTree/css/demo.css" type="text/css">--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script src="<c:url value='/resources/jquery/jquery-2.1.4.min.js'/>"></script>
    <script src="<c:url value='/resources/zTree/js/jquery.ztree.all.min.js'/> "></script>
    <script src="${pageContext.request.contextPath}/resources/layer/layer.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/resources/bootStrap/js/bootstrap.min.js"></script>

    <script src="<c:url value='/resources/bootStrap/js/bootbox.min.js'/> "></script>
    <style type="text/css">

    </style>

</head>
<body>

    <%--tree--%>
     <div style="margin-left: 50px;margin-top: 20px">
        <ul id="treeDemo" class="ztree"></ul>
    </div>

    <%--按钮--%>
    <div style="margin-left:500px">
        <button type="button" class="btn btn-success"  id="addNode" onclick="changeNode('add');">添加</button>

        <button type="button" class="btn btn-warning" id="updateNode" onclick="changeNode('update');">修改</button>

        <button type="button" class="btn btn-danger" id="delNode" onclick="changeNode('del');">删除</button>
    </div>


<%--节点属性回显--%>
<div class="panel panel-default" style="margin-left:500px;width: 40%">
    <div class="panel-body">
        <table style="width:60%">
            <tr>
                <td class="site-mini-font td-title td_style" >节点名称:</td>
                <td id="showName" class="td-content"></td>
            </tr>
            <tr>
                <td class="site-mini-font  td-title td_style">节点id:</td>
                <td id="showID" class="td-content"></td>
            </tr>
            <tr>
                <td class="site-mini-font  td-title td_style">节点父id:</td>
                <td id="showType" class="td-content"></td>
            </tr>
        </table>
    </div>
</div>


<script type="text/javascript">

    var treeObj;
    var treeID;
    var myId;
    var parentId;
    var myName;

    var setting = {
        data: {
            simpleData: {
                enable: true
            }
        },
        callback: {
//           beforeClick: beforeClick,
            onClick: onClick
        },
        check:{
            enable: true,
            chkStyle: "checkbox",
            chkboxType: { "Y": "ps", "N": "ps" }
        }
    };

    //树结构
//    var zNodes =[
//        { id:1, pId:0, name:"父节点1 - 展开", open:true},
//        { id:11, pId:1, name:"父节点11 - 折叠"},
//        { id:111, pId:11, name:"叶子节点111"},
//        { id:112, pId:11, name:"叶子节点112"},
//        { id:113, pId:11, name:"叶子节点113"},
//        { id:114, pId:11, name:"叶子节点114"},
//        { id:12, pId:1, name:"父节点12 - 折叠"},
//        { id:121, pId:12, name:"叶子节点121"},
//        { id:122, pId:12, name:"叶子节点122"},
//        { id:123, pId:12, name:"叶子节点123"},
//        { id:124, pId:12, name:"叶子节点124"},
//        { id:13, pId:1, name:"父节点13 - 没有子节点", isParent:true},
//        { id:2, pId:0, name:"父节点2 - 折叠"},
//        { id:21, pId:2, name:"父节点21 - 展开", open:true},
//        { id:211, pId:21, name:"叶子节点211"},
//        { id:212, pId:21, name:"叶子节点212"},
//        { id:213, pId:21, name:"叶子节点213"},
//        { id:214, pId:21, name:"叶子节点214"},
//        { id:22, pId:2, name:"父节点22 - 折叠"},
//        { id:221, pId:22, name:"叶子节点221"},
//        { id:222, pId:22, name:"叶子节点222"},
//        { id:223, pId:22, name:"叶子节点223"},
//        { id:224, pId:22, name:"叶子节点224"},
//        { id:23, pId:2, name:"父节点23 - 折叠"},
//        { id:231, pId:23, name:"叶子节点231"},
//        { id:232, pId:23, name:"叶子节点232"},
//        { id:233, pId:23, name:"叶子节点233"},
//        { id:234, pId:23, name:"叶子节点234"},
//        { id:3, pId:0, name:"父节点3 - 没有子节点", isParent:true}
//    ];

//    $(document).ready(function(){
        $(function(){
            $.ajax({
                url:"${pageContext.request.contextPath}/tree/initTreeView.action",
                type:'post',
                dataType:'json',
                //data: "name=John&location=Boston", //第一种方式传参
                // data: {name:"John",location:"Boston"}  //第二种方式传参(推荐)
                success:function(data){
                    $.fn.zTree.init($("#treeDemo"), setting, data);
                }
            });
        });

//       before beforeClick
//       function beforeClick(treeId, treeNode, clickFlag){
//            alert(treeId);
//            alert(treeNode);
//            alert(clickFlag);
//       }

//      onClick
        function onClick(event,treeId,treeNode,clickFlag){
         treeObj=treeNode;
         treeID=this.treeId;
         myId = treeNode.id;
         parentId = treeNode.pId;
         name = treeNode.name;
    }

//    jquery 版本 大于1.7 可使用 点击事件
//      $("#addNode").on("click",function(){
//            alert("addd");
//      });

    function changeNode(crud){
        if(crud == "add"){
//            alert("add");
            if(myId !=null){
                layer.open({
                    type: 2,
                    title: '节点信息',
                    fixed: false, //不固定
                    maxmin: true,
                    shade: 0.8,
                    area: ['600px', '90%'],
                    content: '${pageContext.request.contextPath}/tree/addInfo.action?id='+myId //type =1 时 content中的内容为标签
                });
            } else{
                bootbox.alert("请选择一个父节点！！")
            }
        }else if(crud =="update"){
            if(myId !=null){
                layer.open({
                    type: 2,
                    title: '节点信息',
                    fixed: false, //不固定
                    maxmin: true,
                    shade: 0.8,
                    area: ['600px', '90%'],
                    content: '${pageContext.request.contextPath}/tree/updateInfo.action?id='+myId //type =1 时 content中的内容为标签
                });
            } else{
                bootbox.alert("请选择一个节点来修改")
            }
        } else{
            if(myId =="1"){
                bootbox.alert("根节点不能删除")
            } else{
                $.ajax({
                    url:"${pageContext.request.contextPath}/tree/delNode.action?id="+myId,
                    type:'post'
               });
            }
        }
    }



</SCRIPT>
</body>
</html>
