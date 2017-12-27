<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<!DOCTYPE html>

<head>
  <!-- Meta -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <!-- SITE TITLE -->
  <title>medical</title>
  <!-- Latest Bootstrap min CSS -->
  <link rel="stylesheet" href="./assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="css/font-awesome.css">
  <link rel="stylesheet" href="https://d1azc1qln24ryf.cloudfront.net/114779/Socicon/style-cf.css?u8vidh">

  <link rel="stylesheet" href="./css/main.css">
  <link rel="stylesheet" href="./css/animations.css">
  <link rel="stylesheet" href="./css/fonts.css">
  <link rel="stylesheet" href="./css/layerslider.css">
 <!--  <link rel="stylesheet" href="./css/fixheader.css"> -->
  <link rel="stylesheet" href="./css/login.css">
  <link rel="stylesheet" href="./css/phacdo.css">
  <!-- <script src="./js/modernizr-2.6.2.min.js"></script> -->


</head>

<body>


  <div class="preloader">
    <div class="preloader_image"></div>
  </div>


  <!-- search modal -->
  <div class="modal" tabindex="-1" role="dialog" aria-labelledby="search_modal" id="search_modal">
    <div class="widget widget_search">
      <form method="get" class="searchform form-inline" action="/">
        <div class="form-group">
          <input type="text" value="" name="search" class="form-control" placeholder="Search keyword" id="modal-search-input">
        </div>
        <button type="submit" class="theme_button">Search</button>
      </form>
    </div>
  </div>

  <!-- wrappers for visual page editor and boxed version of template -->
  <div id="canvas">
    <div id="box_wrapper">

      <!-- template sections -->
      <section class="page_topline ls ms section_padding_0 table_section table_section_md">
        <div class="container">
          <div class="row">
            <div class="col-md-3 text-center text-md-left">
              <div class="page_social_icons">
                <a class="fa fw fa-facebook magrin15px" href="#" title="Facebook"></a>
                <a class="fa fw fa-twitter  magrin15px" href="#" title="Twitter"></a>
                <a class="fa fw fa-google-plus magrin15px" href="#" title="Google"></a>
                <a class="fa fw fa-linkedin magrin15px" href="#" title="LinkedIn"></a>
                <a class="fa fw fa-dribbble magrin15px" href="#" title="Dribble"></a>
              </div>
            </div>

            <div class="col-md-9 text-center text-md-right">

              <span>
                <i class="fa fa-map-marker"></i> 4321 Your Address, Country
              </span>

              <span>
                <i class="fa fa-volume-control-phone"></i> 8 (800) 695-2684
              </span>

              <span>
                <i class="fa fw fa-envelope-o"></i> support@company.com
              </span>

            </div>

          </div>
        </div>
      </section>
      <header class="page_header header_white">
        <div class="container">
          <div class="row">
            <div class="col-lg-3 col-md-4 col-xs-12">
              <a href="./" class="logo top_logo">
                <img src="./images/logo.png" alt=""> TTTC
              </a>
              <!-- header toggler -->
              <span class="toggle_menu">
                <span></span>
              </span>
            </div>
            <div class="col-lg-9 col-md-8 text-right">
              <!-- main nav start -->
              <nav class="mainmenu_wrapper">
                <ul class="mainmenu nav sf-menu">
                  <li class="active">
                    <a href="#box_wrapper">Home</a>
                    <ul>
                      <li>
                        <a href="index.html">Medico</a>
                      </li>
                      <li>
                        <a href="index_veterenary.html">Veterenary</a>
                      </li>
                      <li>
                        <a href="index_singlepage.html">Single Page</a>
                      </li>
                      <li>
                        <a href="index_flexslider.html">Free Flex Slider</a>
                      </li>
                    </ul>
                  </li>

                  <li>
                   <a href="WEB-INF/pages/schedule-manage.jsp">Immunization</a>
                  </li>

                  <li>
                    <a href="#folio">Gallery</a>
                  </li>

                  <li>
                    <a href="#blog">Blog</a>
                  </li>

                  <li>
                    <a href="#contact">Contact</a>
                  </li>

                </ul>
              </nav>
              <!-- eof main nav -->
            </div>
          </div>
        </div>
      </header>
      <!-- phac do -->
        <section class="back_phacdo">
            <div class="container">
                <div class="row">
                    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                        <img class="logo_phacdo" src="./images/gallery/16.jpg">
                    </div>
                    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                        <div class="thongtin_user right">
                            <ul class="list-unstyled">
                              <li><h2><strong>NGUYỄN VĂN TÀI</strong></h2></li>
                              <li><strong>Mã Số:</strong> 1234567</li>
                              <li><strong>Năm sinh: </strong> 1995</li>
                              <li><strong>Địa chỉ: </strong> Liêu Chiểu, Đà Nẵng</li>
                              <li><strong>Thông tin gửi về: </strong> 0178999333</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <div class="container">
            <section class="sap_tiem">
                <div class="title">
                    <h2>SẮP TIÊM:</h2>
                </div>
                <hr>
                <div class="noi_dung">
                    <section class="phacdo_con">
                        <div class="lichtiem">
                            <button type="button" class="btn vongtrong"><strong>Chưa tiêm</strong></button>
                            <div class="left">
                                <div class="name_mui_tiem">
                                    <h3>Viên não nhật bản:</h3>
                                </div>
                                <div class="date_mui_tiem">
                                    <h4>Thứ 5, ngày 22/12/2017</h4>
                                </div>
                                <div class="more">
                                    <span type="button" class="fa fw fa-chevron-circle-right" data-toggle="modal" data-target="#exampleModal"></span>                                   
                                </div>
                                <div class="somuitiem">
                                    <h3>Mũi 1/2</h3>
                                </div>
                            </div>
                        </div>
                    </section>
                    <section class="phacdo_con">
                        <div class="lichtiem">
                            <button type="button" class="btn vongtrong"><strong>Chưa tiêm</strong></button>
                            <div class="left">
                                <div class="name_mui_tiem">
                                    <h3>Viên não nhật bản:</h3>
                                </div>
                                <div class="date_mui_tiem">
                                    <h4>Thứ 5, ngày 22/12/2017</h4>
                                </div>
                                <div class="more">
                                   <span type="button" class="fa fw fa-chevron-circle-right" data-toggle="modal" data-target="#exampleModal"></span>
                                </div>
                                <div class="somuitiem">
                                    <h3>Mũi 1/2</h3>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </section>  
        </div>

        <!-- da~ tiem -->

        <div class="container">
            <section class="sap_tiem">
                <div class="title">
                    <h2>ĐÃ TIÊM:</h2>
                </div>
                <hr>
                <div class="noi_dung">
                    <section class="phacdo_con">
                        <div class="lichtiem">
                            <button type="button" class="btn vongtrong"><strong>Đã tiêm</strong></button>
                            <div class="left">
                                <div class="name_mui_tiem">
                                    <h3>Viên gan B:</h3>
                                </div>
                                <div class="date_mui_tiem">
                                    <h4>Thứ 4, ngày 24/4/2014</h4>
                                </div>
                                <div class="more">
                                   <span type="button" class="fa fw fa-chevron-circle-right" data-toggle="modal" data-target="#exampleModal"></span>
                                </div>
                                <div class="somuitiem">
                                    <h3>Mũi 1/2</h3>
                                </div>
                            </div>
                        </div>
                    </section>
                    <section class="phacdo_con">
                        <div class="lichtiem">
                            <button type="button" class="btn vongtrong"><strong>Đã tiêm</strong></button>
                            <div class="left">
                                <div class="name_mui_tiem">
                                    <h3>Viên gan B:</h3>
                                </div>
                                <div class="date_mui_tiem">
                                    <h4>Thứ 7, ngày 24/7/2010</h4>
                                </div>
                                <div class="more">
                                   <span type="button" class="fa fw fa-chevron-circle-right" data-toggle="modal" data-target="#exampleModal"></span>
                                </div>
                                <div class="somuitiem">
                                    <h3>Mũi 2/2</h3>
                                </div>
                            </div>
                        </div>
                    </section>
                    <section class="phacdo_con">
                        <div class="lichtiem">
                            <button type="button" class="btn vongtrong"><strong>Đã tiêm</strong></button>
                            <div class="left">
                                <div class="name_mui_tiem">
                                    <h3>Vắc xin lao:</h3>
                                </div>
                                <div class="date_mui_tiem">
                                    <h4>Thứ 2, ngày 1/11/2004</h4>
                                </div>
                                <div class="more">
                                   <span type="button" class="fa fw fa-chevron-circle-right" data-toggle="modal" data-target="#exampleModal"></span>
                                </div>
                                <div class="somuitiem">
                                    <h3>Mũi 1/1</h3>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </section>  
        </div>



      <!-- end phac do -->
      <section class="page_copyright ls section_padding_50">
        <div class="container">
          <div class="row to_animate">
            <div class="col-sm-12 text-center">
              <a href="./" class="logo vertical_logo grey">
                <img src="./images/logo.png" alt="">
                <br>TTTC
              </a>
            </div>
            <div class="col-sm-12 text-center">
              <p>Copyright 2016. TTTC by
                <a href="http://modernwebtemplates.com">MWTemplates</a>
              </p>
            </div>
          </div>
        </div>
      </section>

    </div>
    <!-- eof #box_wrapper -->
  </div>
  <!-- eof #canvas -->
  <!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title" id="exampleModalLabel">THÔNG TIN THUỐC</h4>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div class="left">
            <div class="name_mui_tiem">
                <h3>Tên thuốc: Viêm não nhật bản</h3>
                <h3>Giá thuốc: 24$</h3>
                <h3>Số mũi &nbsp&nbsp&nbsp  :  Viêm não nhật bản</h3>
                <h3>Mã thuốc: 523452435234532</h3>
            </div>
            <hr>
            <h3>1. Công dụng:</h3>
            <div class="cong_dung_thuoc">
                <p class="text">
                    Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo invtatis et quasi architecto beatae.
                </p>
            </div>  
            <h3>2. Lưu ý:</h3>
            <div class="cong_dung_thuoc">
                <p class="text">
                    Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo invtatis et quasi architecto beatae.
                </p>
            </div>      
        </div>
           
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
  <script src="./assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="./js/compressed.js"></script>
  <script src="./js/main.js"></script>
  <script src="./js/switcher.js"></script>

</body>

</html>
