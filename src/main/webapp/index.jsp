<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 12-Aug-21
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>SIMPLE CALCULATOR</h2>
  <FORM action="/calculator" method="post">
    <label>First operand: </label>
    <input type="text" name="first" placeholder="First operand"><br>
    <label>Operator: </label>
    <select name="operator">
      <option value="+">Add</option>
      <option value="-">Sub</option>
      <option value="*">Multi</option>
      <option value="/">Div</option>
    </select><br>
    <label>Second operand: </label>
    <input type="text" name="second" placeholder="Second operand"><br>
    <INPUT type="submit" value="calculator">
  </FORM>
  <h3>Result: ${Result}</h3>
  </body>
</html>
