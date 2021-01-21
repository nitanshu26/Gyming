<%-- 
    Document   : index
    Created on : Jan 31, 2020, 10:19:06 PM
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
        <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" >--%>
        <title>Home</title>
    </head>
    <jsp:include page="header.jsp"/>
    <body>
        <div>
            <div>
                <img src="Images/cover2.jpg" alt="cover img" class="bg-img">
            </div>
            <%--<div>
            <form action="" class="form1">
    <h1>Login</h1>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" class="input1" name="email" required>
    <br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" class="input1" name="psw" required>
    <br>
    <button type="submit" class="btn1">Login</button>
    <button type="submit" class="btn2">Become a Member</button>
  </form>
            </div>--%>
            
        </div>
            
        <div class="container container_1">
             <img src="Images/cover3.jpg" alt="background image3" class="sub"/>
             <a href="WhyJoin.jsp" style="text-decoration: none"><h1 style="color: #abdfab; font-size: 50px;"><b>Why Join</b></h1></a>
            <div class="div2">
                <p class="p1"><b>
                At Fitness Club YOUR HEALTH IS OUR PRIORITY.
                Fitness Club is one of a kind fitness club with warm,
                positive and inviting ambiance, top of the class equipments,
                Qualified and friendly professional staff, clean, stylish and
                comfortable hassle free facility with lots of happy people.
            </p>
            </div>
        </div>
       
        
            <div class="container container_2"><br>   
            <img src="Images/cover.jpg" alt="baground image2" class="sub"/>
            <div class="our">
                <h2 style="color: #ff4274; font-size: 50px;">Our Achievements</h2>
                <p class="p2">
                    Doing those basic exercises in Park/home and doing exercises in gym is pretty different. It's like asking “why should I learn about kung fu, when I can do martial arts”.<br>

                    Usually what people think is “gym is all about bodybuilding, big people, steroids, bad people” it's just a typical stereotypical mindset.<br>

                    Gym are of different types, then they provide different type of exercises, different weights, machines. All you're are doing in Park/home is 5%. You can find 95% different way in gym to do whatever your goal is, with your body.<br>
                </p>
            </div>
        </div><br>
        <br>
       <div class="container">
        <div class="sub-container-1">
            <div class="container-sub col-sm-6 boxing">
                <a href="Services.jsp#s1"><img src="Images/boxing.png" alt=" " class="services-img"/></a>
                <h4>Boxing</h4>
                <p>A boxer is always armed.</p>
            </div>

            <div class="container-sub col-sm-6 aerobics">
                <a href="Services.jsp#s2"><img src="Images/aerobics.png" alt=" " class="services-img"/></a>
                <h4>Aerobics</h4>
                <%--<p>Aerobic strength and general endurance have come easy, but finger strength has always been my biggest weakness.</p>--%>
                <p>Inactive people have a low aerobic capacity to begin with.</p>
            </div>
        </div>


        <div class="sub-container-2">
            <div class="container-sub col-sm-6 cardio">
                <a href="Services.jsp#s3"><img src="Images/cardio.png" alt=" " class="services-img"/></a>
                <h4>Cardio</h4>
                <p>Cardio Is Hardio.</p>
                <%--<p>If you do cardio one day and the next day you can do weights, do it that way</p>--%>
            </div>

            <div class="container-sub col-sm-6 yoga">
                <a href="Services.jsp#s4"><img src="Images/yoga.png" alt=" " class="services-img"/></a>
                <h4>Yoga</h4>
                <%--<p>Find Happiness within nature and yourself. For a healthy and peaceful life, Make Yoga a Habit!</p>--%>
                <p>Yoga Helps You in Maintaining Balance in Life.</p>
            </div>
        </div>

        <div class="sub-container-3">
            <div class="container-sub col-sm-6 crossfit">
                <a href="Services.jsp#s5"><img src="Images/crossfit.png" alt=" " class="services-img"/></a>
                <h4>CrossFit</h4>
                <%--<p>The last three or four reps is what makes the muscle grow. This area of pain divides a champion from someone who is not a champion</p>--%>
                <p>All progress takes place outside the comfort zone.</p>
            </div>
            <div class="container-sub col-sm-6 personal-training">
                <a href="Services.jsp#s6"><img src="Images/personaltrainer.png" alt=" " class="services-img"/></a>
                <h4>Personal Training</h4>
                <p>Well done is better than well said.</p>
                <%--<p>If you want something you’ve never had, you must be willing to do something you’ve never done</p>--%>
            </div>
        </div>
    </div>   

        
    </body>
    <jsp:include page="footer.jsp"/>
</html>
