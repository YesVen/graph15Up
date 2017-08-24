(function(){
    
    var app = angular.module("mymodule"); //Just GET it
    
    app.directive('currentTime', function($log, $interval){
        return {
            link : function(scope, element, attributes){
                    $log.info(attributes);    
                    
                    /*There are a few special events that AngularJS emits. 
                    When a DOM node that has been compiled with AngularJS's compiler is destroyed, 
                    it emits a $destroy event. Similarly, when an AngularJS scope is destroyed, 
                    it broadcasts a $destroy event to listening scopes.
                    
                    By listening to this event, you can remove event listeners that might cause memory leaks
                    */
                    element.on("$destroy", function(){
                        $interval.cancel(timeoutId);
                    });
                
                    var timeoutId = $interval(function(){
                        element.text( attributes.country + " time is " + new Date().toTimeString());
                    }, 1000);
            },
            restrict : "E" /*
                                Since I am creating entirely diffrent DOM element (not decorating, enhancing existing 
                                DOM element), I am be declaring it as "restrict to Element"
                                So this directive can only be used as "element"
                            */
        }
    });
    
    
    
    
})();