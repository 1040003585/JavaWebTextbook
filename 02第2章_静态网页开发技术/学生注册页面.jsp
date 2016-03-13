<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
  <head>
    <title>My JSP 'index.jsp' starting page hello</title>
  </head>
  <body  bgcolor="#333333">
    This is my JSP page. <br>
    <h3 align="center">13网络工程1班吴成兵</h3>
    <form name="stu" action="" >
    	<table width="471" height="317" bgcolor="#dddddd" align="center">
    		<tr><th colspan="2"> 学生信息注册 </th></tr>
    		<tr><th colspan="2"> ----------------------- </th></tr>
    		<tr><td>姓名：</td><td><input type="text" name="stuName"></td></tr>
    		<tr><td>性别：</td>
    			<td><input type="radio" name="stdSex" checked="checked">男
    				<input type="radio" name="stuSex" >女
    			</td>
    		</tr>
    		<tr><td>学校：</td><td><input type="text" name="stdSchool"></td></tr>
    		<tr><td>专业：</td>
    			<td><select name="stuSelect2">
	    				<option >计算机科学与技术</option>
	    				<option selected>网络工程</option>
	    				<option>软件工程</option>   			
    				</select>
    			</td>
    		</tr>
    		<tr><td>体育特长：</td>
    			<td colspan="2">
    				<input type="checkbox" name="stuCheck">篮球
    				<input type="checkbox" name="stuCheck">排球
    				<input type="checkbox" name="stuCheck">足球
    				<input type="checkbox" name="stuCheck">游泳
    			</td>
    		</tr>
    		<tr><td>上传图片：</td><td colspan="2"><input type="file"></td></tr>
    		<tr><td>密码：</td><td><input type="password" name="stdPwd"></td></tr>
    		<tr><td>个人介绍：</td>
    			<td colspan="2">	
    				<textarea name="Letter" rows="4" cols="40"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td></td><td><input type="submit" value="提交">  <input type="reset" value="取消"></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
