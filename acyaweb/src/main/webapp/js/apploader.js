var app = angular.module("myApp", ['infinite-scroll']);
var serviceUrl="http://localhost:8080/dslservice/";
var login=false;
var userName='';
var password='';
var selectedRID='';

function showLogin(){
	$("#loginDiv").removeClass('gone');
	$("#newsDiv").addClass('gone');
	$("#signupDiv").addClass('gone');
	$('#discussDiv').addClass('gone');
}

function showNews(){
	$("#loginDiv").addClass('gone');
	$("#signupDiv").addClass('gone');
	$("#newsDiv").removeClass('gone');
	$('#discussDiv').addClass('gone');
}

function showSignup(){
	$("#loginDiv").addClass('gone');
	$("#signupDiv").removeClass('gone');	
	$("#newsDiv").addClass('gone');	
	$('#discussDiv').addClass('gone');
}

function showChat(){
	$("#loginDiv").addClass('gone');
	$("#signupDiv").addClass('gone');	
	$("#newsDiv").addClass('gone');	
	$('#discussDiv').removeClass('gone');
}

	function removeSpecialChar(string)
	{
		return string.replace(/[^a-z0-9\s]/gi, '').replace(/[_\s]/g, '');;
	}