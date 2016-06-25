<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<base href="<%=basePath%>">

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>HDFS总览</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/metisMenu.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body style="background-color: #fff;">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">HDFS总览</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-6">
				<div class="panel panel-default">
					<div class="panel-heading">HDFS使用情况</div>
					<!-- /.panel-heading -->

					<div class="panel-body">
						<div id="morris-donut-chart-hdfs"></div>
					</div>
					<!-- /.panel-body -->

				</div>
			</div>
		</div>
		<!-- /.row -->



	</div>
	<!-- /#page-wrapper -->
</body>
<!-- jQuery -->
<script src="js/jquery.js"></script>

<script src="js/utils.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script src="js/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="js/raphael-min.js"></script>
<script src="js/morris.min.js"></script>
<script src="js/dashboard-data.js"></script>
<!-- Custom Theme JavaScript -->
<script src="js/sb-admin-2.js"></script>



</html>
