<%--
  Created by IntelliJ IDEA.
  User: guilherme
  Date: 10/12/2017
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/signin.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
    <title>Homepage</title>

</head>

<body class="homepage">

<nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse homepage-nav" style="display: block;">

    <h1>Phonebook Interface - Beginner Version</h1>
</nav>

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <div class="container">

        <h1 class="display-3">Hello, </h1>
        <!--<p>This is a template for a simple marketing or informational website. It includes a large callout called a
            jumbotron and three supporting pieces of content. Use it as a starting point to create something more
            unique.</p>-->
        <p>
            FILTERS AND SEARCH GO HERE
        </p>
        <br>
        <p style="color: green">${removalSuccess}</p>
    </div>
</div>

<div class="container">

    <!-- Example row of columns -->
    <div class="row">

        <div class="col">
            <table class="table table-dark">
                <thead>
                <tr>
                    <th>name</th>
                    <th>phone number</th>
                    <th>address</th>
                </tr>
                </thead>
                <tbody>
                <c:if test="${not empty phone_numbers}">
                    <c:forEach var="phonenumber" items="${phone_numbers}">
                        <tr>
                            <td>${phonenumber.name}</td>
                            <td>${phonenumber.phone_number}</td>
                            <td>${phonenumber.address}</td>
                        </tr>
                    </c:forEach>
                </c:if>
                </tbody>
            </table>
        </div>
    </div>

    <hr>

    <footer>
        <p>&copy; Guilherme Brehm - 2017</p>
    </footer>
</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>

<script type="text/javascript">

    $(document).
</script>
</body>
</html>
