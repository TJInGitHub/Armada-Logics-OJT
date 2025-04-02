// Task 1: Calculate the Total Cost of Items
let item1 = 12;
let item2 = 13;
let item3 = 20;
totalCost = item1 + item2 + item3;

console.log("The total cost of items is: $",totalCost);

// Task 2: Calculate the Average of Three Numbers
let num1 = 12;
let num2 = 8;
let num3 = 2;
average = (num1 + num2 + num3)/3;

console.log("The average is:",average);

// Task 3: Odd or Even Checker
num = 2;
remainder = num % 2;

if (remainder == 0) {
    console.log(num,"is an even number");
} else {
    console.log(num,"is an odd number");
}

// Task 4: Calculate Discounts
price = 100;
discount = 20;
discount_amount = (price * discount) / 100;
discounted_price = price - discount_amount

console.log("The discounted price is: $",discounted_price);

//Bonus Task (Optional): Reverse Percentage Calculation
finalPrice = 80;
discount = 20;
originalPrice = finalPrice / (1 - discount / 100);

console.log("The original price before the discount was: $", originalPrice);