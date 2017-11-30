<%--
  Created by IntelliJ IDEA.
  User: 311198
  Date: 2016/12/19
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title></title>

  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/websocket/swfobject.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/websocket/web_socket.js"></script>
  <script src="<c:url value='/resources/jquery/jquery-2.1.4.min.js'/>"></script>
  <script type="text/javascript">

    // Set URL of your WebSocketMain.swf here:
    WEB_SOCKET_SWF_LOCATION = "WebSocketMain.swf";
    // Set this to dump debug message from Flash to console.log:
    WEB_SOCKET_DEBUG = true;

    // Everything below is the same as using standard WebSocket.

    var ws;

    function init() {

      // Connect to Web Socket.
      // Change host/port here to your own Web Socket server.
      ws = new WebSocket("ws://localhost:8181//yitao-web/myWebSokect");

      // Set event handlers.
      ws.onopen = function() {
        output("onopen");
      };
      ws.onmessage = function(e) {
        // e.data contains received string.
          output("onmessage: " +e.data);
      };
      ws.onclose = function() {
        output("onclose");
      };
      ws.onerror = function() {
        output("onerror");
      };

    }

    function onSubmit() {
      var input = document.getElementById("input");
      // You can send message to the Web Socket using ws.send.
      ws.send(input.value);
      output("send: " + input.value);
      input.value = "";
      input.focus();
    }

    function onCloseClick() {
      ws.close();
    }

    function output(str) {
      var log = document.getElementById("log");
      var escaped = str.replace(/&/, "&amp;").replace(/</, "&lt;").
              replace(/>/, "&gt;").replace(/"/, "&quot;"); // "
      log.innerHTML = escaped + "<br>" + log.innerHTML;
    }

  </script>
</head>

<body onload="init();">
<form onsubmit="onSubmit(); return false;">
  <input type="text" id="input">
  <input type="submit" value="Send">
  <button onclick="onCloseClick(); return false;">close</button>
</form>
<div id="log"></div>
</body>

</body>
</html>
