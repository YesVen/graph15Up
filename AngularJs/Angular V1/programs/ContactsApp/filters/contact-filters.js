(function() {
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    /*This filter makes the field password protected by simply returning stars instead of showing plain text password*/
    contactApp.filter("passwordify", function(){
        return function(){
            return "*********";
        };
    });
    
    
    contactApp.filter("prependtitle", function(){
        return function(title){
            if(title === "ms" || title === "miss"){
                return "Miss. " ;
            }
            else if(title === "mr"){
                return "Mr. " ;
            }
            else if(title === "mrs"){
                return "Mrs. "
            }
            
            return title;
        };
    });
    
    
})();