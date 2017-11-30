<%--
  Created by IntelliJ IDEA.
  User: 311198
  Date: 2016/12/1
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootStrap/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="<c:url value='/resources/bootStrap/css/bootstrap-theme.min.css'/>">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="<c:url value='/resources/jquery/jquery-1.11.1.min.js'/>"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/resources/bootStrap/js/bootstrap.min.js"></script>
    <style>
         .page_li{
            float:left;
             list-style: none;
        }
    </style>
</head>
<body>
   <div align="center">
       <table>
         <thead>
           <tr>
             <th>工号</th>
             <th>用户名</th>
             <th>职位</th>
             <th>组织类型</th>
             <th>组织id</th>
           </tr>
         </thead>
        <tbody>
        <c:forEach var="user"  items="${requestScope.userList}" >
          <tr>
             <td> ${user.userCode}</td>
             <td> ${user.empName}</td>
             <td> ${user.jobCategoryName}</td>
             <td> ${user.orgTypeName}</td>
             <td> ${user.orgId}</td>
          </tr>
        </c:forEach>
        </tbody>
       </table>
       <%--父级标签的宽度width 会限制 子级的标签之间的margin大小--%>
       <ul class="pagination">
           <c:if test="${requestScope.paging.hasLastPage}">
               <li><a href="${pageContext.request.contextPath}/user/queryAll.action?num=${requestScope.paging.currentPage-1}">&laquo;</a></li>
           </c:if>
           <c:forEach var="page"  items="${requestScope.paging.labelList}">
               <c:choose>
                   <c:when test="${requestScope.paging.currentPage==page}">
                       <li ><a style="color: red" href="${pageContext.request.contextPath}/user/queryAll.action?num=${page}">${page}</a></li>
                   </c:when>
                   <c:otherwise>
                       <li ><a  href="${pageContext.request.contextPath}/user/queryAll.action?num=${page}">${page}</a></li>
                   </c:otherwise>
               </c:choose>
           </c:forEach>
           <c:if test="${requestScope.paging.hasNextPage}">
               <li><a href="${pageContext.request.contextPath}/user/queryAll.action?num=${requestScope.paging.currentPage+1}">&raquo;</a></li>
           </c:if>
           <li><a href="#">共${requestScope.paging.totalPage}页</a></li>
       </ul>
   </div>






</body>
</html>
