(function () {

    var contactApp = angular.module("contactsApp"); //just GET the module already created

    contactApp.controller("contactController", function (contactsService) {

        this.hello = "Hello World";
        var self = this;


        //Note here : geContacts doesnt return a contacts data but a promise object
        //and the object has to handled by using promise pattern 
        this.contacts = contactsService.getContacts()
            .then(function (data) {
                self.contacts = data;
                self.selectedContact = data[0];
            });


        this.editMode = false;
        this.selectedContact =  {};

        this.handleContactClick = function (index) {
            this.selectedContact = this.contacts[index];
        };


        this.editContact = function ($event, $index) {
            this.editMode = true;
        };
        
        
        this.createContact = function() {
            
            this.editMode = true;
            this.selectedContact = {};
            
        };

        this.saveContact = function ($event, $index) {
            this.editMode = false;

            contactsService.updateContact().then(function (data) {
                self.selectedContact = data;
            })

        };

    });

})();