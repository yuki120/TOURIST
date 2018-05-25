<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<title>UserInfoUpdate画面</title>

	<style type="text/css">
		body {
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: Verdana, Helvetica, sans-serif;
			font-size: 12px;
			color: #333;
			background: #fff;
		}

		table {
			text-align: center;
			margin: 0 auto;
			border-spacing: 15px;
		}

		#top {
			width: 780px;
			margin: 30px auto;
			border: 1px solid #333;
		}

		#main {
			width: 100%;
			height: 500px;
			text-align: center;
		}

		.btn {
			text-align: center;
		}

		.btn input {
			margin: 15px;
		}


	</style>
</head>

<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>

<body>

	<s:include value="header.jsp" />

	<div id="main">
		<div id="top">
			<p>UserInfoUpdate</p>
		</div>
		<div>
			<h3>変更内容は以下でよろしいでしょうか？</h3>
			<table>
				<s:form action="UserInfoUpdateCompleteAction">
					<tr id="box">
						<td>
							<label>ユーザーID：</label>
						</td>
						<td>
							<s:property value="loginId" escape="false" />
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>ユーザーPASS：</label>
						</td>
						<td>
							<s:property value="loginPassword" escape="false" />
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>お名前：</label>
						</td>
						<td>
							<s:property value="name" escape="false" />
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>おなまえ(ふりがな):</label>
						</td>
						<td>
							<s:property value="nameKana" escape="false" />
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>性別：</label>
						</td>
						<td>
							<s:property value="sex" escape="false"/>
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>メールアドレス：</label>
						</td>
						<td>
							<s:property value="email" escape="false"/>
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>電話番号：</label>
						</td>
						<td>
							<s:property value="telNum" escape="false"/>
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>郵便番号：</label>
						</td>
						<td>
							<s:property value="postalCode" escape="false"/>
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>住所：</label>
						</td>
						<td>
							<s:property value="address1" escape="false"/>
						</td>
					</tr>

					<tr id="box">
						<td>
							<label>アパート・マンション名：</label>
						</td>
						<td>
							<s:property value="address2" escape="false"/>
						</td>
					</tr>

				</s:form>
			</table>

			<div class="btn">
				<input type="button" value="戻る" onclick="submitAction('UserInfoUpdateAction')" />
				<input type="button" value="登録" onclick="submitAction('UserInfoUpdateCompleteAction')" />
			</div>
		</div>
	</div>

	<s:include value="footer.jsp" />

</body>
</html>