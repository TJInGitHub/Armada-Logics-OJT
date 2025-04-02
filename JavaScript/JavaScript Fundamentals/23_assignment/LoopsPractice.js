console.log("Task 1: Multiplication Table Generator");

/* Variable number with a value between 1 and 10. */
let number = 5;

/* for loop to generate the multiplication for the given numbertable from 1 to 10 */
for (let i =1; i <= 10; i++) {
    let result = number * i;
    /* Print as number x i = result */
    console.log(number,"x",i,"=",result);
}


console.log("Task 2: Sum of First N Natural Numbers");

/* Variable n with a value greater than 0. */
let n =  5;
/* variable result with 0 as default value */
var result = 0;

/* for loop to calculate the sum of the first n natural numbers */
for (let i = n; i != 0; i--) {
    result += i;
}
/* Print as "The sum of the first n numbers is: result." */
console.log("The sum of the first n numbers is:",result);


console.log("Task 3: Array Elements Printer");

/* Array of integers with at least 5 elements. */
let array = [2,4,6,8,10];

/* for loop to iterate through the array and print each element. */
for (let i = 0; i < array.length; i++){
    console.log("Array Element:",array[i]);
}


console.log("Task 4: Pattern Printer");

/* for loop to print the following pattern of stars (*): */

/* Outer loop controls the number of rows */
for (let row = 1; row <= 5; row++) {
    /* inner loop controls the number of stars in each row. */
    for (let col = 1; col == 1; col++) {
        let stars = ["*","**","***","****","*****"];
        console.log(stars[row - 1]);
    }
}


console.log("Task 5: Reverse Array Elements");

/* Array of integers with at least 5 elements. */
let another_array = [1,3,5,7,9];

/* for loop to print the elements of the array in reverse order. */
for (let i = another_array.length - 1; i != -1; i--){
    console.log("Reversed Element:",another_array[i]);
}