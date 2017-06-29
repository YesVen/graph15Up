(function(){
	angular.module("filterApp",[])
		.filter("myFilter", function(){
		return function(input, upperCase){
			if(upperCase)
			return input.toUpperCase();
			else
			return "Error";
		};
	})
	.filter("addSpouseName", function(){
		return function(yourName){
			return yourName + "& ASDS";
		};
	})
	.filter("reverse", function(){
		return function(input){
			return input.split("").reverse().join("");
		};
	})
	.filter("passwordfy", function(){
		return function(input){
			var name="";
			for(var index=0; index<input.length; index++)
			{
				name+= "*";
			}
			return name;
		};
	})
	.controller("filterController",["$scope", function($scope, myFilter){
		$scope.name = "Dnyanesh"
	}]);
})();