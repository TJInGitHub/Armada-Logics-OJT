/* function updateName() which updates the profile name in h2 tag */
function updateName() {
    /* variable updatedName to store the value of an element with an id of update_name */
    var updatedName = document.getElementById("update_name").value;

    /* if-else statement in which if the value of updatedName is not empty and is not similar to the current
    profile name indicated in h2 tag, the profile name in h2 tag will be updated based on updatedName value */
    if (updatedName !== "" && updatedName !== document.getElementsByTagName("h2")[0].innerText){
        document.getElementsByTagName("h2")[0].innerText = updatedName;
    }
}

/* function updateBio() which updates the profile bio in p tag */
function updateBio() {
    /* variable updatedBio to store the value of an element with an id of update_bio */
    var updatedBio = document.getElementById("update_bio").value;

    /* if-else statement in which if the value of updatedBio is not empty and is not similar to the current
    profile bio indicated in p tag, the profile bio in p tag will be updated based on updatedBio value */
    if (updatedBio !== "" && updatedBio !== document.getElementsByTagName("p")[0].innerText){
        document.getElementsByTagName("p")[0].innerText = updatedBio;
    }
}

/* function updateImage() which updates the profile image in img tag */
function updateImage() {
    /* variable updatedImage to store the value of an element with an id of update_image */
    var updatedImage = document.getElementById("update_image").value;

    /* if statement in which if the value of updatedImage is not empty and is not similar to the current
    profile image src of img tag, the profile image src in img tag will be updated based on updatedImage value */
    if (updatedImage !== "" && updatedImage !== document.getElementsByTagName("img")[0].getAttribute("src")){
        document.getElementsByTagName("img")[0].setAttribute("src", updatedImage);
    }
}

/* function updateBgColor() which updates the background color of the profile through section tag */
function updateBgColor() {
    /* variable updatedBgColor to store the value of an element with an id of update_bgcolor */
    var updatedBgColor = document.getElementById("update_bgcolor").value;
    
    /* changes the background color of the profile through section tag with the value of the updatedBgColor */
    document.getElementsByTagName("section")[0].style.backgroundColor = updatedBgColor;
}

/* var updateButton to get the html Button object to update the profile through its ID */
var updateButton = document.getElementById("update_profile_card");

/* Add an event listener to the update profile button which executed the update profile function upon clicking */
updateButton.addEventListener("click", updateProfile);

/* function updateProfile() which is the master function that executes the update to the profile card utilizing
the individual update functions above */
function updateProfile(event){
    /* the event which is the click event that happened through the event listener from the update button 
    will be used to execute the preventDefault() function, in order to prevent the submit button treating the 
    submission as another link to be opened making the addTask(event) function work properly */
    event.preventDefault();

    /* call the other update functions to be executed to update the profile card details at once */
    updateName();
    updateBio();
    updateImage();
    updateBgColor();

    /* Log a message for confirmation that the profile card has been updated */
    console.log("User's Profile card has been updated.");

    /* Alert message so the user will know that the profile card has been updated */
    alert("Your Profile card has been updated.");
}
