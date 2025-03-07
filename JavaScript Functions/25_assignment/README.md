# Created by: **Timothy Jher G. Eusebio**
## T-Diagram, Predicted Output, Real Output, Explanation and Reflection for JS Function Challenge I

This .md file will provide you my T-diagram, predicted output, real output and explanations for the given code in each given tasks/challenges, including my reflection regarding this assignment. 

## Challenges
### Challenge 1

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | numbers          | [1, 2, 3, 4]                                        |
    | arr              | numbers                                             |
    | sum              | 0                                                   |
    | i                | 0                                                   |
    | arr.length       | 4                                                   |

- **Predicted Output**:
    ```bash
    Sum: 10

- **Real Output**:
    ```bash
    Sum: 10

- **Explanation**: Skipped the function first as it is yet to be called. Created an array containing 3 integer elements named *numbers*. Call the function in console.log which is named *calculateSum(arr)*, in which *arr* is the parameter and received the *numbers* as the value to be used in the function as *arr*. Inside the function, declare variable *sum* to contain the sum of the numbers in *arr*. Then, do a for loop while variable *i* (equal to 0) is less than arr.length (which is 4, as the *numbers* arrays is used as *arr*), incrementing until it reach the said limit to add *arr[i]* (the integer element with the said index value based on variable *i* ) to sum in every loop, returning the sum after the loop as the output to console.log(). 


### Challenge 2

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | num              | 4, 7 and 0                                          |

- **Predicted Output**:
    ```bash
    true
    false
    true

- **Real Output**:
    ```bash
    true
    false
    true

- **Explanation**: Skipped the function for the meantime. Created 3 console.log() that call the function *isEven(num)* that have *num* as its parameter. The function received the number sent by console.log() as the value to be used in the function as *num*. In the function, an if statement is inside in which it will return true if the remainder of *num* is 0 upon dividing to 2, and an else statement that will return false if the remainder is not 0. The function will be called 3 times by the console.log() (because there are 3 of it) to give the output to their respective number provided to the parameter of the function, thus generating the output as shown above.


### Challenge 3

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | friends          | ["Alice", "Bob", "Charlie"]                         |
    | names            | friends                                             |
    | name             | names[i]                                            |


- **Predicted Output**: 
    ```bash
    Hello, Alice!
    Hello, Bob!
    Hello, Charlie!

- **Real Output**: 
    ```bash
    Hello, Alice!
    Hello, Bob!
    Hello, Charlie!

- **Explanation**: Again, skipped the function if it's not being called yet. Created an array named *friends* that contains 3 string elements referring to a name of a person. Call the function named *personalizedGreeting(names)* with *names* as its parameter and give friends as the value to be used in the function as *names*. Inside the function, there is a for loop that loops if variable *i* (equals to 0) is less than *names.length* (which is 3, based on *friends* array), incrementing until it reach the limit set. This for loop has a console.log that called another function named *greet(name)* with a parameter *name* and given *names[i]* (the string element in the *friends array* with an index value of variable *i*, that is treated as names in the function) to be used in this function as *name*. This second function will return "Hello," + *name* + "!" in which *name* is the string element in the array *friends* sent by the console.log() in *personalizedGreeting(names)* treated as *names[i]*. It will then be logged by the console.log() in *personalizedGreeting(names)*, repeating until all string elements have gone through the 2 functions,  as shown in the output.


### Challenge 4

- **T-Diagram**:

    |      Variables       |                      Values                         |
    | :------------------: | --------------------------------------------------- |
    | originalArray        | [10, 20, 30]                                        |
    | arr                  | originalArray                                       |
    | reversed             | [] (empty array)                                    |
    | i                    | arr.length - 1 (or 3 - 1)                           |
    
- **Predicted Output**: 
    ```bash
    [ 30, 20, 10 ]
    [ 10, 20, 30 ]

- **Real Output**: 
    ```bash
    [ 30, 20, 10 ]
    [ 10, 20, 30 ]

- **Explanation**: Skipped the function again until it's called. Created an array to hold 3 integer elements named *originalArray*. Called the function named *reverseArray(arr)* with *arr* as its parameter through console.log, in which it sent *originalArray* to be used as the value in the function which will be treated as *arr*. In the function, declare an empty array named *reversed* to store the integer elements in *originalArray" in a reversed order. Then, there's also a for loop that will loops as variable *i* (equals to *arr.length* - 1, or 2 based on the deducted length of *originalArray*) greater than or equal to 0, decremeting until it reached the set limit. This for loop will push *arr[i]* (the integer element with the index value of variable *i* in the *originalArray*) to the *reversed* array, until it push every elements up. After the for loop ends, it will return the *reversed* array, that will be logged by console.log() that called the function. The last console.log() will logged the *originalArray*, so there will be 2 outputs as shown above.


### Challenge 5

- **T-Diagram**:

    |      Variables       |                      Values                         |
    | :------------------: | --------------------------------------------------- |
    | matrix               | [ [1, 2], [3, 4] ];                                 |
    | i                    | 0                                                   |
    | matrix.length        | 2                                                   |
    | j                    | 0                                                   |
    | matrix[i].length     | 2                                                   |
    
- **Predicted Output**: 
    ```bash
    [ [2, 4], [6, 8] ] 

- **Real Output**: 
    ```bash
    [ [2, 4], [6, 8] ] 

- **Explanation**: Skipped the function for the mean time again. Start with the created array named *matrix* with two array elements inside containing 2 integer numbers. To call the function named *multiplyMatrix(matrix)*, console.log was used and sent *matrix* to be the value used in the function as *matrix* (parameter with the same name as array). There are 2 for loops, 1 outer and 1 inner. The outer for loops based on the *matrix* array's 2 array elements based on variable *i* (equals to 0) when its less than the *matrix.length* (the array's length which is equal to 2), incrementing until it reached the set limit. The inner for loop will loop based on the elements of the 2 arrays inside the *matrix* array by using variable *j* (equals to 0) as long as its less than the inside arrays length (*matrix[i].length*) in *matrix* array, also incremeting until it also reached the set limit. The inner for loop will multiply by 2 the integer elements of arrays in *matrix* array (*matrix[i][j]*), until all integer elements are multiplied by 2. After the 2 for loops are done, it will return the *matrix* array, logging it by the console.log() that calls the function leading to the output above.


## Reflection
The activity is not that hard as I'm able to predict the output correctly. What took me long is writing this .md file.

### Time Taken
Around 2 hours