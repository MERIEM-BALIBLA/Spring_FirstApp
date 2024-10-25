<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.User" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>User List</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>User List</h2>

    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<User> members = (List<User>) request.getAttribute("members");
            if (members != null && !members.isEmpty()) {
                for (User user : members) {
        %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getUsername() %></td>
            <td><%= user.getEmail() %></td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="3">No users found.</td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>