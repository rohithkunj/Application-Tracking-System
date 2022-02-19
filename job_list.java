<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Application Tracking System</title>

 <img src="https://ingrain.us/images/logo.png"alt="logo" class="img-responsive" width="180px" height="80px">

<H2>
<center>
<div class="p-3 mb-2 bg-secondary text-white">List of Jobs</div>
    </h2>
     <marquee direction = "right">
      <div class=" mb-2 bg-warning text-dark"><H4>WELCOME TO INGRAIN SYSTEMS PRIVATE LIMITED!!!</H4><div>
     </marquee>
 
 


   
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 20px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #405370;
  color: white;
}

h1 {
  text-align: center;
  text-transform: uppercase;
  color: #4CAF50;
}

p {
  text-indent: 50px;
  text-align: justify;
  letter-spacing: 2px;
}


</style>

     

<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
crossorigin="anonymous">


     <link rel = "icon" href =
"https://media-exp1.licdn.com/dms/image/C560BAQFzxTMS7xtQtA/company-logo_200_200/0/1621322617080?e=2159024400&v=beta&t=9JyStD9CQa7agH7T1AkukFmHkVCSmOKm-KiR7ptY0j8"
        type = "image/x-icon">
       
    </head>
     
 
         
    <body>
 

<table>
  <tr>
    <th>Job Title</th>
    <th>Experience</th>
    <th>Job Description</th>
     <th>Client</th>
      <th>Ingrain Hiring Manager:</th>
    <th>No of Postions</th>
    <th>Primary Skills</th>
     <th>Work Location</th>
  </tr>
  <tr>
    <td>Java Developer</td>
    <td>8</td>
    <td>java backend developer with sound knowledge in java and upgraded with java8, must have worked on enterprise application development preferbaly in microservices. Must be good at Spring, Spring framework & design patterns</td>
      <td>GAP</td>
    <td>Srinivas Gadepalli</td>
    <td>5</td>
        <td>Java, Design Patterns, Spring, Spring Boot, JPA, Hiebernate, Junit, Test Driver Development, Git, Code respository practices</td>
    <td>Hyderabad</td>
  </tr>

 <tr>
    <td>Java Developer</td>
    <td>0 to 1</td>
    <td>java backend developer with sound knowledge in java and upgraded with java8, must have worked on enterprise application development preferbaly in microservices. Must be good at Spring, Spring framework & design patterns</td>
      <td>GAP</td>
    <td>Srinivas Gadepalli</td>
    <td>15</td>
        <td>Java, Design Patterns, Spring, Spring Boot, JPA, Hiebernate, Junit, Test Driver Development, Git, Code respository practices</td>
    <td>Hyderabad</td>
  </tr>


</table><br><br><br>
 
 <a th:href = "@{/dashboard}" class="btn btn-primary btn-sm mb-3"> Return to Dashboard </a>
 </div>
 
</body>

</html>
