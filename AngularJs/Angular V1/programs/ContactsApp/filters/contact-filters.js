(function() {
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    /*This filter makes the field password protected by simply returning stars instead of showing plain text password*/
    contactApp.filter("passwordify", function(){
        return function(){
            return "*********";
        };
    });
    
    
    contactApp.filter("prependtitle", function(){
        return function(contact){
            if(contact.name.title === "ms"){
                return "Miss." + contact.name.first;
            }
            else if(contact.name.title === "mr"){
                return "Mr." + contact.name.first;
            }
            else{
                return contact.name.first;
            }
            
            return contact.name.first;
        };
    });
    
    
})();