<%@ page session="true" %>
<%
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome - RegisterApp</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,600&display=swap" rel="stylesheet">
</head>
<body>
    <div class="glass-card">
        <h2>Welcome, <%= username %>!</h2>
        <form action="LogoutServlet" method="post">
            <button type="submit">Logout</button>
        </form>
    </div>
</body>
</html>