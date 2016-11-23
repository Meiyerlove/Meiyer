<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

<link rel="shortcut icon" href="../favicon.ico">
<style type="text/css">
.kuai div:hover {
	color: #ffffff;
}
</style>
<link rel="stylesheet" type="text/css" href="css/style1.css" />
<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
<link rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<jsp:include page="commentaglib.jsp" />

<script type="text/javascript">
	$(function() {
		innit();/* 实现两边和中间导航动态 */

	});
	
	function innit() {
		$("#leftDiv").css({
			"position" : "absolute",
			"left" : "17.2%",
			"top" : "260px"
		});
		$("#rightDiv").css({
			"position" : "absolute",
			"right" : "17.2%",
			"top" : "467px"
		});
		$("#rightDiv1").css({
			"position" : "absolute",
			"right" : "30.7%",
			"top" : "467px"
		});
		$(window).scroll(
				function() {
					if ($(document).scrollTop() < 260) {
						$("#leftDiv").css({
							"position" : "absolute",
							"left" : "17.2%",
							"top" : "260px"
						});
						$("#rightDiv").css({
							"position" : "absolute",
							"right" : "17.2%",
							"top" : "467px"
						});
						$("#rightDiv1").css({
							"position" : "absolute",
							"right" : "30.7%",
							"top" : "467px"
						});
					} else if ($(document).scrollTop() >= 260
							&& $(document).scrollTop() <= 467) {
						$("#leftDiv").css({
							"position" : "fixed",
							"left" : "17.2%",
							"top" : "0px"
						});
						$("#rightDiv").css({
							"position" : "absolute",
							"right" : "17.2%",
							"top" : "467px"
						});
						$("#rightDiv1").css({
							"position" : "absolute",
							"right" : "30.7%",
							"top" : "467px"
						});

					} else {
						$("#rightDiv").css({
							"position" : "fixed",
							"right" : "17.2%",
							"top" : "0px"
						});
						$("#rightDiv1").css({
							"position" : "fixed",
							"right" : "30.7%",
							"top" : "0px"
						});
						$("#leftDiv").css({
							"position" : "fixed",
							"left" : "17.2%",
							"top" : "0px"
						});
					}
				});
	}

	function login() {
		$("#win").window('open');
	}
</script>
</head>

<body style="background: url('images/bg.png');">

	<div style="height: 40px; border: solid, 1px, red;" align="right">
		<div style="height: 25px; padding-right: 180px; padding-top: 10px">
			<c:if test="${empty user}">
				<a onclick="javascript:window.location.href='register.jsp'">注册</a>
				<a onclick="login()">登录meiyerlove</a>
			</c:if>
			<c:if test="${not empty user}">
				<h1>欢迎你，，登录</h1>
			</c:if>
		</div>

	</div>
	<div style="position: relative;" align="center">
		<div style="height: 40px;" align="center"></div>
		<div style="height: 40px;" align="center">
			<div style="margin-top: 0px; border: solid, 1px, red;">
				<input name="" style="height: 40px; width: 500px;" />
				<button value="搜索"
					style="width: 80px; height: 40px; margin-left: 5px; background-color: #2292DD; color: white;">
					<font size="4" face="宋体">搜索</font>
				</button>
			</div>
		</div>

		<div
			style="width: 65%; height: 200px; padding: 5px; background: #eee;"
			text-align="center">

			<div style="width: 70%; height: 200px; float: left"></div>

			<div
				style="width: 30%; height: 200px; background: #887788; float: left">
				<h1>登录链接</h1>
				<button onclick="login()">登录</button>
				<button onclick="javascript:window.location.href='register.jsp'">注册</button>
			</div>
		</div>

		<div id="leftDiv"
			style="width: 13%; height: 700px; background: #eee; float: left;">

			<div class="kuai"
				style="width: 100%; height: 150px; background: #808080;">

				<div class="xiao"
					style="width: 45%; height: 25px; padding: 5px; background: #DDDDDD; float: left;">
					<font>测试标题</font>
				</div>


				<div class="xiao"
					style="width: 45%; height: 25px; padding: 5px; background: #DDDDDD; float: left;">
					<font>测试标题</font>
				</div>
				<div class="xiao"
					style="width: 45%; height: 25px; padding: 5px; background: #DDDDDD; float: left;">
					<font>测试标题</font>
				</div>
				<div class="xiao"
					style="width: 45%; height: 25px; padding: 5px; background: #DDDDDD; float: left;">
					<font>测试标题</font>
				</div>
				<div class="xiao"
					style="width: 45%; height: 25px; padding: 5px; background: #DDDDDD; float: left;">
					<font>测试标题</font>
				</div>

			</div>

			<div style="width: 100%; height: 150px; background: blue;"></div>

		</div>

		<div
			style="width: 65%; height: 200px; padding: 5px; background: #eee;"
			text-align="center">

			<div
				style="width: 20%; height: 200px; background: yellow; float: left">

			</div>

			<div
				style="width: 79.9%; height: 200px; background: #6F916F; float: left">
				<h1>中间推荐框</h1>
			</div>
			<div
				style="width: 0.1%; height: 200px; background: pink; float: left">

			</div>
		</div>



		<div id="rightDiv1"
			style="width: 39%; height: 30px; background: #66998F; float: left;">
			头导航</div>



		<div id="rightDiv"
			style="width: 13%; height: 500px; background: #eee; float: left;">

			<h1>右导航（推荐）广告预留</h1>
		</div>

		<div
			style="width: 65%; height: 2000px; padding: 5px; background: #eee;">

			<div style="width: 20%; height: 2px; background: yellow; float: left">
			</div>
			<div style="width: 60%; height: auto;" align="left">
				<div style="width: 60%;">
					<p>
						<font size="5" color="#3C72C4">【前任】</font><font size="4"
							color="#3C72C4"><a>那些年我们追过的女孩</a></font>
					</p>
					<br> <font size="4" color="#5E5E5E" word-wrap="break-word"
						; word-break="break-all"; ><h2>
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！</h2></font>
					<div style="height: 100px;">
						<img style="float: left" alt="" src="weisuo/11.png"> <img
							style="float: left" alt="" src="weisuo/12.png">
					</div>
					<br>

					<div>
						<font size="2" color="#5E5E5E"><a>meiyerlove</a></font>
						<div style="width: 30px; float: left"></div>
						<font id="time" size="2" color="#5E5E5E"> 2016/10/14 </font>
					</div>
				</div>


				<div>
					<p>
						<font size="5" color="#3C72C4">【前任】</font><font size="4"
							color="#3C72C4"><a>那些年我们追过的女孩</a></font>
					</p>
					<br> <font size="4" color="#5E5E5E" word-wrap="break-word"
						; word-break="break-all"; ><h2>
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！</h2></font>
					<div style="height: 100px;">
						<img style="float: left" alt="" src="weisuo/11.png"> <img
							style="float: left" alt="" src="weisuo/12.png">
					</div>
					<br>

					<div>
						<font size="2" color="#5E5E5E"><a>meiyerlove</a></font>
						<div style="width: 30px; float: left"></div>
						<font id="time" size="2" color="#5E5E5E"> 2016/10/14 </font>
					</div>
				</div>


				<div>
					<p>
						<font size="5" color="#3C72C4">【前任】</font><font size="4"
							color="#3C72C4"><a>那些年我们追过的女孩</a></font>
					</p>
					<br> <font size="4" color="#5E5E5E" word-wrap="break-word"
						; word-break="break-all"; ><h2>
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！</h2></font>
					<div style="height: 100px;">
						<img style="float: left" alt="" src="weisuo/11.png"> <img
							style="float: left" alt="" src="weisuo/12.png">
					</div>
					<br>

					<div>
						<font size="2" color="#5E5E5E"><a>meiyerlove</a></font>
						<div style="width: 30px; float: left"></div>
						<font id="time" size="2" color="#5E5E5E"> 2016/10/14 </font>
					</div>
				</div>


				<div>
					<p>
						<font size="5" color="#3C72C4">【前任】</font><font size="4"
							color="#3C72C4"><a>那些年我们追过的女孩</a></font>
					</p>
					<br> <font size="4" color="#5E5E5E" word-wrap="break-word"
						; word-break="break-all"; ><h2>
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！
							缘分是一本书，翻得不经意会错过，翻得太认真会流泪！ 缘分是一本书，翻得不经意会错过，翻得太认真会流泪！</h2></font>
					<div style="height: 100px;">
						<img style="float: left" alt="" src="weisuo/11.png"> <img
							style="float: left" alt="" src="weisuo/12.png">
					</div>
					<br>

					<div>
						<font size="2" color="#5E5E5E"><a>meiyerlove</a></font>
						<div style="width: 30px; float: left"></div>
						<font id="time" size="2" color="#5E5E5E"> 2016/10/14 </font>
					</div>
				</div>
			</div>

			<div
				style="width: 20%; height: 2px; background: #808080; float: left">

			</div>
		</div>
	</div>

	<div id="win" class="easyui-window"
		title="<font color=#808080 size=5>Meiyer账号登录</div>" closed=true
		collapsible=flase minimizable=flase maximizable=flase resizable=false
		style="width: 515px; height: 438px; overflow: hidden; background: url('images/bg.png');"
		data-options="iconCls:'',modal:true">

		<section>
		<div id="container_demo" style="background: url('images/bg.png');">
			<div id="wrapper" style="background: url('images/bg.png');">
				<div id="login" class="animate form"
					style="background: url('images/bg.png');">

					<form action="" autocomplete="on"
						style="background: url('images/bg.png');">
						<h1>MEIYERLOVE</h1>
						<p>
							<label for="username" class="uname" data-icon="u"> 用户名: </label>
							<input id="username" name="username" required=required
								oninvalid="setCustomValidity('请输入用户名！');"
								oninput="setCustomValidity('');" type="text"
								placeholder="meiyerlove.com" />
						</p>
						<p>
							<label for="password" class="youpasswd" data-icon="p"> 密
								码 :</label> <input id="password" name="password" required=required
								oninvalid="setCustomValidity('请输入密码！');"
								oninput="setCustomValidity('');" type="password"
								placeholder="www.meiyerlove" />
						</p>
						<p class="keeplogin">
							<input type="checkbox" name="loginkeeping" id="loginkeeping"
								value="loginkeeping" /> <label for="loginkeeping">Keep
								me logged in</label>
						</p>
						<p class="login button">
							<input type="submit" value="Login" />
						</p>
						<p class="change_link">
							Not a member yet ? <a href="register.jsp" class="to_register">Join
								us</a>
						</p>
					</form>
				</div>
			</div>
		</div>
		</section>

	</div>
</body>
</html>
