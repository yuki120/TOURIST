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
	<title>buyProduct画面</title>

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
			width: 80%;
			margin: 30px auto;
			border: 1px solid #333;
		}

		#main {
			width: 100%;
			padding-bottom: 150px;
			text-align: center;
		}

		.product-list {
			width: 350px;
			height: 300px;
			display: inline;
			float: left;
			margin-left: 20px;
			margin-bottom: 100px;
		}

		.product-list img {
			width: 250px;
			height: 200px;
		}

		.title {
			font-size: 25px;
			font-weight: bold;
			color: #FF77FF;
		}

		.description {
			font-size: 17px;
			color: #005FFF;
		}

		#pricecolor {
			color: red;
		}

		#bottom {
			clear: left;
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
			<p>BuyProduct</p>
		</div>

		<div class="main_container">
			<s:form action="BuyProductAction">
				<s:iterator value="buyProductDTOList">
					<div class="product-list">
						<img src="<s:property value= "imageFilePath"/>"><br>
						<span class="title"><s:property value="productName"/></span>
						<p class="description"><s:property value="productDescription"/></p>

						<span>値段(1名様あたり)</span>
						<span id="pricecolor"><s:property value="productPrice"/></span>
						<span>円</span><br>

						<span>お申込人数</span>
						<select name="count">
							<option value="0" selected="selected">0</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
						</select><br><br><br>
					</div>
				</s:iterator>
			</s:form>
		</div>
		<div id="bottom">
			<input type="button" value="お買い物カートへ" onclick="submitAction('BuyProductAction')" />
			<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
		</div>

	</div>

	<s:include value="footer.jsp" />

</body>
</html>