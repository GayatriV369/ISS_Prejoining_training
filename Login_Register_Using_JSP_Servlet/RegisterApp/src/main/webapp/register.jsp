<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,600&display=swap" rel="stylesheet">
    <script src="js/validation.js"></script>
</head>
<body>
    <div class="glass-card">
        <h2>Create Account</h2>
        <form action="RegisterServlet" method="post" onsubmit="return validateRegisterForm()">
            <input type="text" name="username" id="username" placeholder="Username" required>
            <input type="password" name="password" id="password" placeholder="Password" required>
            <button type="submit">Register</button>
        </form>
        <% if (request.getAttribute("error") != null) { %>
            <div class="error"><%= request.getAttribute("error") %></div>
        <% } %>
        <p>Already have an account? <a href="login.jsp" class="switch-link">Login here</a></p>
    </div>
</body>
</html>