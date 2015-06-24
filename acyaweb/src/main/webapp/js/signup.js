var adminUrl="http://localhost:8080/";

app.controller('signupCtrl', function($scope, $http) {
	$scope.signup = function($form, model) {
		var req = {
				 method: 'POST',
				 url: serviceUrl+"/AdminServlet?method=CREATE_USER",
				 headers: {
					 'Authorization' : "6EpfMdp6Y7Mr7kgz"
				 },
				 data: $scope.formData
				}

				$http(req).success(function(response){
					
					if(response == 201)
					{
						alert('You are  successfully Registered ,You can login using this credential');
					}
					else
					{
						alert(response);
					}	
				}).error(function(){
					alert('Error in Creating User');
				});
	}
});



