document.getElementById("container").addEventListener("click", function() {
    alert("You clicked the container!");

    // "this" refers to the element that triggered the event (in this case, 				#container)
    this.style.backgroundColor = "lightgray"; 
});


document.querySelectorAll(".color-box").forEach(button => {
    button.addEventListener("click", function(event) {
        event.stopPropagation(); 
        /* get computed stylings for use in JavaScript as this.style.backgroundColor can only read inline styles */
        var getStyle = window.getComputedStyle(this);
        /* get the computed styling specifically for background color, to be used to change the container background */
        var backgroundColor = getStyle.backgroundColor;
        /* use the o */
        document.getElementById("container").style.backgroundColor = backgroundColor;
        alert("You clicked the " + this.textContent + " button!");
    });
});

