<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form action="Controller">
<p>Billing Type</p>
 <div id = "jack">
    <input type="radio" id="billingType1"
     name="billType" value="prepaid">
    <label for="billingType1">prepaid</label>
    <input type="radio" id="billingType2"
     name="billType" value="postpaid">
    <label for="billingType2">postpaid</label>

  </div>
  <div>
  <p>STB Type</p>
  <select name="stbType">
  <option value="standard">Standard</option>
  <option value="hd">HD</option>
  <option value="hd+">HD+</option>
  <option value="iptv">IPTV</option>
</select><br><br>
  </div>

  <div>
  <button type="hidden">Search</button>
  </div>
</form>
</body>
</html>