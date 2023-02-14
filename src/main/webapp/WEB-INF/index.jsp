<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <div class="container mt-5">
        <table class="table table-hover border border-5">
            <tbody>
                <tr>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Pages</th>
                    <th>Description</th>
                </tr>
                <tr>
                    <!--
                    ~ Java equivalent of Jinja
                    -> take data from controller and have it render on my view
                    -> give it a value attribute
                    -> then what we want to render on page
                    -->
                    <td>
                        <c:out value="${title}"/>
                    </td>
                    <td>
                        <c:out value="${author}"/>
                    </td>
                    <td>
                        <c:out value="${pages}"/>
                    </td>
                    <td>
                        <c:out value="${description}"/>
                    </td>
                </tr>
            </tbody>
        </table>
        <a class="btn btn-primary" href="/books/new">Add a Book</a>
    </div>
</body>
</html>
