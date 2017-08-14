/* This controller handles footer part of our application*/

(function(){
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    contactApp.controller("footerController", function(footerData){
       this.message = footerData; 
    });
    
})();