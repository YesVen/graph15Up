(function () {

    var contactApp = angular.module("contactsApp", []); //actual creation of contacts module


    /*
        We are telling angular that please dont apply cross origin policy CORS on below list of urls
    */
    //This should be in seperate config file
    contactApp.config(function ($sceDelegateProvider) {
        $sceDelegateProvider.resourceUrlWhitelist([
            // Allow same origin resource loads.
            'self',
            // Allow loading from our assets domain.**.
            'https://randomuser.me/**'
        ]);

    });

})();