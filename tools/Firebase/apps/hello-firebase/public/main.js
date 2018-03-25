function signUp(e){
    
    validateUserInput();
    
    firebase.auth().createUserWithEmailAndPassword("dnyanesh4it@gmail.com", "testpassword")
    .then(function(success){
        firebase.auth().currentUser.sendEmailVerification()
        .then(function(){
            alert("Verification mail has been sent to your mail id.");
        })
        .catch(function(error){
            alert(error);
        });
    })
    .catch(function(error) {
        var errorCode = error.code;
        var errorMessage = error.message;
        console.error(errorCode + " : "+ errorMessage);      
    });
    
}


function validateUserInput(){
    return;
}



function toggleSignIn() {
    if (!firebase.auth().currentUser) {
    // [START createprovider]
    var provider = new firebase.auth.GoogleAuthProvider();
    // [END createprovider]
    // [START addscopes]
    provider.addScope('https://www.googleapis.com/auth/contacts.readonly');
    // [END addscopes]
    // [START signin]
    firebase.auth().signInWithPopup(provider).then(function(result) {
      // This gives you a Google Access Token. You can use it to access the Google API.
      var token = result.credential.accessToken;
      // The signed-in user info.
      var user = result.user;
      // [START_EXCLUDE]
      document.getElementById('quickstart-oauthtoken').textContent = token;
      // [END_EXCLUDE]
    }).catch(function(error) {
      // Handle Errors here.
      var errorCode = error.code;
      var errorMessage = error.message;
      // The email of the user's account used.
      var email = error.email;
      // The firebase.auth.AuthCredential type that was used.
      var credential = error.credential;
      // [START_EXCLUDE]
      if (errorCode === 'auth/account-exists-with-different-credential') {
        alert('You have already signed up with a different auth provider for that email.');
        // If you are using multiple auth providers on your app you should handle linking
        // the user's accounts here.
      } else {
        console.error(error);
      }
      // [END_EXCLUDE]
    });
    // [END signin]
    } else {
    // [START signout]
    firebase.auth().signOut();
    // [END signout]
    }
    // [START_EXCLUDE]
    document.getElementById('quickstart-sign-in').disabled = true;
// [END_EXCLUDE]
}