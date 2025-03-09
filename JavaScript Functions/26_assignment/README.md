# Created by: **Timothy Jher G. Eusebio**
## T-Diagram, Predicted Output, Real Output, Explanation and Reflection for JS Function Challenge II

This .md file will provide you my T-diagram, predicted output, real output and explanations for the given code in each given tasks/challenges, including my reflection regarding this assignment. 

## Challenges
### Challenge 1

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | result           | "" (empty string)                                   |
    | i                | 1                                                   |
    | j                | 1                                                   |
    | result           | += j + " "                                          |
    | resullt          | += "\n"                                             |

- **Predicted Output**:
    ```bash
    1
    1 2
    1 2 3

- **Real Output**:
    ```bash
    1
    1 2
    1 2 3

- **Explanation**: Console.log will be the first to be read, which will call the function. In the function, a variable is declared with an empty string named *result*. Afterwards, there are 2 for loops in which the outer one used variable *i* and the inner one used variable *j*. The inner for loop will loop a number of times based on the outer for loops current number of loops. Inside the inner for loop, variable *result* will undergo an operation, that will add value of varible *j* plus a " " (for space) in every loop. When the inner for loop ends, a new line will be entered to result through "\n". When the outer for loop ends, it will return the *result*, which allows us to get the output.


### Challenge 2

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | numbers          | [10, 20, 30, 40]                                    |
    | arr              | numbers                                             |
    | first            | 10                                                  |
    | last             | 40                                                  |

- **Predicted Output**:
    ```bash
    [ 40, 20, 30, 10 ]
    [ 10, 20, 30, 40 ]

- **Real Output**:
    ```bash
    [ 40, 20, 30, 10 ]
    [ 40, 20, 30, 10 ]

- **Explanation**: The first line of code to be read is the declared array named *numbers*. The function will be called by the first console.log using the array as the value for the function through parameter *arr*. Inside, there were 2 variables, in which variable *first* used .shift command to remove the first element in array (10) and obtain its value, while *last* used .pop command to get the last element in the array (40) and obtain its value. The .unshift command will then be called to *last* variable, adding the last element (40) to the array as the first element and the .push command will then be called put the first element (10) in the array as the final element. Afterwards, the new arrangement in the array will be returned, which will be logged by the console.log() that called the function. Another console.log is next to the first console.log, which will output the same arranged array, in which I failed to predict its real output as I thought at first that the changes won't be carried over after the function was called.


### Challenge 3

- **T-Diagram**:

    |   Variables      |                       Values                        |
    | :--------------: | --------------------------------------------------- |
    | scores           | [85, 45, 90, 60]                                    |
    | grades           | scores                                              |
    | passing          | [] (empty array)                                    |
    | grade            | grades[i]                                           |


- **Predicted Output**: 
    ```bash
    [ 60, 45, 85, 90 ]

- **Real Output**: 
    ```bash
    [ 60, 45, 85, 90 ]

- **Explanation**: The declaration of array *scores* will be the first to be read. Then, console.log will call the function which will use scores as the value for its parameter grades. Inside, an empty array is declared named *passing* which will store the new arrangement of the elements of the *scores* (as *grades* in function) array. The *grade* will be called in *grades* for the for loop which refer to the elements inside the array. Inside the for loop there is an if statement that will put the grades at the last part of *passing* array if its greater than or equal to 70 through .push command, and an else statement will then put the element in first position in the array if it failed if its false or failed the set instruction. This will loop until all array elements are arranged in the *passing* array, returning the *passing* array afterwards as the output to be logged by the console.log that called the function.


### Challenge 4

- **T-Diagram**:

    |      Variables       |                          Values                            |
    | :------------------: | ---------------------------------------------------------- |
    | taskList             | [{ id: 1, completed: false }, { id: 2, completed: true }]  |
    | tasks                | taskList                                                   |
    | task                 | tasks[i]                                                   |
    | task.completed       | true and false (boolean)                                   |
    
- **Predicted Output**: 
    ```bash
    [ { id: 1, completed: true }, { id: 2, completed: false } ]  
    [ { id: 1, completed: true }, { id: 2, completed: false } ]  

- **Real Output**: 
    ```bash
    [ { id: 1, completed: true }, { id: 2, completed: false } ]  
    [ { id: 1, completed: true }, { id: 2, completed: false } ]  

- **Explanation**: The array creation will be read at first, which is named *taskList* which contain to objects as its array element. Through the first console.log, the function will be called receiveing the *taskList* array as the value for its parameter *tasks*. Inside the function, there's a for loop that loops based on *task* (the array element of *tasks* or *taskList*). This for loop will call a change in the object completed status, changing it to the opposite. It will be returned after the for loop which will be the output of the first console.log. The output will also be the same to the second console.log as the changes will reflect to the array.


### Challenge 5

- **T-Diagram**:

    |      Variables       |                      Values                         |
    | :------------------: | --------------------------------------------------- |
    | data                 | [5, 12, 8, 130, 44]                                 |
    | arr                  | data                                                |
    | target               | 12 (1st console.log) and 100 (2nd console.log)      |
    | i                    | 0                                                   |
    
- **Predicted Output**: 
    ```bash
    Found at index 1  
    Not found

- **Real Output**: 
    ```bash
    Found at index 1  
    Not found

- **Explanation**: Read the creation of array *data* first. The first console.log will call the function, receiving the *data* as its value for *arr* parameter and 12 for *target* parameter. Inside, there is a for loop, which loops if varible *i* (equals 0) is less than the length of array (5). Afterwards, there is an if statement that if the element with an index value base on *i* is equal to *target* (12), then it will return a string that the *target* value is found on the said index, and if not, an else statement will return a string indicating that its not found. Because it the *target* value is equal, it will return the former, being logged as output by he first console.log(). The second console.log() will also do the same upon calling the function, but it will use 100 as the *target* value. This will output the latter as the *target* was not found in the array


## Reflection
Made mistake in the second challenge as I didn't think that the result will carried over to the next console.log. Writing my explanation is the cause of me taking more time in the activity.

### Time Taken
2 hours