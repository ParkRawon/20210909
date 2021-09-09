<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div align="center">
	<div><h1>Login</h1></div>
	<div>
		<form id="id" name="name" action="login.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="150">Id</th>
						<td width="150">
							<input type="text" id="id" name="id">
						</td>
					</tr>
					<tr>
						<th width="150">Password</th>
						<td width="150">
							<input type="password" id="password" name="password">
						</td>
					</tr>	
					<tr>
						<th width="150">Status</th>
						<td width="150">
							<input type="text" id="aa" name="aa">
						</td>
					</tr>	
				</table>
			</div><br>
			<div>
				<input type="submit" value="login">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="Cancle">&nbsp;&nbsp;&nbsp;
				<button type="button" onclick="location.href='main.do'">Home</button>
			</div>
		</form>
	</div>
</div>
</body>
</html>