/* Select Body */
var body = document.getElementsByTagName("body")[0];

/* Select jack-in-the-box image */
var box = document.getElementById("jack-in-the-box");

/* Select button */
var button = document.getElementById("button");

/* get the original image source */
var originalSource = box.getAttribute("src");

/* Add an event listener to button, that changes the jack-in the box image upon click to a gif version and 
upon clicking again, change back to image */
button.addEventListener("click", function(){
    /* get image source */
    var imageSource = box.getAttribute("src");

    /* get the new image source */
    var newSource = box.getAttribute("data-new-src");

    /* set gif as the source if the image src is the original source and let the text of content be close instead */
    if (imageSource == originalSource) {
        box.src = newSource;
        button.textContent = "Click to Close";
    /* set original image as the source if the image src is the gif source and let the text of content be returned to open again */
    } else {
        box.src = originalSource;
        button.textContent = "Click to Open";
    }
});