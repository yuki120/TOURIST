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
	<title>BuyProductConfirm画面</title>

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

		h3 {
			color: red;
		}

		h4 {
			color: blue;
		}

	</style>
	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
	</script>
</head>
<body>

	<s:include value="header.jsp" />

	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form>
				<tr>
					<td>合計金額</td>
					<td>
						<s:if test="totalPrice != null"></s:if>
						<s:property value="totalPrice"/>








						<span>円</span>
					</td>
				</tr>
				<tr>
					<td>お申込人数</td>
					<td>
						<s:property value="count"/>
						<span>名様</span>
					</td>
				</tr>

				<tr>
					<td><br><br></td>
				</tr>
				<tr>
					<td><input type="button" value="戻る" onclick="submitAction('HomeAction')" /></td>
					<td><input type="button" value="ご購入手続き" onclick="submitAction('BuyProductUserInfoConfirmAction')" /></td>
				</tr>
			</s:form>

		</div>
	</div>

	<s:include value="footer.jsp" />

</body>
</html>