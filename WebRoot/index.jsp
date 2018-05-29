<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <title>教师登录</title>
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	<link rel="stylesheet" href="css/jquery-ui.min.css" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
	<link rel="stylesheet" href="css/login.css" />
	<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
	<style type="text/css">
		html{
			background: -webkit-gradient(linear, left top, left bottom, from(#1b58b2), color-stop(98%, #4fbfe8));
		}
		body {
			background-color: transparent;
			background-image: url(images/backgrounds/bg_login.png);
			background-position: center bottom;
			background-repeat: no-repeat;
			background-size: contain;
		}
		html, body {
		    height: 100%;
		    overflow: hidden;
		}
		.validateTips { border: 1px solid transparent; padding: 0.3em; }
	</style>
  </head>
  
  <body>
<div id="dialog1" title="申请注册教师" style="display: none;">
	<p class="validateTips">请输入您的电子邮件等信息，以便使您尽快完成注册。标*项为必填项。</p>
	<form action="register.action" method="post" id="registerform" style="text-align: center;">
	<fieldset>
	<legend>填写注册信息</legend>
	<!-- "for" 属性可把 label 绑定到另外一个元素。请把 "for" 属性的值设置为相关元素的 id 属性的值 -->
		<label for="name">*名字</label>
		<input type="text" name="teachersName" id="name" class="text ui-widget-content ui-corner-all">
		<label for="email">*邮箱</label>
		<input type="text" name="teachersEmail" id="email" class="text ui-widget-content ui-corner-all">
		<label for="password">*密码</label>
		<input type="password" name="password" id="password" onpaste="return false" class="text ui-widget-content ui-corner-all">
		
		<!-- datalist 元素 -->
		<label for="faculties">*所属院系</label>
		<select id="faculties" name="faculties">
			<optgroup label="主校区">
				<option value="666">学院1</option>
				<option value="666">学院2</option>
			</optgroup>
			<optgroup label="其他校区">
				<option value="666">学院3</option>
				<option value="666">学院4</option>
			</optgroup>
		</select>

		<label for="teachersBirthday">*出生日期</label>
		<input type="date" name="teachersBirthday" id="teachersBirthday" class="ui-widget-content ui-corner-all">

		<label>*性别</label>
		<label for="unknown" class="radio inline">保密</label>
		<input type="radio" name="teachersSex" id="unknown" value="0" />
		<label for="male" class="radio inline">男</label>
		<input type="radio" name="teachersSex" id="male" value="1" />
		<label for="female" class="radio inline">女</label>
		<input type="radio" name="teachersSex" id="female" value="2" />
		<br><br>

		<!-- rows="10"可见行数、cols="500"可见宽度 -->
		<label>申请原由：</label>
		<textarea id="remarks" name="remarks" maxlength="800" rows="6" cols="200" placeholder="额外您想说的信息，有助于您尽快完成注册"></textarea>
	</fieldset>
	</form>
</div>
<script type="text/javascript">
$(document).ready(function(){
var name = $( "#name" ),
      email = $( "#email" ),
      password = $( "#password" ),
      faculties=$(":selected"),
      teachersBirthday=$("#teachersBirthday"),
      teachersSex=$(":checked"),
      allFields = $( [] ).add( name ).add( email ).add( password ).add( faculties ).add( teachersBirthday ).add( teachersSex ),
      tips = $( ".validateTips" );
 
    function updateTips( t ) {
      tips.text( t ).addClass( "ui-state-highlight" );
      setTimeout(function() {
        tips.removeClass( "ui-state-highlight", 1500 );
      }, 500 );
    }
 
    function checkLength( o, n, min, max ) {
      if ( o.val().length > max || o.val().length < min ) {
        o.addClass( "ui-state-error" );
        updateTips( "" + n + " 的长度必须在 " +
          min + " 和 " + max + " 之间。" );
        return false;
      } else {return true;}
    }
 
    function checkRegexp( o, regexp, n ) {
      if ( !( regexp.test( o.val() ) ) ) {
        o.addClass( "ui-state-error" );
        updateTips( n );
        return false;
      } else {return true;}
    }
    
	$("#regte").click(function(){$("#dialog1").dialog("open");});
	
/*$("tr:first").css({backgroundColor: "#e1e1e1"});/第一个tr背景颜色改变*/
    $( "#dialog1" ).dialog({
      autoOpen: false,
      height: 700,
      width: 700,
      modal: true,
      buttons: {
        "提交": function() {
          var bValid = true;
          allFields.removeClass( "ui-state-error" );
 
          bValid = bValid && checkLength( name, "名字",2, 16 );
          bValid = bValid && checkLength( email, "电子邮箱", 6, 80 );
          bValid = bValid && checkLength( password, "密码", 5, 36 );
          
          bValid = bValid && checkLength( faculties, "学院id",1,20 );
          bValid = bValid && checkLength( teachersBirthday, "生日", 6,10 );
          bValid = bValid && checkLength( teachersSex, "性别",1,4 );
 
          bValid = bValid && checkRegexp( name,/^[a-zA-Z0-9_\u4e00-\u9fa5]+$/, "汉字、数字、字母、下划线。" );
          bValid = bValid && checkRegexp( email, /^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/i, "someone@example.com" );
          bValid = bValid && checkRegexp( password, /^([0-9a-zA-Z])+$/, "密码字段只允许： a-z 0-9" );
 
          if ( bValid ) {
          	$("#registerform").submit();/*submit(function( event ) {alert("注册已提交，请等待审核通过。");return;})*/
            $( this ).dialog( "close" );
          }
        },
        "取消": function() {$( this ).dialog( "close" );}
      },
      close: function() {
        allFields.val( "" ).removeClass( "ui-state-error" );
      },
      show:{effect: "blind",duration: 800},
      hide:{effect: "explode",duration: 500}
    });
});
</script>
    <div id="loginbox">            
        <form id="loginform" class="form-vertical" method="post" action="login.action">
 <div class="control-group normal_text"> <h3><img src="img/logo.png" alt="Logo" /></h3></div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_lg"><i class="icon-user"></i></span>
                        <input type="text" name="username" placeholder="教师编号" />
                        <!-- placeholder 属性适用于以下类型的 <input> 标签：text, search, url, telephone, email 以及 password -->
                    </div>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock"></i></span>
                        <input type="password" name="password" placeholder="密码" />
                    </div>
                </div>
            </div>
            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover">忘记密码?</a></span>
                <span class="pull-right"><a id="regte" class="btn btn-warning">注册</a></span>
                <span class="pull-right"><a type="submit" class="btn btn-success" >登录</a></span>
            </div>
        </form>
        <form id="recoverform" action="#" class="form-vertical">
<p class="normal_text">请输入您的电子邮件地址，我们将向您发送如何恢复密码的说明。</p>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_lo"><i class="icon-envelope"></i></span><input type="text" placeholder="电子邮箱" />
                    </div>
                </div>
            <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo;回到登录</a></span>
                <span class="pull-right"><a class="btn btn-info">找回</a></span>
            </div>
        </form>
    </div>
    <script src="js/login.js"></script> 
  </body>
</html>
