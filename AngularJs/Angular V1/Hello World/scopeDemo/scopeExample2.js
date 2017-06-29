(function(){
	angular.module("myScopeApp",[])
		.controller("ScopeController",['$scope', function($scope){
			$scope.myTaste = "very";
			$scope.customTaste = "Custom";
			$scope.changeSpice = function(spice){
				
				$scope.myTaste = spice;	
			};
			
	}]);
})();