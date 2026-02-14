<%@ page language="java" contentType="test/html; charset=UTF-8" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Add Product</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/changes.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <!-- <title>Document</title> -->

        <style>
            body {
                margin: 0;
                font-family: Arial, sans-serif;
            }

            .content {
                margin-left: 350px;
                /* adjust this margin based on sidebar width */
                padding: 20px;
                transition: margin-left 0.3s;
                /* smooth transition for margin change */
            }

            .sidebar.collapsed~.content {
                margin-left: 100px;
                /* adjust margin when sidebar is collapsed */
            }

            .form-container {
                background-color: #f1cdf6;
                min-height: 100vh;
                padding-bottom: 20px;
            }

            .form-title {
                font-weight: bold;
                color: black;
            }

            .footer {
                position: relative;
                left: 250px;
                bottom: 0;
                width: calc(100% -250px);
                /* adjust width based on sidebar width */
                background-color: #333;
                color: white;
                text-align: center;
                padding: 10px;
                margin-top: 20px;
                transition: left 0.3s, width 0.3s;
            }

            .sidebar.collapsed~.footer {
                left: 60px;
                /* adjust position when sidebar is collapsed */
                width: calc(100% - 60px);
                /* adjust width when  sidebar is collapsed */
            }
        </style>
    </head>

    <body>
        <!-- /* Checking the user credentials */  -->
        <% String userType=(String) session.getAttribute("usertype"); String userName=(String)
            session.getAttribute("userName"); String password=(String) session.getAttribute("password"); if
            (userType==null || !"admin".equals(userType)) { response.sendRedirect("login.jsp?message=Access Denied,
            Login as admin!!"); return; } if (userName==null || password==null) {
            response.sendRedirect("login.jsp?message=Session Expired, Login Again!"); return; } %>


            <%@ include file="adminHeader.jsp" %>
                <% String message=request.getParameter("message"); %>
                    <div class="content">
                        <div class="row" style="margin-top: 5px; margin-left: 2px; margin-right: 2px;">
                            <form action="./AddProductSrv" method="post" enctype="multipart/form-data"
                                class="col-md-6 col-md-offset-3"
                                style="border: 2px solid black; border-radius:10px; background-color: #b341ab; padding: 10px">

                                <div class="form-title text-center">
                                    <h2>Product Addition Form</h2>
                                    <% if(message !=null) { %>
                                        <p style="color: rgb(25,252,25)">
                                            <%=message %>
                                        </p>
                                        <% } %>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 form-group">
                                        <label for="productname">Product Name</label>
                                        <input type="text" placeholder="Enter Product name " name="name"
                                            class="form-control" id="productname" required>
                                    </div>
                                    <div class="col-md-6 form-group">
                                        <label for="producttype">Product Type</label>
                                        <select name="type" id="producttype" class="form-control" required>
                                            <option value="electronics">Electronics</option>
                                            <option value="appliance">Appliances</option>
                                            <option value="fashion"> Fashion and Apparel</option>
                                            <option value="home">Home</option>
                                            <option value="kitchen">Kitchen</option>
                                            <option value="fitness">Fitness</option>
                                            <option value="outdoor">Outdoor</option>
                                            <option value="sports">Sports</option>
                                            <option value="recreation">Recreation</option>
                                            <option value="toys">Toys</option>
                                            <option value="games">Games</option>
                                            <option value="suppliments">Suppliments</option>
                                            <option value="personal_care">Personal Care</option>
                                            <option value="office">Office</option>
                                            <option value="stationary">Stationary</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="productdesc">Product Description</label>
                                    <textarea name="info" id="productdesc" class="form-control" required></textarea>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 form-group">
                                        <label for="productprice">Unit Price</label>
                                        <input type="number" name="price" id="productprice" class="form-control"
                                            placeholder="Enter the unit Price" required>
                                    </div>
                                    <div class="col-md-6 form-group">
                                        <label for="productquantity">Stock Quantity</label>
                                        <input type="number" name="quantity" id="productquantity" class="form-control"
                                            placeholder="Enter the stock Quantity" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="productimage">Product Image</label>
                                    <input type="file" name="image" id="productimage" class="form-control"
                                        placeholder="Select Image" required>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 text-center" style="margin-bottom: 2px;">
                                        <button type="reset" class="btn btn-danger">Reset</button>
                                    </div>
                                    <div class="col-md-6 text-center" style="margin-bottom: 2px;">
                                        <button type="submit" class="btn btn-success">Add Product</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>


    </body>

    </html>