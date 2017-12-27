<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
  <!-- <link rel="stylesheet" href="./css/fixheader.css"> -->
  <link rel="stylesheet" href="./css/login.css">
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
      <!-- ................. login  .............  -->

      <section class="opacity_backgroud image1">

      </section>
      <div class="container">
        <form action="" role="form" method="post" class="login_form">
          <div class="form-group">
            <label for="exampleInputEmail1">User Name</label>
            <input type="text" class="form-control" id="exampleInputUserName" aria-describedby="TextHelp" placeholder="Enter User Name">
            <!-- <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small> -->
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
          </div>
          <div class="form-check">
            <label class="form-check-label">
              <input type="checkbox" class="form-check-input">
              Remember me
            </label>
          </div>
          <div class="center">
            <button type="submit" class="btn btn-success">Đăng nhập</button>
            <button type="button" class="btn btn-light"><a href="signup.jsp">Đăng ký </a></button>
          </div>
        </form>
      </div>

      <!-- ................. end login  .............  -->
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
  <script src="./assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="./js/compressed.js"></script>
  <script src="./js/main.js"></script>
  <script src="./js/switcher.js"></script>

</body>

</html>
