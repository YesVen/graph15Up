/* This service is for creating data for our application */

(function(){
    
    var contactApp = angular.module("contactsApp"); //just GET the module already created
    
    /*
        value service can return a primitive value, an object or a function
        I am returning a string here.
    */
    contactApp.value("footerData", "Made in love with the angular");
    
    
    /*
        value service can return a primitive value, an object or a function
        I am returning an object here.
    */
    contactApp.value("headerData", {
        "name" : "Contacts App",
        "tagline" : "now you see angular"
    });
    
    
    
    contactApp.service("contactsService", function($http,$log){
        var self = this;
        
        this.getContacts = function(){
            return $http.get("https://randomuser.me/api/?results=10")
                .then(
            function(response){
                    return response.data.results;
                //Note here : geContacts doesnt return a contacts data but a promise object
                //and the object has to handled by using promise pattern  
            },
            function(response){//error function
                self.errorMessage = "There was an error. Please try again.";
                $log.error("Server Error has occurred : " + response);
            });
        };
        
        this.updateContact = function(){
            //Write a code to update this contact and return a promise back to controller 
            
            return;
        }
        
        
        this.createContact = function() {
            return $http.post("sdadasds",{
                "name" : "sadasda",
                "address" : "asdadas"
            }).then(function(response){
               self.successMessage = "Data saved successfully"; 
            }, function(){
                self.errorMessage = "There was an error. Please try again.";
            });
        }
    });
    
    
    contactApp.constant("allContacts",{
        "contacts" : {"results":[{"gender":"female","name":{"title":"ms","first":"phoebe","last":"edwards"},"location":{"street":"3956 beach road","city":"porirua","state":"taranaki","postcode":18132},"email":"phoebe.edwards@example.com","login":{"username":"ticklishgorilla916","password":"fruit","salt":"UkcXgGtE","md5":"9ca9a4f1eeaa6945563364f8cc0a4b43","sha1":"f26c07fdd620ea9aa2101c2ffcf5bf677777b91b","sha256":"514bef2fe5959ddf39e4e18574a66be798cd96d666e7f65bdcc5c0af9fae5a7e"},"dob":"1971-06-10 06:37:07","registered":"2011-10-09 03:35:24","phone":"(865)-864-4476","cell":"(297)-752-2125","id":{"name":"","value":null},"picture":{"large":"https://randomuser.me/api/portraits/women/19.jpg","medium":"https://randomuser.me/api/portraits/med/women/19.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/19.jpg"},"nat":"NZ"},{"gender":"female","name":{"title":"mrs","first":"alberte","last":"jørgensen"},"location":{"street":"3820 solsortevej","city":"snertinge","state":"nordjylland","postcode":93408},"email":"alberte.jørgensen@example.com","login":{"username":"goldenduck234","password":"minime","salt":"uWWC5AVw","md5":"28899a49ff2acee5fa9077132dfaf846","sha1":"baecaf8b78e255a390601f3e3040311f5ac82ecc","sha256":"ec23599d779df54d9326a6a2e4bc43526f85e3959ffa0e306d7b6b2e026ca8be"},"dob":"1957-08-28 06:23:50","registered":"2012-11-30 11:50:44","phone":"36407054","cell":"84946745","id":{"name":"CPR","value":"579854-0305"},"picture":{"large":"https://randomuser.me/api/portraits/women/31.jpg","medium":"https://randomuser.me/api/portraits/med/women/31.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/31.jpg"},"nat":"DK"},{"gender":"male","name":{"title":"mr","first":"justin","last":"meyer"},"location":{"street":"5329 rue andré-gide","city":"créteil","state":"tarn-et-garonne","postcode":42674},"email":"justin.meyer@example.com","login":{"username":"greenelephant188","password":"markie","salt":"0Jp2zqF2","md5":"bdbf950a201c88d1b155496d84dffcea","sha1":"f28c0fd8a1de2286e5396b3e24e1c8b0ea9f7fdf","sha256":"15b0a742a0f0c186d49cd7855d41f48d852baa823ec8add37e2cd67146a6d491"},"dob":"1957-06-28 11:47:04","registered":"2004-05-28 19:55:35","phone":"05-64-47-15-91","cell":"06-59-80-06-00","id":{"name":"INSEE","value":"157549245816 61"},"picture":{"large":"https://randomuser.me/api/portraits/men/54.jpg","medium":"https://randomuser.me/api/portraits/med/men/54.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/54.jpg"},"nat":"FR"},{"gender":"male","name":{"title":"mr","first":"önal","last":"çatalbaş"},"location":{"street":"4485 maçka cd","city":"kahramanmaraş","state":"çanakkale","postcode":31595},"email":"önal.çatalbaş@example.com","login":{"username":"brownlion855","password":"cameron1","salt":"8pPQsxzH","md5":"deeba4f3da70b7fb0e0a40dea28c0f01","sha1":"46034ce6e2ccfa2762974cdddf45dfc99597190c","sha256":"5613cf39996445fab03242e720b7263ceeaba5136388fad5e943f806ca164d5a"},"dob":"1965-02-09 13:46:39","registered":"2009-04-19 17:42:34","phone":"(765)-622-0448","cell":"(169)-884-2984","id":{"name":"","value":null},"picture":{"large":"https://randomuser.me/api/portraits/men/88.jpg","medium":"https://randomuser.me/api/portraits/med/men/88.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/88.jpg"},"nat":"TR"},{"gender":"male","name":{"title":"mr","first":"willie","last":"holland"},"location":{"street":"7085 high street","city":"kilcoole","state":"tipperary","postcode":86226},"email":"willie.holland@example.com","login":{"username":"blueleopard578","password":"yyyy","salt":"jIMKkgCE","md5":"30183fa9145962bcb87ea330e1b15e35","sha1":"5440a00f299737f190fd4c36106c1491a0bd54e9","sha256":"9b834bb2ce631a4f6daad25cef86239e8c12359511f363093d30edeefc806600"},"dob":"1981-04-24 17:08:44","registered":"2003-05-26 21:30:28","phone":"011-067-0624","cell":"081-729-5975","id":{"name":"PPS","value":"2998729T"},"picture":{"large":"https://randomuser.me/api/portraits/men/7.jpg","medium":"https://randomuser.me/api/portraits/med/men/7.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/7.jpg"},"nat":"IE"},{"gender":"male","name":{"title":"mr","first":"lukas","last":"lefebvre"},"location":{"street":"4377 rue louis-blanqui","city":"angers","state":"vendée","postcode":91395},"email":"lukas.lefebvre@example.com","login":{"username":"brownfrog563","password":"playball","salt":"Ziz3C92M","md5":"3a433d4d370503097d0b5a6894e32d8e","sha1":"30b6275e457639d78dcf7b1a30805f0f07e3b084","sha256":"b9e9f0ec8e7cb4da302ab672d18677dea02528ce517b7ac7726b80c05aac69f5"},"dob":"1991-02-06 13:26:37","registered":"2008-09-13 14:39:37","phone":"04-58-16-79-99","cell":"06-71-58-12-85","id":{"name":"INSEE","value":"191159771851 35"},"picture":{"large":"https://randomuser.me/api/portraits/men/21.jpg","medium":"https://randomuser.me/api/portraits/med/men/21.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/21.jpg"},"nat":"FR"},{"gender":"female","name":{"title":"mrs","first":"melanie","last":"steiner"},"location":{"street":"1767 tannenweg","city":"mannheim","state":"berlin","postcode":19175},"email":"melanie.steiner@example.com","login":{"username":"yellowpanda738","password":"christmas","salt":"EZ4ciZVi","md5":"a1cc1f26824cea08286fa0498b5b6f9d","sha1":"e715c82b0491591befc3e069795b4c274f84c0c9","sha256":"1f23f82aa5510a2ff4688f650a7761af7f9e708f41dc8053c9cab9879916167a"},"dob":"1955-12-11 01:21:20","registered":"2015-01-22 12:56:29","phone":"0878-4914153","cell":"0175-7713908","id":{"name":"","value":null},"picture":{"large":"https://randomuser.me/api/portraits/women/34.jpg","medium":"https://randomuser.me/api/portraits/med/women/34.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/34.jpg"},"nat":"DE"},{"gender":"male","name":{"title":"mr","first":"dyan","last":"eveleens"},"location":{"street":"2115 hoefsmederijpad","city":"marum","state":"flevoland","postcode":39280},"email":"dyan.eveleens@example.com","login":{"username":"blackfish784","password":"asdf123","salt":"FWGc3a75","md5":"4c1d4addbf9ab6e60a89b44586e0a86f","sha1":"4a6c88ee00269bf3174a22ba639cf76b9be090d8","sha256":"df52f7318c96378a7633b3f6f4fcf38bff20162b8b501fa748af265a364df629"},"dob":"1986-06-03 17:53:54","registered":"2014-04-07 13:05:18","phone":"(627)-454-3417","cell":"(901)-332-4742","id":{"name":"BSN","value":"86891363"},"picture":{"large":"https://randomuser.me/api/portraits/men/76.jpg","medium":"https://randomuser.me/api/portraits/med/men/76.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/76.jpg"},"nat":"NL"},{"gender":"male","name":{"title":"mr","first":"mason","last":"singh"},"location":{"street":"7840 argyle st","city":"armstrong","state":"yukon","postcode":67396},"email":"mason.singh@example.com","login":{"username":"lazysnake266","password":"volcom","salt":"CqvGQbv1","md5":"22ed99ec269b86c038d43ea96ca3ce40","sha1":"928050b4d016fe11a6ff41f34ee231cb64f7110d","sha256":"7078e36f73b3c5e9c90f579c8ad8cb6bae1b8c8657e8242eb5e913b1392e1b8f"},"dob":"1951-04-22 14:07:48","registered":"2016-01-06 05:34:00","phone":"442-820-1195","cell":"891-826-3206","id":{"name":"","value":null},"picture":{"large":"https://randomuser.me/api/portraits/men/48.jpg","medium":"https://randomuser.me/api/portraits/med/men/48.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/48.jpg"},"nat":"CA"},{"gender":"male","name":{"title":"mr","first":"christian","last":"thomsen"},"location":{"street":"7173 egernvej","city":"københavn s","state":"midtjylland","postcode":16539},"email":"christian.thomsen@example.com","login":{"username":"orangeleopard721","password":"naked","salt":"xV6dByL5","md5":"fa9da9ddeb082a582ec15acfc4cd51fe","sha1":"74216588ba0bdb697d60ce935b76243cd4b10b3d","sha256":"19b2684c3de490742abe1816bbeef3a5c991ad01d7cc90757e036178ac3e17a6"},"dob":"1983-03-18 14:17:31","registered":"2009-02-22 07:21:38","phone":"87634500","cell":"72311895","id":{"name":"CPR","value":"016786-5466"},"picture":{"large":"https://randomuser.me/api/portraits/men/59.jpg","medium":"https://randomuser.me/api/portraits/med/men/59.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/59.jpg"},"nat":"DK"}],"info":{"seed":"2e52980285522769","results":10,"page":1,"version":"1.1"}}
    });
    
    
    
    
    contactApp.constant("viewsConstants", {
        "header" : "views/header.html",
        "footer" : "views/footer.html"
    });
    
    contactApp.constant("constantDummyData2", {
       "name" : "Test" ,
        "tagline" : "Test"
    });
    
    
})();