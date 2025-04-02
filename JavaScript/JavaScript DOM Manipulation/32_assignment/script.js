
/* function updateName() which updates the profile name in h2 tag */
function updateName() {
    /* variable updatedName to store the value of an element with an id of update_name */
    var updatedName = document.getElementById("update_name").value;

    /* if-else statement in which if the value of updatedName is not empty and is not similar to the current
    profile name indicated in h2 tag, the profile name in h2 tag will be updated based on updatedName value, 
    logging a message that it is now updated with the new name. If it doesnt satisfy the conditions, it will only
    log a message that it can't be updated*/
    if (updatedName !== "" && updatedName !== document.getElementsByTagName("h2")[0].innerText){
        document.getElementsByTagName("h2")[0].innerText = updatedName;
        console.log("Profile name is updated to: " + updatedName);
    } else {
        console.log("Profile name can't be updated as no new name was entered.");
    }
}

/* function updateBio() which updates the profile bio in p tag */
function updateBio() {
    /* variable updatedBio to store the value of an element with an id of update_bio */
    var updatedBio = document.getElementById("update_bio").value;

    /* if-else statement in which if the value of updatedBio is not empty and is not similar to the current
    profile bio indicated in p tag, the profile bio in p tag will be updated based on updatedBio value, 
    logging a message that it is now updated with the new bio. If it doesnt satisfy the conditions, it will only
    log a message that it can't be updated*/
    if (updatedBio !== "" && updatedBio !== document.getElementsByTagName("p")[0].innerText){
        document.getElementsByTagName("p")[0].innerText = updatedBio;
        console.log("Profile bio is updated to: " + updatedBio);
    } else {
        console.log("Profile bio can't be updated as no new bio was entered.");
    }
}

/* function updateImage() which updates the profile image in img tag */
function updateImage() {
    /* variable updatedImage to store the value of an element with an id of update_image */
    var updatedImage = document.getElementById("update_image").value;

    /* if-else statement in which if the value of updatedImage is not empty and is not similar to the current
    profile image src of img tag, the profile image src in img tag will be updated based on updatedImage value, 
    logging a message that it is now updated with the new image. If it doesnt satisfy the conditions, it will only
    log a message that it can't be updated*/
    if (updatedImage !== "" && updatedImage !== document.getElementsByTagName("img")[0].getAttribute("src")){
        document.getElementsByTagName("img")[0].setAttribute("src", updatedImage);
        console.log("Profile image is updated to: " + updatedImage);
    } else {
        console.log("Profile image can't be updated as no new image URL was entered.");
    }
}

/* function updateBgColor() which updates the background color of the profile through section tag */
function updateBgColor() {
    /* variable updatedBgColor to store the value of an element with an id of update_bgcolor */
    var updatedBgColor = document.getElementById("update_bgcolor").value;
    
    /* changes the background color of the profile through section tag with the value of the updatedBgColor */
    document.getElementsByTagName("section")[0].style.backgroundColor = updatedBgColor;

    /* Log that the profile's background color is changed to the updatedBgColor*/
    console.log("Background color is updated to: " + updatedBgColor);
}