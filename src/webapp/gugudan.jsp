<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ll.exam.Rq" %>
<%
    Rq rq = new Rq(request,response);
    int dan = rq.getIntParam("dan",0);
    int limit = rq.getIntParam("limit",0);
    // http://localhost:8080/gugudan.jsp?dan=9&limit=9
%>
<h1><%=dan%></h1>
<% for ( int i = 1; i <= limit; i++ ) { %>

<div><%=dan%> * <%=i%> = <%=dan * i%></div>

<% } %>

<% for ( int i = 1; i <= 9; i++ ) { %>
<% for ( int i2 = 1; i2 <= 9; i2++ ) { %>
<div><%=i%> * <%=i2%> = <%=i * i2%></div>

<% } %>
<% } %>