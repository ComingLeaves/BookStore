var un;
var pw;

window.onload=function(){
	un=document.forms["a"]["uname"];
	pw=document.forms["a"]["pw"];

};

function checkForm(){
	var bPassword=checkPassword();
	alert("qq");
	var bUsername=checkUsername();
	alert("ee");
	return bUsername&&bPassword;
}

function checkUsername(){
	alert("rr");
	var uname=un.value;
	var msg="";
	if(uname==null||uname=="")
	{
		msg="用户名为空";
		alert(msg);
	}
	
	return mag=="";
}

function checkPassword(){
	alert("ss");
	var pass=pw.value;
	var msg="";
	if(pass==null||pass=="")
	{
		msg="密码为空";
		alert(msg);
	}
	
	return mag=="";
}