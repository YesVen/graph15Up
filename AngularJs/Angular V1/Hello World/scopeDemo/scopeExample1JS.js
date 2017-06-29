(function(){
	angular.module("myScopeApp",[])
	.controller("ScopeController", ['$scope', function($scope){
		$scope.num = 10;
		
		$scope.double = $scope.num * 2;
	}]);
})();