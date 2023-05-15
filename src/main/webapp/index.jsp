<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/index">
<h3>Product Description :</h3>
<input type="text" name="description" placeholder="Product Description" size="50"><br>
<h3>List Price:</h3>
<input type="text" name="price" placeholder="List Price" size="50"><br>
<h3>Discount Percent: </h3>
<input type="text" name="discount" placeholder="Discount Percent" size="50">
<input type="submit" name="submit" value="Calculate Discount">
</form>
</body>
</html>