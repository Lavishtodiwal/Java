<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1" %>
    <%@ import="com.namstemart.service.impl.*,
                 com.namstemart.service.*,
                 com.namstemart.beans.*,
                 java.util.*,
                 javax.servlet.ServletOutputStream,
                 java.io.*"%>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Admin Home</title>

            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
            <link rel="stylesheet" href="css/changes.css">

            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        </head>

        <body>
            <!-- Admin content goes here -->
            <!-- /* Checking the user credentials */  -->
            <% String userType=(String) session.getAttribute("usertype"); String userName=(String)
                session.getAttribute("userName"); String password=(String) session.getAttribute("password"); if
                (userType==null || !"admin".equals(userType)) { response.sendRedirect("login.jsp?message=Access Denied,
                Login as admin!!"); return; } if (userName==null || password==null) {
                response.sendRedirect("login.jsp?message=Session Expired, Login Again!"); return; } %>
                // we can not call it from anywhere
                <jsp:include page="header.jsp" />

                <div class="products" style="background-color: #f1cdf6;">
                    <div class="tab" align="center">
                        <form>
                            <button type="submit" formaction="adminViewProduct.jsp">View Products</button>

                            <br><br>
                            <button type="submit" formaction="addProduct.jsp">Add Products</button>

                            <br><br>
                            <button type="submit" formaction="removeProduct.jsp">Remove Products</button>

                            <br><br>
                            <button type="submit" formaction="updateProduct.jsp">Update Products</button>

                            <br><br>
                        </form>
                    </div>
                </div>

                <%@ include file="footer.html" %>
        </body>



        </html>