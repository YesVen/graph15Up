(function(){
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    contactApp.controller("headerController", function(headerData, viewsConstants){
       this.message = headerData.name; 
        this.view = viewsConstants.header;
    });
    
    
    
})();