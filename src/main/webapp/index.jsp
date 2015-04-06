<%--
  Created by IntelliJ IDEA.
  User: hawky
  Date: 15-4-6
  Time: 下午12:25
  To change this template use File | Settings | File Templates.
--%>
<html>
<body>
<h2>Add Book</h2>
<form method="post" action="<%=request.getContextPath() %>/book.do?method=add">
    bookname:<input type="text" name="property1" id="property1">
    author:<input type="text" name="property2" id="property2">
    <input type="submit" value="Add">
</form>
</body>
</html>
