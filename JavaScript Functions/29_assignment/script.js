/* Comment other tasks that used result variable except from the others to run it without errors
due to same variable declaration (I didn't change it as its the given provided.*/

/* Task 1: Custom Map Functions */

/* This function will double the array after being called by doubled. It will received the numbers 
array to be doubled through the callback function. An empty array (times2) was created to stored 
the doubled numbers array elements through .push command in the for loop.*/
function customMap(arr, callback){
    times2= [];
    for (let i = 0; i < arr.length; i++){
        times2.push(callback(arr[i]));
    }
    return times2;
}

let numbers = [1, 2, 3];
let doubled = customMap(numbers, function(num) { return num * 2; });
console.log(doubled); // Should output: [2,4,6]


/* Task 2: Filter Function */

/* This function will filter numbers less than 10 in the array. It will do so by receiving an 
array to be used and through the callback function that will verify if the array element is less 
than 10. An empty array (filtered_arr) was created to store those that passed the said condition 
declared in callback fucntion during the for loop by pushing the array elements through .push
command */
function filter(arr, callback){
    filtered_arr = [];
    for (let i = 0; i < arr.length; i++){
        callback(arr[i]);
        if (callback(arr[i]) === true){
            filtered_arr.push(arr[i]);
        }
    }
    return filtered_arr;
}

let result = filter([1,2,3,4,15], function(val) { return val<10; });
console.log(result); // Should output: [1,2,3,4]


/* Task 3: Some Function */

/* This function will return false if any number element in the array is not greater than 5. The 
variable result will call the function to use an array in which the numbers contained will be
checked through for loop, including the callback function that will do the checking. To make it 
responsive, it will return true if all the number element are greater than 5, which will only be 
executed after the for loop*/
function some(arr, callback){
    for (let i = 0; i < arr.length; i++){
        callback(arr[i]);
        if (callback(arr[i]) === false){
            return false;
        } 
    }
    return true;
}

let result = some([1,2,3,4], function(val) { return val>5; });
console.log(result); // Should output: false


/* Task 4: Every Function */

/* This function will instead verified if any number element in the array is greater than 0, and
will return true if it does. It's structure is similar to task 3, in which it only does the
opposite. It will return false only after the for loop ends, notifying that all the number elements
in the array didn't satisfied the condition to make it responsive. */
function every(arr, callback){
    for (let i = 0; i < arr.length; i++){
        callback(arr[i]);
        if (callback(arr[i]) === true){
            return true;
        } 
    }
    return false;
}
let result = every([1,2,3], function(val) { return val>0; });
console.log(result); // Should output: true


/* Task 5: Reduce Function */

/* This function will reduce the array into a single number by adding its number elements together.
The variable sum declared will call this function, getting the array to use, including the callback
function that will help in adding array elements. Within this function, variable add was declared 
to have zero as its default value, with the for loop adding the index element from index 0 to 
second to the last index. The callback will be called after to use the total of add and the last 
index to sum everything up, getting the output. This structure also made the code responsive. */
function reduce(arr, callback){
    add = 0;
    for (let i = 0; i < arr.length - 1; i++){
        add += arr[i];
    }
    return callback(add, arr[arr.length - 1]);
}

let sum = reduce([1,2,3], function(acc, num) { return acc + num; });
console.log(sum); // Should output: 6


/* Task 6: Includes Check*/

/* This function will check an array if there are any number elements that equals to 2. It will
be called by variable result, receiving the array to use and the callback function to verify if the
number element is equal to 2. A for loop is created to let it loop until all array elements are
verified in callback if its true or not. After the for loop, it will return false if it does not 
satisfy the condition, making it responsive */
function includes(arr, callback){
    for (let i = 0; i < arr.length; i++){
        callback(arr[i]);
        if (callback(arr[i]) === true){
            return true;
        } 
    }
    return false;
}

let result = includes([1,2,3], function(val) { return val===2; });
console.log(result); // Should output: true