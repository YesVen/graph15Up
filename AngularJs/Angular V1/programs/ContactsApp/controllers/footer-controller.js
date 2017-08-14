(function(){
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    contactApp.controller("footerController", function(){
       this.message = "Footer Messsage"; 
    });
    
})();