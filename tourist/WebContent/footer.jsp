<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<style type="text/css">

	#footer {
		width: 100%;
		height: 70px;
		background-color: #FFFF99;
		position: fixed;
    	bottom: 0;
	}

	#footer ul {
		float: right;
		padding-right: 20px;
	}

	#footer ul li{
	    float: left;
	    line-height: 5px;
	    list-style: none;
	    font-size: 15px;
	    display: inline-block;
		padding: 20px;
		transition: .3s;
		transform: scale(1);
	}

	#footer ul li:hover {
		transform: scale(1.05);
	}

	.link2 {
		text-decoration: none;
		color: orange;
		font-family: sans-serif;
		font-weight: 700;
		text-shadow:2px 2px 4px white;
	}

</style>

<div id="footer">

	<ul>
		<li><a class="link2" href='<s:url action="MasterPageAction" />'>ONLY MANAGER</a></li>
	</ul>

</div>