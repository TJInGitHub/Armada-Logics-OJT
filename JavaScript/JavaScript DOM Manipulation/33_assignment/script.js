/* function showNotification() which will make a notification message pop in the container when Show Notification
button was clicked */
function showNotification(){
    /* create a section element to contain the notification message and the close button */
    var newSection = document.createElement("section");

    /* get the div container to where the section will be added */
    var container = document.getElementById("container");

    /* add the newly created section to the div container */
    container.appendChild(newSection);

    /* create the notification message */
    var notification = document.createElement("p");

    /* Set the notification message text content */
    notification.innerText = "You have a new message";

    /* create a closing button */
    var closeButton = document.createElement("button");

    /* Set the closing button text content */
    closeButton.innerText = "X";

    /* set an onclick attribute on the closing button, which will contain a function to remove the notification message*/
    closeButton.onclick = function () {
        container.removeChild(newSection);
    };
    
    /* add the notification message and close button on the newly created section*/
    newSection.appendChild(notification);
    newSection.appendChild(closeButton);

    console.log("A new notification was shown.")
}
