<%@ page language="java" contentType="text / html; charset = utf-8"         pageEncoding="utf-8" %><%@ include file="../Layout/header.jsp" %><div class="container">    <form action="/auth/loginProc" method="POST">        <div class="form-group">            <label for="username">Username</label>            <input type="text" name="username" class="form-control" placeholder="Enter username" id="username">        </div>        <div class="form-group">            <label for="password">Password</label>            <input type="password" name="password" class="form-control" placeholder="Enter password" id="password">        </div>        <button id="btn-login" class="btn btn-primary">로그인</button>        <a href="https://kauth.kakao.com/oauth/authorize?client_id=9a844e627d603f53789cb10ea3359828&redirect_uri=http://localhost:8000/auth/kakao/callback&response_type=code">            <img height="38px" src="/image/kakao_login_button.png" /></a>    </form></div><%@ include file="../Layout/footer.jsp" %>