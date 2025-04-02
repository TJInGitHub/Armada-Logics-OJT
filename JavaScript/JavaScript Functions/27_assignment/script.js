/* Exercise 1: Writing Your First Callback Function */
function calculate(num1, num2, operation) {
    return operation(num1, num2);
}

function add(a, b) {
    return a + b;
}

function multiply(a, b) {
    return a * b;
}

/* Adding 2 callback functions to support subtraction and division */
function subtract(a, b) {
    return a - b;
}

function divide(a, b) {
    return a / b;
}

console.log(calculate(5, 3, add));      // Output: 8
console.log(calculate(4, 2, multiply)); // Output: 8
/* Additional console.log() to get subtraction and division output */
console.log(calculate(10, 2, subtract));      // Output: 8
console.log(calculate(80, 10, divide)); // Output: 8


/* Exercise 2: Using Callbacks with setTimeout */

/* Modified delayed message to accept another callback*/
function delayedMessage(delay, intro, callback) {
    intro();                                        /* Added callback to print the first function*/
    setTimeout(() => {
        callback();
    }, delay);
}

delayedMessage(2000, function(msg) {
    console.log("Hi, People!");         //printed first
}, function(msg) {
    console.log("Hello, World!")        //printed after 2 seconds later
});


/* Exercise 3: Looping with Callbacks */

/* Modified to stop early when callback returns false */
function repeatTask(times, callback) {  
    for (let i = 0; i < times; i++) {
        if (i === 2) {
            return false;
        }
        callback(i);
    }
}

repeatTask(5, function(index) {
    console.log("Iteration:", index);  /* due to the modification, will only iterate up to index 1 */
});