// Select all fireflies
let fireflies = document.querySelectorAll(".firefly");

// Attach event listener to each firefly
fireflies.forEach(firefly => {
    firefly.addEventListener("click", function() {
        let scale = 1;

        /* using scale variable, shrink the size of firefly by 0.1 in every 50 millisecond setInterval() function
        until it reach the scale value of less than or equal to 0, clearing the interval and initialize the 
        scale's value to 0 and make the visibility of firefly hidden. The firefly will be visible after 1 second 
        through setTimeout() function, in which another setInterval() function will grow the size of firefly by 0.1 in
        every 50 millisecond until it reaches scale value greater than or equal to 1, clearing the interval, 
        initialing the scale to 1 and returning it into its original size */
        let shrinkInterval = setInterval(() => {
            scale -= 0.1;
            if (scale <= 0) {
                clearInterval(shrinkInterval);
                scale = 0;
                this.style.visibility = "hidden";
                this.style.transform = `scale(${scale})`; 

                setTimeout(() => {
                    this.style.visibility = "visible";
                    let growInterval = setInterval(() => {
                        if (scale >= 1) {
                            clearInterval(growInterval);
                            scale = 1;
                            this.style.transform = `scale(${scale})`; 
                        } else {
                            scale += 0.1;
                            this.style.transform = `scale(${scale})`;
                        }
                    }, 50); 
                }, 1000);
            } else {
                this.style.transform = `scale(${scale})`;
            }
        }, 50); 
    });
});
     