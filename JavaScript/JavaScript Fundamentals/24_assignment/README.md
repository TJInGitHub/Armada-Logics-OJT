# Created by: **Timothy Jher G. Eusebio**
## T-Diagram, Expected Output, Explanation and Reflection for JS Challenge II

This .md file will provide you my T-diagram, expected output and explanations for the given code in each given tasks, including my reflection regarding this assignment.

## Tasks
### Task 1: Inventory Tracker

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | inventory        | ["apple", "banana", "cherry", "date", "elderberry"] |
    | inventoryCount   | [10, 15, 5, 20, 7]                                  |
    | i                | 0                                                   |
    | inventory.length | 5                                                   |

- **Expected Output**:
    ```bash
    apple: 10
    banana: 15
    cherry: 5
    date: 20
    elderberry: 7

- **Explanation**: This task used 2 arrays (*inventory* to store the fruit elements & *inventoryCount* to store the number of stocks). For tracking the inventory, a for loop is used in which it will loop based on the length of the array (*inventory.length* which is = 5), as long as variable *i* (starting value is 0) is less than the said length of the array, increasing per loop (through *i++*). Through this loop, it will log the name of the fruit elements in the inventory and its stock in the inventoryCount, which is done through the variable *i* serving as the arrays index value to call the element in the array that have the said index value (i.e. inventory[0] = apple & inventoryCount[0] = 10), repeating it until all the array elements are logged. 


### Task 2: Alphabetical Sorting

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | words            | ["zebra", "apple", "mango", "cherry", "banana"]     |
    | i                | 0                                                   |
    | words.length     | 5                                                   |
    | j                | i + 1                                               |
    | temp             | words[i]                                            |


- **Expected Output**:
    ```bash
    ['apple','banana','cherry','mango','zebra']

- **Explanation**: An array named *words* was created that contains 5 word elements. This word elements are not in alphabetical order. To organize this, 2 for loops are created. The outer for loop is used for looping based on the array's length (*words.length* which is 5) as long as variable *i* (default value is 0) is less than the said length, incrementing until it exceed  the said length (looping for 5 times). For the inner loop, it is used to arrange the 5 word elements in the array in aphabetical order until variable *j* (equals to i + 1) isn't less than the array's length, also incrementing until it exceed the said length. Inside this for loop is an if statement in which variable *i* will serve as the index for the first element (words[i]) that will be compared if its greater than (in terms of alphabetical order) to the second element with an index of variable *j* (used to get the next element as words[j]). If it is, it will be stored in variable *temp* and the words[j] will be equal to words[i] to swap their order. Once the for loops finished, it will print the expected output through console.log(words).


### Task 3: Unique Array Builder

- **T-Diagram**:

    |      Variables       |                      Values                         |
    | :------------------: | --------------------------------------------------- |
    | uniqueNumbers        | [] (an empty array)                                 |
    | uniqueNumbers.length | 0                                                   |
    | randomNumber         | Math.floor(Math.random() * 20) + 1                  |
    | exists               | false                                               |


- **Expected Output**: any number from 1 to 20 can be stored in the array as long as it's not the same.For example:
    ```bash
    [1,2,3,4,5,6,7,8,9,10]

- **Explanation**: An empty array named *uniqueNumbers* is created which will be a container for random numbers. To generate the numbers to put in the array, a while loop is created to generate random number to be done 10 times (as *uniqueNumbers* is equal to 0 and it will loop as long as it's less than 10). Variable *randomNumber* will contain the generated random numbers with a value ranging from 1 to 20 (based on the output of this code Math.floor(Math.random() * 20) + 1, where Math.random() generates a random number between 0 and 1, and Math.floor to round-off the output of the previous code times 20). Within the while loop, a for loop and if statements are used to verify if the random number already exists in the array to ensure that it contains only unique numbers. The for loop will loop until variable *i* (equals to 0) is not less than the array's length (uniqueNumbers.length), incrementing until it does, where inside it is an if statement that compares an element in the array with variable *i* as index (uniqueNumbers[i]) to the value of randomNumber in which if it does exists, the boolean variable *exists* outside the for loop will have a value of true instead of false, breaking the for loop to find another unique random number. But if it doesn't exists, it will be added to the array. The console.log afterwards will then log the *uniqueNumbers* array containing the 10 unique random numbers.


### Task 4: Triangle Checker

- **T-Diagram**:

    |      Variables       |                      Values                         |
    | :------------------: | --------------------------------------------------- |
    | sideA                | 7                                                   |
    | sideB                | 10                                                  |
    | sideC                | 5                                                   |


- **Expected Output**: 
    ```bash
    The sides 7, 10, and 5 form a valid triangle.

- **Explanation**: There are 3 variables containing integers to define the sides of the triangles in length (sideA, sideB and sideC). An if else statement was then used to check if the sides really form a valid triangle. The comparison used in if statement is (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB), in which if its true will log "The sides 7, 10, and 5 form a valid triangle." and if it's not, the else statement will be done which will log "The sides 7, 10, and 5 do not form a valid triangle.". Based on the comparison, it would look like this (7 + 10 > 5 && 10 + 5 > 7 && 7 + 5 > 10) => (17 > 5 && 15 > 7 && 12 > 10), which is true so it will be the if statement output of console.log().


## Reflection
It took me some time to accomplish this activity for thinking over how it outputs line by line, especially on th Task 2. Writing the T-diagram down with the explanation took most of the time as I tried to explain it step by step, aside from the time I took in adding comments and in fixing spacing in .js file.

### Time Taken
3 hours 
