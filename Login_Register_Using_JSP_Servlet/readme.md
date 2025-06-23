A simple Java web application for user registration and login using JSP, Servlets, and Tomcat.

Project Structure: 
RegisterApp/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── registerapp/
│ │ └── servlet/
│ │ ├── DBUtil.java
│ │ ├── LoginServlet.java
│ │ ├── LogoutServlet.java
│ │ └── RegisterServlet.java
│ └── webapp/
│ ├── css/
│ ├── error.jsp
│ ├── login.jsp
│ ├── register.jsp
│ ├── validation.js
│ ├── welcome.jsp
│ └── WEB-INF/
│ └── web.xml


## How to Run

1. **Build the project** in Eclipse as a Dynamic Web Project.
2. **Deploy the WAR file** (e.g., `RegisterApp.war`) to Tomcat (ensure Tomcat is running on port 8086).
3. **Start Tomcat** and open your browser to: http://localhost:8080/RegisterApp
