/* Task 1: Inventory Tracker */

/* Array named inventory to store 5 elements(fruits) */
let inventory = ["apple", "banana", "cherry", "date", "elderberry"];

/* Array named inventoryCount to store number of stocks for each element(fruit) */
let inventoryCount = [10, 15, 5, 20, 7];

/* for loop to log the stored element(fruit) and its stored number of stocks from their arrays*/
for (let i = 0; i < inventory.length; i++) {
    console.log(`${inventory[i]}: ${inventoryCount[i]}`);}

/* Expected Output:
apple: 10
banana: 15
cherry: 5
date: 20
elderberry: 7
*/


/* Task 2: Alphabetical Sorting */

/* Array named words containing 5 elements(words) */
let words = ["zebra", "apple", "mango", "cherry", "banana"];

/* Outer for loop for looping 5 times (based on array's length) */
for (let i = 0; i < words.length; i++) {
    /* Inner for loop to log the 5 elements (words) by aphabetical order */
    for (let j = i + 1; j < words.length; j++) {
        if (words[i] > words[j]) {   /* if else statement to get the order from first word to last word */
            let temp = words[i];     
            words[i] = words[j];     
            words[j] = temp;         
        }
    }
}

/* Display words array */
console.log(words);

/* Expected Output:
['apple','banana','cherry','mango','zebra']
*/


/* Task 3: Unique Array Builder */

/* empty array named uniqueNumvers to store the random number generated */
let uniqueNumbers = [];

/* while loop to generate random number from 1 to 20 to be done 10 times*/
while (uniqueNumbers.length < 10) {
    let randomNumber = Math.floor(Math.random() * 20) + 1;

  // Check if the randomNumber already exists in the array
    let exists = false;
    for (let i = 0; i < uniqueNumbers.length; i++) {
        if (uniqueNumbers[i] === randomNumber) {
            exists = true;
            break;
        }
    }

  // If it doesn't exist, add it to the array
    if (!exists) {
        uniqueNumbers.push(randomNumber);
    }
}

/* Display uniqueNumbers array */
console.log(uniqueNumbers);

/* Expected Output:
any number from 1 to 20 can be stored in the array as long as it's not the same
i.e. [1,2,3,4,5,6,7,8,9,10]
*/


/* Task 4: Triangle Checker */

/* variables based on the 3 sides of the triangle, where value refers to length */
let sideA = 7;
let sideB = 10;
let sideC = 5;

/* if else statement to verify if the sides realy form a valid triangle */
if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
    console.log(`The sides ${sideA}, ${sideB}, and ${sideC} form a valid triangle.`);
} else {
    console.log(`The sides ${sideA}, ${sideB}, and ${sideC} do not form a valid triangle.`);
}

/* Expected Output:
The sides 7, 10, and 5 form a valid triangle.
*/
