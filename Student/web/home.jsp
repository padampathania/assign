<%-- 
    Document   : home.jsp
    Created on : 27 Nov, 2018, 1:32:55 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<style type="text/css">
.mySlides {display:none;}

	.topbar
	{
		margin-top: 20px;
	}
	.topbar a
	{
		color: black;
		text-decoration: none;
		size: 24px;
		font-family: verdana;
		padding: 130px;		
	}
	.topbar a:hover
	{
		color: red;
	}
	marquee
	{
		color: white;
		font-family: verdana;
		padding-top:4px; 
		word-wrap: 14px;
	}
</style>
</head>
<body>
    
	<div class="logout" >
		<a href="index.jsp" target="blank" style="margin-left: 95%; text-decoration:none; ">Logout</a>
	</div>
<div class ="topbar">
  <a href="studentinfo.html" target="_self">Student Info</a>
  <a href="marks.html" target="_self">Marks</a>
  <a href="attendance.html" target="_self">Attendance</a>
  <a href="time.html		" target="_self">Time Table</a>
</div>
<div class="marque">
	<marquee height="30" hspace="40" bgcolor="lightgreen" width="87%" vspace="40">Welcome XYZ (You are currently enrolled in 2016-CU-BE-CSE</marquee>
</div>

 <div class="w3-content w3-section" style="margin-left:100px;">
  <img class="mySlides" src="img2.jpg" style="width:1200px; height:500px;">
  <img class="mySlides" src="img3.jpeg" style="width:1200px;height:500px;">
  <img class="mySlides" src="img4.jpeg" style="width:1200px;height:500px;">
</div>

</body>
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>

</html>
