<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<title>Wort - An HTML5 Registration Template</title>
<script src="${pageContext.request.contextPath }/rg/modernizr.js"></script>
<link href="${pageContext.request.contextPath }/rg/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/rg/pnf.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="content" >
		<div id="register_box">
			<div id="head">
				<h1>MEIYERLOVE</h1>
				<div class="tag">情感天堂，一起说说关于你的爱情故事.</div>
			</div>
			<div id="main_box" >
				<form class="register">
					<h1>欢迎注册！</h1>
					<br />

					<div class="text">
						<img src="rg/images/username.png" alt="username" /> <input
							type="text" name="username" placeholder="Username"  /><br />
					</div>
					<div class="text">
						<img src="rg/images/email.png" alt="email" /> <input  type="text"
							name="email" placeholder="Email Address" /><br />
					</div>
					<div class="text">
						<img src="rg/images/password.png" alt="password" /> <input 
							type="password" name="password" placeholder="Password" /><br />
					</div>
					<div class="text">
						<img src="rg/images/password.png" alt="repassword" /> <input 
							type="password" name="repassword" placeholder="Password" /><br />
					</div>

					<input type="submit" value="Register Now"  /> <br />
					<div class="login">
						已经有账号了? <a href="index.jsp">马上登陆.</a>
					</div>
				</form>

				<div class="right_box">
					<div id="benefits">
						<h1>Reasons to register</h1>
						<br />

						<ul>
							<li>
								<div class="he">Fast Support</div> <span>Get instant
									access to our support ticket system.</span>
							</li>
							<li>
								<div class="he">Community</div> <span>An entry ticket to
									our community forums!</span>
							</li>
							<li>
								<div class="he">No Adverts</div> <span>No more cumbersome
									advertisements! </span>
							</li>
						</ul>
					</div>
					<br />
					<br />
					<br />
					<div id="facebook-con">
						<h1>easy way out</h1>
						<br />
					</div>
					<div class="fbl">
						<br /> <a href="#"> <img src="rg/images/facebook.png"
							alt="Connect with Facebook" />
						</a> <br /> <span> Don't worry. We'll <em>never</em> post
							without your permission.
						</span>
					</div>
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>