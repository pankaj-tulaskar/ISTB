<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>


</script>


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Page title -->
    <title>DTH | Login Page</title>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <!--<link rel="shortcut icon" type="image/ico" href="favicon.ico" />-->

    <!-- Vendor styles -->
    <link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.css" />
    <link rel="stylesheet" href="vendor/metisMenu/dist/metisMenu.css" />
    <link rel="stylesheet" href="vendor/animate.css/animate.css" />
    <link rel="stylesheet" href="vendor/bootstrap/dist/css/bootstrap.css" />

    <!-- App styles -->
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/pe-icon-7-stroke.css" />
   <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/helper.css" /> 
    <link rel="stylesheet" href="styles/style.css">

</head><div><marquee><strong>Infinity DTH Services</strong></marquee></div>
<body class="blank">
<div class="color-line"></div>
<br><br>
<div style="text-align:center">
<form action="Controller">
<h1><b>Search</b></h1><br>
 <p>Billing Type</p>
    <input type="radio" id="billingType1"
     name="billType" value="prepaid">
    <label for="billingType1">prepaid</label>
    <input type="radio" id="billingType2"
     name="billType" value="postpaid">
    <label for="billingType2">postpaid</label>

  <p>STB Type</p>
  <select name="stbType">
  <option value="standard">Standard</option>
  <option value="hd">HD</option>
  <option value="hd+">HD+</option>
  <option value="iptv">IPTV</option>
</select><br><br>
	<div>
  	<button type="hidden" class ="#">Search</button>
  	</div>
  
</form>
</div>
</body>
</html>