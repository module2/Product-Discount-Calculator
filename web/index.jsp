<%--
  Created by IntelliJ IDEA.
  User: SON NGUYEN
  Date: 10/22/2018
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculate Discount</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <div class="CalculateDiscount">
      <h2>Product Discount Calculator</h2>
      <input type="text" name="ProductDescription" size="30"  placeholder="Product Description:" />
      <input type="number" name="ListPrice" size="30" placeholder="List Price:" />
      <input type="number" name="DiscountPercent" size="30" placeholder="Discount Percent:" />
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
  </body>
</html>
