(function(){
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    contactApp.controller("headerController", function(headerData){
       this.message = headerData.name; 
    });
    
    
    
})();