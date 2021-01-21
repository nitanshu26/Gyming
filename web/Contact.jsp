<%-- 
    Document   : Contact
    Created on : Feb 2, 2020, 12:09:52 PM
    Author     : Nitanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="style.css"/>
        <script type="text/javascript" src="javascript.js"></script>
        <title>Contact</title>
    </head>
    <jsp:include page="header.jsp"/>
    <body>
         <div class="back-img">       
    <form method="get" class="form2">
        <h1>Contact Us</h1><br>
    <label for="number"><b>Contact No.</b></label>
    <input type="text" placeholder="Enter Your Number" class="input1" name="number" required>
    <br>
    <label for="names"><b>Name</b></label>
    <input type="text" placeholder="Enter Your Name" class="input1" name="names" required>
    <br>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Your Email Address" class="input1" name="email" required>
    <br>
    <label for="msg"><b>Message</b></label><br>&nbsp;
    <textarea rows="8" cols="60" name="msg" ></textarea>
    <br>
    <button type="submit" class="btn3" onclick="jumpp()">Send Message</button>
    
  </form>
            <br>
        </div>
    </body>
<jsp:include page="footer.jsp"/>
</html>
