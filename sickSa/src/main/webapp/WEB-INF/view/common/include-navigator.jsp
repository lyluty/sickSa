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
<nav style="font-size:30px; font-family:hanna;" id="ml-menu" class="menu">
  <button class="action action--close" aria-label="Close Menu">
    <span class="icon icon--cross"></span>
  </button>

  <div class="menu__wrap">
    <ul data-menu="main" class="menu__level">
      <li class="menu__item"><a class="menu__link menu__link--current" data-submenu="submenu-1" href="#">Home</a></li>
      <li class="menu__item"><a class="menu__link" href="servingState" style="font-weight: 100;">서빙 현황</a></li>
        <li id="adminM1"  class="menu__item"><a class="menu__link" href="ingredients" style="font-weight: 100;">재고 현황</a></li>
      <li id="adminM2" class="menu__item"><a class="menu__link" data-submenu="submenu-5" href="#" style="font-weight: 100;">매출관리</a></li>

    </ul>
    
    <!-- main 2 -->
    
    <!-- Submenu 2 -->
    <ul data-menu="submenu-2" class="menu__level">
      <li class="menu__item"><a class="menu__link menu__link--current" href="index.html">Slider</a></li>
      <li class="menu__item"><a class="menu__link" href="index2.html">Image</a></li>
      <li class="menu__item"><a class="menu__link" href="index3.html">Video</a></li>
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

    <!-- Submenu 5: 매출관리 -->
    <ul data-menu="submenu-5" class="menu__level" style ="font-family:hanna; font-weight: 100;">
      <li class="menu__item"><a class="menu__link" href="salesViewByTimePeriod"style="font-weight:100;">기간별 매출조회</a></li>
      <li class="menu__item"><a class="menu__link" href="salesViewByProduct"style="font-weight:100;">상품별 매출조회</a></li>
    </ul>
  </div>
</nav>
