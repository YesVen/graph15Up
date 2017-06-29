(function()
{
	var myApp = angular.module("myApp",[]);
		
	myApp.factory("ServiceId1", function(){
		
	});
	
	myApp.factory("serviceId2", function(){
		
	});
	
	
	//note here that service are just registered here to myApp using factory pattern.
	//The service instance will be created on the fly based on request and not immidiately
})();