/* Task 1: Custom Array Filter */

/* This function filters the array to only have even numbers using a for loop to loop in the array
in which a callback function will be called to check if the array element according to its index 
is even, storing it in the empty array if it does so*/
function customFilter(arr, callback) {
    even = [];                                  
    for (let i = 0; i < arr.length; i++){       
        callback(arr[i]);
        if (callback(arr[i]) === true){
            even.push(arr[i]);
        }
    }
    return even;
}

/* The callback function used to check if the number is even */
function isEven(num) {
    return num % 2 === 0;
}

var numbers = [1, 2, 3, 4, 5, 6];
var evenNumbers = customFilter(numbers, isEven);
console.log(evenNumbers);  // Output: [2, 4, 6]


/* Task 2: Countdown Timer */

/* This is the countdown function. It has a for loop to loop from num 5 to 0, which it will print 
by 1 second between each other. This was accomplished by calling the callback function in setTimeout
with a delay that adjust to the current number i (0 second for 5, 1 second for 4, 2 second for 3
and so on until reaching number 0) */
function countdown(start, callback) {
    for (let i = start; i >= 0; i--){
        setTimeout(() => {
            callback(i);
        }, (start - i) * 1000);   
    }                               
}

/* Function to display the current number based on i */
function displayNumber(num) {
    console.log(num);
}

countdown(5, displayNumber);  // Output: 5 4 3 2 1 0 (with 1-second delay between each)


/* Task 3: Simple Event Listener */

/* This function will get the id of the button, which should be similar to buttonText and the 
event listener will be the callback function upon clicking, which will notify that the button is
clicked in the console */
function createButton(buttonText, callback) {
    document.getElementById(buttonText).addEventListener("click",callback);
}

/* A function created to notify that the button is clicked, appearing in console */
function buttonClicked() {
    console.log("Button Clicked!");
}

createButton("Click Me", buttonClicked);  


/* Task 4: Task Runner */

/* This function will display the output of another function with a 1-second delay between each 
task. This is done by looping through the array containing the list of tasks based on its length.
It will call the other functions by its index through return command inside the setTimeout with a 
delay that adjust also based on its index, thus having a 1 second delay between each task*/
function runTasks(tasks) {
    for (let i = 0; i < tasks.length; i++){
        setTimeout(() => {
            return tasks[i]();
        }, i * 1000);   
    }
}

/* A function to print that task 1 is completed */
function task1() {
    console.log("Task 1 completed");
}

/* A function to print that task 2 is completed */
function task2() {
    console.log("Task 2 completed");
}

/* A function to print that task 3 is completed */
function task3() {
    console.log("Task 3 completed");
}

runTasks([task1, task2, task3]);  