<%--
  Created by IntelliJ IDEA.
  User: heshan_c
  Date: 12/17/2020
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ISO Message Unpack</title>
  </head>
  <body>
  <style>
      h1 {text-align: center;}
      form {text-align: center;}
  </style>
   <h1>ISO Message Unpack</h1>

   <form action="isomessage" method="post">
     <label for="myfile">Select a file:</label>
     <input type="file" id="myfile" name="myfile"><br><br>
     <input type="submit">
   </form>
  </body>
</html>
