<!DOCTYPE html>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- font start -->
<style>
@import url(http://fonts.googleapis.com/earlyaccess/hanna.css);
</style>
<!-- font end -->
<button class="action action--open" aria-label="Open Menu">
  <span class="icon icon--menu"></span>
</button>
<nav id="ml-menu" class="menu">
  <button class="action action--close" aria-label="Close Menu">
    <span class="icon icon--cross"></span>
  </button>
  <div class="menu__wrap">
    <ul data-menu="main" class="menu__level">
      <li class="menu__item"><a class="menu__link menu__link--current" data-submenu="submenu-1" href="#">Home</a></li>
      <li class="menu__item"><a class="menu__link" data-submenu="submenu-2" href="#">About</a></li>
      <li class="menu__item"><a class="menu__link" data-submenu="submenu-3" href="#">Services</a></li>
      <li class="menu__item"><a class="menu__link" href="portfolio.html">Portfolio</a></li>
      <li class="menu__item"><a class="menu__link" href="blog.html">Blog</a></li>
      <li class="menu__item"><a class="menu__link" href="testimonials.html">Testimonials</a></li>
      <li class="menu__item"><a class="menu__link" href="ingredients">재고 현황</a></li>
      <li class="menu__item"><a class="menu__link" href="servingState">서빙 현황</a></li>
      <li class="menu__item"><a class="menu__link" data-submenu="submenu-5" href="#">매출관리</a></li>


      <li class="menu__item"><a class="menu__link" data-submenu="submenu-4" href="#">Pages</a></li>

    </ul>
    <!-- Submenu 1 -->
    <ul data-menu="submenu-1" class="menu__level">
      <li class="menu__item"><a class="menu__link menu__link--current" href="index.html">Slider</a></li>
      <li class="menu__item"><a class="menu__link" href="index2.html">Image</a></li>
      <li class="menu__item"><a class="menu__link" href="index3.html">Video</a></li>
    </ul>
    <!-- Submenu 2 -->
    <ul data-menu="submenu-2" class="menu__level">
      <li class="menu__item"><a class="menu__link" href="about-us.html">About us</a></li>
      <li class="menu__item"><a class="menu__link" href="team.html">Our Team</a></li>
      <li class="menu__item"><a class="menu__link" href="history.html">History</a></li>
    </ul>

    <!-- Submenu 3 -->
    <ul data-menu="submenu-3" class="menu__level">
      <li class="menu__item"><a class="menu__link" href="services.html">All Services</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">Graphic Design</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">Web Design</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">Web Development</a></li>
      <li class="menu__item"><a class="menu__link" data-submenu="submenu-3-1" href="#">App Development</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">e-Commerce</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">SEO</a></li>
      <li class="menu__item"><a class="menu__link" href="order/orderList.jsp">OrderList</a></li>
    </ul>

    <!-- Submenu 3-1 -->
    <ul data-menu="submenu-3-1" class="menu__level">
      <li class="menu__item"><a class="menu__link" href="service-single.html">Android</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">iPhone</a></li>
      <li class="menu__item"><a class="menu__link" href="service-single.html">Windows</a></li>
    </ul>

    <!-- Submenu 4 -->
    <ul data-menu="submenu-4" class="menu__level">
      <li class="menu__item"><a class="menu__link" href="service-single.html">Service Single</a></li>
      <li class="menu__item"><a class="menu__link" href="blog-single.html">Blog Single</a></li>
      <li class="menu__item"><a class="menu__link" href="team-single.html">Team Single</a></li>
      <li class="menu__item"><a class="menu__link" href="portfolio-single.html">Portfolio Single</a></li>
      <li class="menu__item"><a class="menu__link" href="404.html">404</a></li>
    </ul>
    
    <!-- Submenu 5: 매출관리 -->
    <ul data-menu="submenu-5" class="menu__level">
      <li class="menu__item"><a class="menu__link" href="salesViewByTimePeriod">기간별 매출조회</a></li>
      <li class="menu__item"><a class="menu__link" href="salesViewByProduct">상품별 매출조회</a></li>
    </ul>
  </div>
</nav>
