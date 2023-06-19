<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />

        <%@page contentType="text/html" pageEncoding="UTF-8"%>

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>MBOS</title>
        <link rel="icon" type="image/png" href="img/logo1.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="Showproduct">TRANG CHỦ</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="BVchimhoami.jsp">BÀI VIẾT</a></li>
                        <li class="nav-item"><a class="nav-link" href="contact.jsp">LIÊN HỆ</a></li>
                    </ul>
                     <div class="ml-auto">
                         <form action="MainController" class="d-flex" method="post">
                                <button class="btn btn-outline-dark" type="submit" name="btAction" value="Cart">
                                    <i class="bi-cart-fill me-1"></i>
                                    <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                                </button>
                            </form>
                        </div>  
                </div>
            </div>
        </nav>

        <!-- Product section-->
        <section class="py-5">
            <div class="container px-4 px-lg-5 my-5">
                <div class="row gx-4 gx-lg-5 align-items-center">
                    <div class="col-md-6"><img class="card-img-top mb-5 mb-md-0" src="img/bird/chimhoami.jpg" alt="..." /></div>
                    <div class="col-md-6">
                        <div class="small mb-1">BMOS: Chim Họa Mi</div>
                        <h2 class="display-6 fw-bolder" style="color: steelblue">COMBO4: Chim Họa Mi</h2>
                        <div class="fs-5 mb-5">
                            <span class="text-decoration-line-through">250.000đ</span>
                            <span>- 215.000đ</span>
                            <p class="lead">
                                Combo 4: Dành cho loài chim chích chòe gồm có:
                            </p>
                        </div>
                        <p>
                        <ul>
                            <li>
                                Thức ăn loại hạt
                            </li>
                            <li>
                                Cám chim
                            </li>
                            <li>
                                Sâu
                            </li>
                            <li>
                                Thuốc tăng cường sinh lí
                            </li>
                        </ul>
                        </p>
                        <!-- 
                        Add san pham
                        -->
                        <div class="d-flex">
                            <input class="form-control text-center me-3" id="inputQuantity" type="num" value="1" style="max-width: 3rem" />
                            <button class="btn btn-outline-dark flex-shrink-0" type="button">
                                <i class="bi-cart-fill me-1"></i>
                                Add to cart
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="py-5 bg-light">
            <div class="container px-4 px-lg-5 mt-5">
                <h2 style="color: #36b9cc">COMBO 4: CHIM HỌA MI BAO GỒM :</h2>
                <p>
                <ul>
                    <li>Thức Ăn Loại Cám:</li>
                    <li>Thức Ăn Loại Côn Trùng:</li>
                    <li>Thức Ăn Loại Hạt:</li>
                    <li>Thức Ăn Loại Trái Cây:</li>
                    <li>Thuốc:</li>
                </ul>
                </p>
                </br>
            </div>
        </section>







        <!-- Related items section
        San Pham Lien Quan
        -->
        <section class="py-5 bg-light">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="d-flex align-items-center justify-content-between mb-3 mt-2">
                    <h1 class="mb-0">Sản Phẩm Liên Hệ "HOT"</h1>
                    <a href="ShowAllProductController" class="small font-weight-bold text-dark">SEE ALL <i class="mdi mdi-chevron-right mr-2"></i></a>
                </div>
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                    <c:forEach  items="${LIST_PRODUCT}" var="p" begin="14" end="17">
                        <div class="col mb-5">
                            <div class="card h-100">
                                <!-- Sale badge-->
                                <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                                <!-- Product image-->
                                <img class="card-img-top" src="${p.img}" height="200px alt="..." />
                                <!-- Product details-->
                                <div class="card-body p-4">
                                    <div class="text-center">
                                        <!-- Product name-->
                                        <h5 class="fw-bolder">${p.productName}</h5>
                                        <!-- Product reviews-->
                                        <div class="d-flex justify-content-center small text-warning mb-2">
                                            <div class="bi-star-fill"></div>
                                            <div class="bi-star-fill"></div>
                                            <div class="bi-star-fill"></div>
                                            <div class="bi-star-fill"></div>
                                            <div class="bi-star-fill"></div>
                                        </div>
                                        <!-- Product price-->
                                        <span class="text-muted text-decoration-line-through">${p.price}</span>
                                        ${p.discount}
                                    </div>
                                </div>
                                <!-- Product actions-->
                                <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                    <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="ProductDetailedController?ProductID=${p.productID}">CHI TIẾT</a></div>
                                </div>
                                <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                    <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">
                    bmos@gmail.com &copy; </br>
                    BMOS Website 2023</p></div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
