<%--
  Created by IntelliJ IDEA.
  User: 311198
  Date: 2016/12/14
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <title>添加页面</title>
  <meta charset="utf-8">
  <%--控制网页为全屏幕大小 用于iphone手机端开发--%>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootStrap/css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootStrap/css/bootstrap-theme.min.css">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="<c:url value='/resources/jquery/jquery-2.1.4.min.js'/>"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="${pageContext.request.contextPath}/resources/bootStrap/js/bootstrap.min.js"></script>

  <%--bootstrap校验--%>
  <link href="${pageContext.request.contextPath}/resources/bootstrapvalidator/css/bootstrapValidator.min.css"/>
  <script src="${pageContext.request.contextPath}/resources/bootstrapvalidator/js/bootstrapValidator.min.js"></script>

  <style type="text/css">
         .form__div_style{
           font-size: 15px !important;
           font-weight: 600 !important;
           padding: 8px !important;
           width: 550px !important;
           margin: auto;
         }
  </style>
</head>
<body>
      <form role="form"  id="addForm" action="${pageContext.request.contextPath}/tree/addNode.action" >
        <div class="form-group form__div_style"  style="width: 550px">
          <label for="name">节点名称</label>
          <input type="text" class="form-control" style="height: 40px" id="name" name="name" value="${requestScope.treeEntity.name}" />
        </div>
        <div class="form-group form__div_style"  style="width: 550px">
            <label for="id">节点id</label>
        <input type="text" class="form-control" style="height: 40px" id="id" name="id"  value="${requestScope.treeEntity.id}" >
        </div>
          <div class="form-group form__div_style"  style="width: 550px">
              <label for="isRank">是否排名</label>
              <select class="form-control" id="isRank">
                  <option value="0" <c:if test="${requestScope.treeEntity.isRank == 0}">selected</c:if>>否 </option>
                  <option value="1" <c:if test="${requestScope.treeEntity.isRank == 1}">selected</c:if>>是 </option>
              </select>
          </div>
        <div class="form-group form__div_style"  style="width: 550px;display: none" >
          <label for="pId">父节点id</label>
          <input   style="height: 40px" id="pId" name="pId" value="${requestScope.treeEntity.pId}" />
        </div>
        <div class="form-group form__div_style">
          <label for="exampleInputFile">File input</label>
          <input type="file" id="exampleInputFile" style="height: 40px"/>
          <p class="help-block">Example block-level help text here.</p>
        </div>

          <button type="submit" class="btn btn-primary " style="width: 80px;height:40px;margin-left:400px">提交</button>
        <button type="button" id="bt_close" class="btn btn-default " style="width: 80px;height:40px;margin-left:10px">关闭</button>
      </form>

      <script type="text/javascript">

        var index ;
        var eleAddForm;

          $(function(){
            index= parent.layer.getFrameIndex(window.name); //获取窗口索引
            eleAddForm = $('#addForm');
            eleAddForm.bootstrapValidator({
               fields:{
                 name:{
                    message:'节点名称验证失败',
                    validators:{
                      notEmpty:{
                        message:'节点名称不能为空'
                      },
                      stringLength:{
                        min:1,
                        max:100,
                        message:'节点名称在1~100个字符之间'
                      }
                    }
                  },
                 id:{
                   message:'节点id验证失败',
                   validators: {
                     notEmpty: {
                       message: '功能代码不能为空，且必须是数字'
                     },
                     stringLength: {
                       min: 2,
                       max: 30,
                       message: '功能代码长度在2到30个字符之间'
                     },
                     regexp: {
                       regexp: /^[0-9]+$/,
                       message: '功能代码必须为数字'
                     }
                   }
                 }
               }
            });

//            给隐藏的父节点赋值
            var  parentID =String(${requestScope.treeEntity.pId});
            var   id =String(${requestScope.treeEntity.id});
          });

//        关闭iframe
        $('#bt_close').click(function(){
          parent.layer.close(index);
        });
      </script>




</body>
</html>
