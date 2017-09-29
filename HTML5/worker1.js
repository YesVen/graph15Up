//We can write the worker as below but its good idea to wrap that worker in an IIFE for obvious reasons u know well.



addEventListener('message', function(event){
    //doing some resource internsive task here
    console.log("New Event recieved in worjer thread"+ event);
    
    //eval is also accessible in worker
    console.log(eval(3 * 5));
    
    self.postMessage("Event recieved successfully, acknowlodgeing the event");
}, false);


/*
 above can be done like below too because this and self point to window object as we are using the dedicated workers.

onmessage = function(event){
    console.log(event.data);
} 

*/

