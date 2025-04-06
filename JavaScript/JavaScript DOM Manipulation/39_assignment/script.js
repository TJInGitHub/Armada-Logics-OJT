var page = document.getElementsByTagName("body")[0];
var title = document.getElementsByTagName("h1")[0];
var description = document.getElementsByTagName("p")[0];
var selectedColor = document.getElementById("selected_color");

document.getElementById("container").addEventListener("click", function() {

    /* Remove existing black border to each buttons */
    document.querySelectorAll(".color-box").forEach(button => {
        button.style.border = "none";
    });

    // "this" refers to the element that triggered the event (in this case, #container)
    this.style.backgroundColor = "lightgray";
    page.style.backgroundColor = "white";
    
    /* change the h3 tag contents that display the selected color into selected color: none and also h1 tag or 
    title and p tag or description color into black */
    selectedColor.textContent = "Selected Color: None";
    selectedColor.style.color = "black";
    title.style.color = "black";
    description.style.color = "black";
});

document.querySelectorAll(".color-box").forEach(button => {
    button.addEventListener("click", function(event) {
        event.stopPropagation(); 

        /* Remove existing black border to each buttons */
        document.querySelectorAll(".color-box").forEach(button => {
            button.style.border = "none";
        });

        /* get computed stylings for use in JavaScript as this.style.backgroundColor can only read inline styles */
        var getStyle = window.getComputedStyle(this);
        /* get the computed styling specifically for background color, to be used to change the container background */
        var backgroundColor = getStyle.backgroundColor;
        /* use the obtained backgroundColor for the color of container and the body */
        document.getElementById("container").style.backgroundColor = backgroundColor;
        page.style.backgroundColor = backgroundColor;

        /* add a black border when button is clicked */
        this.style.border = "2px solid black";

        /* if-else-if statement to change h3 tag text content of selected color displayed based on the following
        rgb values (i.e. rgb(255, 0, 0) is Selected Color: Red) and also h1, h3 and p text color changed to white if the  
        background color of container and body is color red, blue, green and purple, while black if the selected
        color is none, orange and yellow*/
        if (backgroundColor == "rgb(255, 0, 0)"){
            selectedColor.textContent = "Selected Color: Red";
            selectedColor.style.color = "white";
            title.style.color = "white";
            description.style.color = "white";
        } else if (backgroundColor == "rgb(0, 0, 255)") {
            selectedColor.textContent = "Selected Color: Blue";
            selectedColor.style.color = "white";
            title.style.color = "white";
            description.style.color = "white";
        } else if (backgroundColor == "rgb(0, 128, 0)") {
            selectedColor.textContent = "Selected Color: Green";
            selectedColor.style.color = "white";
            title.style.color = "white";
            description.style.color = "white";
        } else if (backgroundColor == "rgb(255, 165, 0)") {
            selectedColor.textContent = "Selected Color: Orange";
            selectedColor.style.color = "black";
            title.style.color = "black";
            description.style.color = "black";
        } else if (backgroundColor == "rgb(128, 0, 128)") {
            selectedColor.textContent = "Selected Color: Purple";
            selectedColor.style.color = "white";
            title.style.color = "white";
            description.style.color = "white";
        } else {
            selectedColor.textContent = "Selected Color: Yellow";
            selectedColor.style.color = "black";
            title.style.color = "black";
            description.style.color = "black";
        }
    });
});

