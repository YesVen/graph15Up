/* This service is for creating data for our application */

(function(){
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    /*
        value service can return a primitive value, an object or a function
        I am returning a string here.
    */
    contactApp.value("footerData", "Contacts App Footer");
    
    
    /*
        value service can return a primitive value, an object or a function
        I am returning an object here.
    */
    contactApp.value("headerData", {
        "name" : "Contacts App Header",
        "tagline" : "now you see angular"
    });
    
    
    contactApp.value("dummyData", function(){
        return "Contacts App dummy data";
    });
    
    
    contactApp.constant("constantDummyData1", "constantDummyData1");
    
    contactApp.constant("constantDummyData2", {
       "name" : "Test" ,
        "tagline" : "Test"
    });
    
    
})();