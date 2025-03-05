//Task 1: Grading System
//Step 1: Create a variable named score and assign a value between 0 and 100.
console.log("Task 1: Grading System");

score = 59;

//Step 2: Write a conditional statement to assign a grade based on the score:
//        90–100: Grade A, 80–89: Grade B, 70–79: Grade C, 60–69: Grade D, Below 60: Grade F
//Step 3: Log the grade to the console.

if ((score >= 90) && (score <= 100)) {
    console.log("Grade A");
} else if ((score >= 80) && (score <= 89)) {
    console.log("Grade B");
} else if ((score >= 70) && (score <= 79)) {
    console.log("Grade C");
} else if ((score >= 60) && (score <= 69)) {
    console.log("Grade D");
} else if (score < 60) {
    console.log("Grade F");
} else {
    console.log("Invalid Score");
}

//Task 2: Weather Advisor
//Step 1: Create a variable named temperature and assign it a value.
console.log("Task 2: Weather Advisor");

temperature = -1;

//Step 2: Write a conditional statement to display messages based on the temperature:
//        below 0, log: "It's freezing outside! Bundle up!"
//        between 0 and 15, log: "It's cold outside. Wear a jacket."
//        between 16 and 30, log: "The weather is nice. Enjoy your day!"
//        exceeds 30, log: "It's hot outside. Stay hydrated!"
if (temperature < 0) {
    console.log("It's freezing outside! Bundle up!");
} else if ((temperature >= 0) && (temperature <= 15)) {
    console.log("It's cold outside. Wear a jacket.");
} else if ((temperature >= 16) && (temperature <= 30)) {
    console.log("The weather is nice. Enjoy your day!");
} else if (temperature > 30) {
    console.log("It's hot outside. Stay hydrated!");
} else {
    console.log("Invalid temperature");
}

//Task 3: Eligibility Checker
//Step 1: Create a variable named age and assign it a value.
console.log("Task 3: Eligibility Checker");

age = 22;

//Step 2: Write a conditional statement to check the following eligibility:
//        If the age is below 13, log: "You are too young for this activity."
//        If the age is between 13 and 17, log: "You need parental permission."
//        If the age is 18 or older, log: "You are eligible for this activity."
if (age < 13) {
    console.log("You are too young for this activity.");
} else if ((age >= 13) && (age <= 17)) {
    console.log("You need parental permission.");
} else if (age >= 18) {
    console.log("You are eligible for this activity.");
} else {
    console.log("Invalid age");
}

//Task 4: Ticket Price Calculator
//Step 1: Create variables named age and isMember. 
//        (age should be a number and isMember should be a boolean (true or false)).
console.log("Task 4: Ticket Price Calculator")

age = 10;
isMember = false;

//Step 2: Write a conditional statement to determine ticket price:
//        If the age is under 12, the ticket is free.
//        If the age is 12 or older and isMember is true, the ticket costs $10.
//        If the age is 12 or older and isMember is false, the ticket costs $15.
//Step 3: Log the ticket price to the console.
if (age < 12) {
    console.log("Free ticket");
} else if ((age >= 12) && (isMember == true)) {
    console.log("Ticket costs $10");
} else if ((age >= 12) && (isMember == false)) {
    console.log("Ticket costs $15");
} else {
    console.log("Invalid age or membership value");
}

//Task 5: Challenge Task (Optional): Leap Year Checker
//Step 1: Create a function named isLeapYear that accepts a year as an argument.
//Step 2: Write a conditional statement to check if the year is a leap year:
//        A year is a leap year if:
//          It is divisible by 4 and not divisible by 100.
//          Or it is divisible by 400.
//Step 3: Return true if the year is a leap year, otherwise, return false.
console.log("Task 5: Challenge Task (Optional): Leap Year Checker")

function isLeapYear(year){
    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
        return true;
    } else {
        return false;
    }
}

//Step 4: Test the function with various years and log the results.
year = 2022;
console.log("Year",year,"is a leap year:",isLeapYear(year));