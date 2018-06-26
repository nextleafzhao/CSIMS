<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<title>个人信息</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/colorpicker.css" />
<link rel="stylesheet" href="css/datepicker.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link rel="stylesheet" href="css/bootstrap-wysihtml5.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">选课信息系统后台</a></h1>
</div>
<!--close-Header-part--> 
<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">欢迎${sessionScope.username.teachersName}</span><b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a href="#"><i class="icon-user"></i>我的简历</a></li>
        <li class="divider"></li>
        <li><a href="#"><i class="icon-check"></i>我的任务</a></li>
        <li class="divider"></li>
        <li><a href="login.html"><i class="icon-key"></i>注销登录</a></li>
      </ul>
    </li>
    <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">消息</span> <span class="label label-important">5</span> <b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i>新消息</a></li>
        <li class="divider"></li>
        <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i>收件箱</a></li>
        <li class="divider"></li>
        <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i>发件箱</a></li>
        <li class="divider"></li>
        <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i>回收站</a></li>
      </ul>
    </li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">设置</span></a></li>
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>
<!--close-top-Header-menu-->
<!--start-top-serch-->
<div id="search">
  <input type="text" placeholder="Search here..."/>
  <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch--> 

<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i>主页</a>
  <ul>
    <li class="active"><a href="index.html"><i class="icon icon-home"></i> <span>主页</span></a> </li>
    <li> <a href="charts.html"><i class="icon icon-signal"></i> <span>统计</span></a> </li>
    <li> <a href="widgets.html"><i class="icon icon-inbox"></i> <span>学生成绩维护</span></a> </li>
    <li><a href="tables.html"><i class="icon icon-th"></i> <span>成绩列表、学生分项成绩</span></a></li>
    <li><a href="grid.html"><i class="icon icon-star-empty"></i> <span>查看授课课程</span></a></li>
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>查看选课学生信息</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="form-common.html">Basic Form</a></li>
        <li><a href="form-validation.html">Form with Validation</a></li>
        <li><a href="form-wizard.html">Form with Wizard</a></li>
      </ul>
    </li>
    <li><a href="interface.html"><i class="icon icon-pencil"></i> <span>查看学生评价</span></a></li>
    <li class="content"> <span>每月带宽转移</span>
      <div class="progress progress-mini progress-danger active progress-striped">
        <div style="width: 77%;" class="bar"></div>
      </div>
      <span class="percent">77%</span>
      <div class="stat">21419.94 / 14000 MB</div>
    </li>
    <li class="content"> <span>磁盘空间使用率</span>
      <div class="progress progress-mini active progress-striped">
        <div style="width: 87%;" class="bar"></div>
      </div>
      <span class="percent">87%</span>
      <div class="stat">604.44 / 4000 MB</div>
    </li>
  </ul>
</div>
<!--close-left-menu-stats-sidebar-->

<div id="content">
<div id="content-header">
  <div id="breadcrumb"> <a href="index.html" title="回到首页" class="tip-bottom"><i class="icon-home"></i>首页</a> <a href="#" class="tip-bottom">Form elements</a> <a href="#" class="current">Common elements</a> </div>
  <h1>Common Form Elements</h1>
</div>
<div class="container-fluid">
  <hr>
  <div class="row-fluid">
    <div class="span6">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>个人信息</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="#" method="get" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">名字:</label>
              <div class="controls">
              	<input type="text" class="span11" value="${sessionScope.username.teachersName}"/>
                <%-- <input type="text" class="span11" value="<s:property value='session.username.teachersName'/>"/> --%>
<!--<input type="text" class="span11" value="${sessionScope.username.teachersName}"/> -->
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">ID:</label>
              <div class="controls">
                <input type="text" class="span11" readonly="readonly" value="${sessionScope.username.teachersId}" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">性别:</label>
              <div class="controls">
				<input type="text" class="span11" readonly="readonly" value="${sessionScope.username.teachersSex}" />
                <%-- <span class="span11">${sessionScope.username.teachersSex}</span> --%>
              </div>
              
            </div>
            <div class="control-group">
              <label class="control-label">生日:</label>
              <div class="controls">
                <input type="date" class="span11" value="${sessionScope.username.teachersBirthday}"/>
                <%-- value="<s:property value='sessionScope.username.teachersBirthday'/>" --%>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">邮箱:</label>
              <div class="controls">
              	<input type="email" class="span11" readonly="readonly" value="${sessionScope.username.teachersEmail}">
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">学院编号:</label>
              <div class="controls">
                <input type="text" class="span11" value="${sessionScope.username.faculties.facultiesId}" readonly="readonly" />
              </div>
            </div>
            <div class="form-actions">
              <button type="submit" class="btn btn-success">保存</button>
            </div>
            <div class="form-actions">
              <button class="btn btn-primary" id="modifypassword">修改登录密码</button>
            </div>
          </form>
        </div>
      </div>
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Form Elements</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="#" method="get" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">Select input</label>
              <div class="controls">
                <select >
                  <option>First option</option>
                  <option>Second option</option>
                  <option>Third option</option>
                  <option>Fourth option</option>
                  <option>Fifth option</option>
                  <option>Sixth option</option>
                  <option>Seventh option</option>
                  <option>Eighth option</option>
                </select>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Multiple Select input</label>
              <div class="controls">
                <select multiple >
                  <option>First option</option>
                  <option selected>Second option</option>
                  <option>Third option</option>
                  <option>Fourth option</option>
                  <option>Fifth option</option>
                  <option>Sixth option</option>
                  <option>Seventh option</option>
                  <option>Eighth option</option>
                </select>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Radio inputs</label>
              <div class="controls">
                <label>
                  <input type="radio" name="radios" />
                  First One</label>
                <label>
                  <input type="radio" name="radios" />
                  Second One</label>
                <label>
                  <input type="radio" name="radios" />
                  Third One</label>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Checkboxes</label>
              <div class="controls">
                <label>
                  <input type="checkbox" name="radios" />
                  First One</label>
                <label>
                  <input type="checkbox" name="radios" />
                  Second One</label>
                <label>
                  <input type="checkbox" name="radios" />
                  Third One</label>
              </div>
            </div>
            <div class="control-group">
              <label for="checkboxes" class="control-label">Data Toggle checkbox</label>
              <div class="controls">
                <div data-toggle="buttons-checkbox" class="btn-group">
                  <button class="btn btn-primary" type="button">Left</button>
                  <button class="btn btn-primary" type="button">Middle</button>
                  <button class="btn btn-primary" type="button">Right</button>
                </div>
              </div>
            </div>
            <div class="control-group">
              <label for="checkboxes" class="control-label">Data Radio button</label>
              <div class="controls">
                <div data-toggle="buttons-radio" class="btn-group">
                  <button class="btn btn-primary" type="button">Left</button>
                  <button class="btn btn-primary" type="button">Middle</button>
                  <button class="btn btn-primary" type="button">Right</button>
                </div>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">File upload input</label>
              <div class="controls">
                <input type="file" />
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Disabled Input</label>
              <div class="controls">
                <input type="text" placeholder="You can't type anything…" disabled="" class="span11">
              </div>
            </div>
            <div class="form-actions">
              <button type="submit" class="btn btn-success">Save</button>
            </div>
          </form>
        </div>
      </div>
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Form Elements</h5>
        </div>
        <div class="widget-content nopadding">
          <form class="form-horizontal">
            <div class="control-group">
              <label class="control-label">Color picker (hex)</label>
              <div class="controls">
                <input type="text" data-color="#ffffff" value="#ffffff" class="colorpicker input-big span11">
                <span class="help-block">Color picker with Formate of  (hex)</span> </div>
            </div>
            <div class="control-group">
              <label class="control-label">Color picker (rgba)</label>
              <div class="controls">
                <input type="text" data-color="rgba(344,232,53,0.5)" value="rgba(344,232,53,0.5)" data-color-format="rgba" class="colorpicker span11">
                <span class="help-block">Color picker with Formate of  (rgba)</span> </div>
            </div>
            <div class="control-group">
              <label class="control-label">Date picker (dd-mm)</label>
              <div class="controls">
                <input type="text" data-date="01-02-2013" data-date-format="dd-mm-yyyy" value="01-02-2013" class="datepicker span11">
                <span class="help-block">Date with Formate of  (dd-mm-yy)</span> </div>
            </div>
            <div class="control-group">
              <label class="control-label">Date Picker (mm-dd)</label>
              <div class="controls">
                <div  data-date="12-02-2012" class="input-append date datepicker">
                  <input type="text" value="12-02-2012"  data-date-format="mm-dd-yyyy" class="span11" >
                  <span class="add-on"><i class="icon-th"></i></span> </div>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Color Picker (rgb)</label>
              <div class="controls">
                <div data-color-format="rgb" data-color="rgb(155, 142, 180)" class="input-append color colorpicker colorpicker-rgb">
                  <input type="text" value="rgb(155, 142, 180)" class="span11">
                  <span class="add-on"><i style="background-color: rgb(155, 142, 180)"></i></span> </div>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Color Picker (hex)</label>
              <div class="controls">
                <div data-color-format="hex" data-color="#000000"  class="input-append color colorpicker">
                  <input type="text" value="#000000" class="span11">
                  <span class="add-on"><i style="background-color: #000000"></i></span> </div>
              </div>
            </div>
            <div class="form-actions">
              <button type="submit" class="btn btn-success">Save</button>
              <button type="submit" class="btn btn-primary">Reset</button>
              <button type="submit" class="btn btn-info">Edit</button>
              <button type="submit" class="btn btn-danger">Cancel</button>
            </div>
          </form>
        </div>
      </div>
    </div>
    <div class="span6">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Form Elements</h5>
        </div>
        <div class="widget-content nopadding">
          <form class="form-horizontal">
            <div class="control-group">
              <label class="control-label">Tooltip Input</label>
              <div class="controls">
                <input type="text" placeholder="Hover for tooltip…" data-title="A tooltip for the input" class="span11 tip" data-original-title="">
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Type ahead Input</label>
              <div class="controls">
                <input type="text" placeholder="Type here for auto complete…" style="margin: 0 auto;" data-provide="typeahead" data-items="4" data-source="[&quot;Alabama&quot;,&quot;Alaska&quot;,&quot;Arizona&quot;,&quot;Arkansas&quot;,&quot;California&quot;,&quot;Colorado&quot;,&quot;Ahmedabad&quot;,&quot;India&quot;,&quot;Florida&quot;,&quot;Georgia&quot;,&quot;Hawaii&quot;,&quot;Idaho&quot;,&quot;Illinois&quot;,&quot;Indiana&quot;,&quot;Iowa&quot;,&quot;Kansas&quot;,&quot;Kentucky&quot;,&quot;Louisiana&quot;,&quot;Maine&quot;,&quot;Maryland&quot;,&quot;Massachusetts&quot;,&quot;Michigan&quot;,&quot;Minnesota&quot;,&quot;Mississippi&quot;,&quot;Missouri&quot;,&quot;Montana&quot;,&quot;Nebraska&quot;,&quot;Nevada&quot;,&quot;New Hampshire&quot;,&quot;New Jersey&quot;,&quot;New Mexico&quot;,&quot;New York&quot;,&quot;North Dakota&quot;,&quot;North Carolina&quot;,&quot;Ohio&quot;,&quot;Oklahoma&quot;,&quot;Oregon&quot;,&quot;Pennsylvania&quot;,&quot;Rhode Island&quot;,&quot;South Carolina&quot;,&quot;South Dakota&quot;,&quot;Tennessee&quot;,&quot;Texas&quot;,&quot;Utah&quot;,&quot;Vermont&quot;,&quot;Virginia&quot;,&quot;Washington&quot;,&quot;West Virginia&quot;,&quot;Wisconsin&quot;,&quot;Wyoming&quot;]" class="span11">
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Prepended Input</label>
              <div class="controls">
                <div class="input-prepend"> <span class="add-on">#</span>
                  <input type="text" placeholder="prepend" class="span11">
                </div>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label">Appended Input</label>
              <div class="controls">
                <div class="input-append">
                  <input type="text" placeholder="5.000" class="span11">
                  <span class="add-on">$</span> </div>
              </div>
            </div>
            <div class="control-group warning">
              <label class="control-label" for="inputWarning">Input with warning</label>
              <div class="controls">
                <input type="text" id="inputWarning" class="span11">
                <span class="help-inline">Something may have gone wrong</span> </div>
            </div>
            <div class="control-group error">
              <label class="control-label" for="inputError">Input with error</label>
              <div class="controls">
                <input type="text" id="inputError" class="span11">
                <span class="help-inline">Please correct the error</span> </div>
            </div>
            <div class="control-group info">
              <label class="control-label" for="inputInfo">Input with info</label>
              <div class="controls">
                <input type="text" id="inputInfo" class="span11">
                <span class="help-inline">Username is already taken</span> </div>
            </div>
            <div class="control-group success">
              <label class="control-label" for="inputSuccess">Input with success</label>
              <div class="controls">
                <input type="text" id="inputSuccess" class="span11">
                <span class="help-inline">Woohoo!</span> </div>
            </div>
          </form>
        </div>
      </div>
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Form Layout</h5>
        </div>
        <div class="widget-content">
          <div class="controls">
            <input type="text" placeholder=".span12" class="span12 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span11" class="span11 m-wrap">
            <input type="text" placeholder=".span1" class="span1 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span10" class="span10 m-wrap">
            <input type="text" placeholder=".span2" class="span2 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span9" class="span9 m-wrap">
            <input type="text" placeholder=".span3" class="span3 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span8" class="span8 m-wrap">
            <input type="text" placeholder=".span4" class="span4 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span7" class="span7 m-wrap">
            <input type="text" placeholder=".span5" class="span5 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span6" class="span6 m-wrap">
            <input type="text" placeholder=".span6" class="span6 m-wrap">
          </div>
          <div class="controls controls-row">
            <input type="text" placeholder=".span5" class="span5 m-wrap">
            <input type="text" placeholder=".span7" class="span7 m-wrap">
          </div>
         
          <div class="controls controls-row">
            <input type="text" placeholder=".span2" class="span2 m-wrap">
            <input type="text" placeholder=".span3" class="span3 m-wrap">
            <input type="text" placeholder=".span4" class="span4 m-wrap">
            <input type="text" placeholder=".span1" class="span2 m-wrap">
            <input type="text" placeholder=".span1" class="span1 m-wrap">
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="row-fluid">
    <div class="widget-box">
      <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
        <h5>wysihtml5</h5>
      </div>
      <div class="widget-content">
        <div class="control-group">
          <form>
            <div class="controls">
              <textarea class="textarea_editor span12" rows="6" placeholder="Enter text ..."></textarea>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in/">Themedesigner.in</a> </div>
</div>
<!--end-Footer-part--> 
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/bootstrap-colorpicker.js"></script> 
<script src="js/bootstrap-datepicker.js"></script> 
<script src="js/jquery.toggle.buttons.html"></script> 
<script src="js/masked.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.form_common.js"></script> 
<script src="js/wysihtml5-0.3.0.js"></script> 
<script src="js/jquery.peity.min.js"></script> 
<script src="js/bootstrap-wysihtml5.js"></script> 
<script>
	$('.textarea_editor').wysihtml5();
</script>
</body>
</html>