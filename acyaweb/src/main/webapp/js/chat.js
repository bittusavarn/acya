app.controller('loginCtrl', function($scope, $http) {
	$scope.login = function($form, model) {
		
		Candy.init('http://localhost:7070/http-bind/', {
			core: {
				// only set this to true if developing / debugging errors
				debug: true,
				// autojoin is a *required* parameter if you don't have a plugin (e.g. roomPanel) for it
				//   true
				//     -> fetch info from server (NOTE: does only work with openfire server)
				//   ['test@conference.example.com']
				//     -> array of rooms to join after connecting
				 autojoin: [selectedRID+"@conference.san-pc"]
			},
			view: { assets: '../res/' }
		});

		Candy.Core.connect($scope.formData.userName+"@san-pc",$scope.formData.password);
		showChat();
	}
});