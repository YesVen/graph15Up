(function(){
    
    var app = angular.module('doctorApp',[]);
    
    
    
    app.controller('clipController', function(dummyPlaceHolderService){
        
        this.clip = dummyPlaceHolderService.getTodaysClip();
        this.isPlaying = false;
        
        this.playClip = function(event){
            
            console.log("Playing Clip");
            this.isPlaying = true;
            
            //Send a request to fetch actual clip over http
            
            
        }
        
        this.stopClip = function(event){
            
            console.log("Stopping Clip");
            this.isPlaying = false;
            
            //Send a request to abort playing clip
            
            
        }
        
    });

    
    
    
    app.service('dummyPlaceHolderService', function(){
        this.getTodaysClip = function(){
            return {
                name : 'Name of the Clip',
                desc : 'Description about a clip',
                cinicName : 'Youe Clinic Name',
                imageURL : 'item2.jpg'
            }
        }
    })
    
})();