onmessage = function(event){
    
    //x is undefined. Creating an Error purposefully
    console.log(event);
    
    postMessage(1/x);
};