/* var container that takes gets the object with the tag name main for storing the notifications later */
var container = document.getElementsByTagName("main")[0];

/* var notification to contain the h3 element notification if its created */
var notification;

/* var transactionSection to contain a section element to contain the transaction header and the transactions */
var transactionSection;

/* Add withdrawal limit of 500, in which if withdrawal exceeds the amount or its equal to 0 won't allow the user to withdraw */
let withdrawalLimit = 500;

/* deposit(event) function to trigger when the deposit button experienced a click event */
function deposit(event){
    event.preventDefault();     //allow the output of this function to be displayed when clicked

    /* get the value of the html object with the ID of amount to be stored in var depositAmount */
    var depositAmount = document.getElementById("amount").value;

    /* if else statement to not update the balance when there are no deposit Amount inputs and include a log.
    If it does have a deposit amount, display the new balance and provide a log message */
    if(depositAmount == "") {
        console.log("Unable to deposit. Please enter a deposit amount first.")

        /* if else statement to create an h3 element for user notification if notification does not have an element
        it contain yet but if it does, change only the text content and color */
        if (notification == undefined) {
            notification = document.createElement("h3");        // create h3 element for user notif
            notification.textContent = "Invalid Deposit";      // display invalid deposit 
            notification.style.color = "red";                 // make the text color red
            notification.style.marginTop = "0.5rem";          // include a margin-top of 0.5rem
            container.appendChild(notification);              // add the newly created h3 notif to main tag
        } else {
            notification.textContent = "Invalid Deposit";      // display invalid deposit 
            notification.style.color = "red"; // make the text color red
        }
    } else {
        /* get the deposit amount as a float decimal value instead of string */
        depositAmount = parseFloat(depositAmount, 10);

        /* log the deposit amount */
        console.log("Deposit amount: $" + depositAmount)

        /* get the html element with the id of current_balance to be stored in var currentBalance*/
        var currentBalance = document.getElementById("current_balance");

        /* get the current balance as a float value in var balance instead of string by also removing $ sign*/
        balance = parseFloat(currentBalance.textContent.replace("$", ""), 10);

        /* log the current balance */
        console.log("Current balance: $" + balance)

        /* add the depositAmount to the balance to get the new balance */
        var newBalance = balance + depositAmount;

        /* put the new balance as the new text content of the currentBalance */
        currentBalance.innerText = "$" + newBalance;

        /* Log the new balance */
        console.log("New Balance: $" + newBalance);

        /* if else statement to create an h3 element for user notification if notification does not have an element
        it contain yet but if it does, change only the text content and color */
        if (notification == undefined) {
            notification = document.createElement("h3");        // create h3 element for user notif
            notification.textContent = "Successfully deposited $" + depositAmount;   // display successful deposit amount
            notification.style.color = "green";                 // make the text color green
            notification.style.marginTop = "0.5rem";          // include a margin-top of 0.5rem
            container.appendChild(notification);              // add the newly created h3 notif to main tag
        } else {
            notification.textContent = "Successfully deposited $" + depositAmount;        // display successful deposit amount
            notification.style.color = "green"; // make the text color green
        }

        /* create transactionSection and its content if its undefined, but if its not, only add the transacation
        contents */
        if (transactionSection == undefined) {
            transactionSection = document.createElement("section");
            container.appendChild(transactionSection);
            var transactionHeader = document.createElement("h3");
            transactionHeader.textContent = "Transaction History";
            transactionHeader.style.margin = "1rem 0rem 1rem"
            transactionSection.appendChild(transactionHeader);
            var transaction = document.createElement("p");
            transaction.textContent = "Deposit: $" + depositAmount;
            transaction.style.backgroundColor = "lightgray";
            transaction.style.textAlign = "left";
            transaction.style.padding = "0.25rem";
            transaction.style.width = "18rem";
            transaction.style.marginBottom = "0.25rem";
            transactionSection.appendChild(transaction);
        } else {
            var transaction = document.createElement("p");
            transaction.textContent = "Deposit: $" + depositAmount;
            transaction.style.backgroundColor = "lightgray";
            transaction.style.textAlign = "left";
            transaction.style.padding = "0.25rem";
            transaction.style.width = "18rem";
            transaction.style.marginBottom = "0.25rem";
            transactionSection.appendChild(transaction);
        }
    }
}

/* withdraw(event) function to trigger when the withdraw button experienced a click event */
function withdraw(event){
    event.preventDefault();     //allow the output of this function to be displayed when clicked

    /* get the value of the html object with the ID of amount to be stored in var withdrawAmount */
    var withdrawAmount = document.getElementById("amount").value;

    /* if else statement to not update the balance when there are no withdraw Amount inputs and include a log.
    If it does have a withdraw amount, there is another if else statement in which it will only log that the
    balance is insufficient for withdrawal if it really does, but if its sufficient allow withdrawal, decreasing 
    the balance */
    if(withdrawAmount == "") {
        console.log("Unable to withdraw. Please enter a withdraw amount first.")

        /* if else statement to create an h3 element for user notification if notification does not have an element
        it contain yet but if it does, change only the text content and color */
        if (notification == undefined) {
            notification = document.createElement("h3");        // create h3 element for user notif
            notification.textContent = "Invalid Withdrawal";      // display invalid withdrawal 
            notification.style.color = "red";                 // make the text color red
            notification.style.marginTop = "0.5rem";          // include a margin-top of 0.5rem
            container.appendChild(notification);              // add the newly created h3 notif to main tag
        } else {
            notification.textContent = "Invalid Withdrawal";      // display invalid withdrawal 
            notification.style.color = "red"; // make the text color red
        }
    } else {
        /* if else statement to allow withdrawal if daily withdrawal was not reached but if it does, display a
        notification */
        if (withdrawalLimit == 0) {
            /* if else statement to create an h3 element for user notification if notification does not have an element
            it contain yet but if it does, change only the text content and color */
            if (notification == undefined) {
                notification = document.createElement("h3");        // create h3 element for user notif
                notification.textContent = "Daily withdrawal limit reached!";      // display daily withdrawal limit reached
                notification.style.color = "red";                 // make the text color red
                notification.style.marginTop = "0.5rem";          // include a margin-top of 0.5rem
                container.appendChild(notification);              // add the newly created h3 notif to main tag
            } else {
                notification.textContent = "Daily withdrawal limit reached!";      // display daily withdrawal limit reached 
                notification.style.color = "red"; // make the text color red
            }
            console.log("Daily withdrawal limit reached!");
        } else {
            /* get the withdraw amount as a float decimal value instead of string */
            withdrawAmount = parseFloat(withdrawAmount, 10);

            /* log the withdraw amount */
            console.log("Withdraw amount: $" + withdrawAmount)

            /* another if else statement to prevent user for withdrawing that exceeds the withdrawal limit
            providing notification, but if its not, allow withdrawal */
            if (withdrawAmount > withdrawalLimit){
                /* if else statement to create an h3 element for user notification if notification does not have an element
                it contain yet but if it does, change only the text content and color */
                if (notification == undefined) {
                    notification = document.createElement("h3");        // create h3 element for user notif
                    notification.textContent = "Withdrawal can't exceed the daily limit of 500. Remaining Limit: " + withdrawalLimit;      // display can't exceed withdrawal limit and the remaining limit
                    notification.style.color = "red";                 // make the text color red
                    notification.style.marginTop = "0.5rem";          // include a margin-top of 0.5rem
                    container.appendChild(notification);              // add the newly created h3 notif to main tag
                } else {
                    notification.textContent = "Withdrawal can't exceed the daily limit of 500. Remaining Limit: $" + withdrawalLimit;      // display can't exceed withdrawal limit and the remaining limit
                    notification.style.color = "red"; // make the text color red
                }
                console.log("Withdrawal can't exceed the daily limit of 500. Remaining Limit: $" + withdrawalLimit);
            } else {
                /* get the html element with the id of current_balance to be stored in var currentBalance*/
                var currentBalance = document.getElementById("current_balance");

                /* get the current balance as a float value in var balance instead of string by also removing $ sign*/
                balance = parseFloat(currentBalance.textContent.replace("$", ""), 10);

                /* log the current balance */
                console.log("Current balance: $" + balance)

                /* if else statement to log a message that balance is insufficient for withdrawal and if it's not
                allow withdrawal */
                if(withdrawAmount > balance) {
                    console.log("Current balance is insufficient for withdrawal.");

                    /* if else statement to create an h3 element for user notification if notification does not have an element
                    it contain yet but if it does, change only the text content and color */
                    if (notification == undefined) {
                        notification = document.createElement("h3");        // create h3 element for user notif
                        notification.textContent = "Invalid Withdrawal";      // display invalid withdrawal 
                        notification.style.color = "red";                 // make the text color red
                        container.appendChild(notification);              // add the newly created h3 notif to main tag
                    } else {
                        notification.textContent = "Invalid Withdrawal";      // display invalid withdrawal 
                        notification.style.color = "red"; // make the text color red
                    }
                } else {
                    /* add the depositAmount to the balance to get the new balance */
                    var newBalance = balance - withdrawAmount;

                    /* put the new balance as the new text content of the currentBalance */
                    currentBalance.innerText = "$" + newBalance;

                    /* Log the new balance */
                    console.log("New Balance: $" + newBalance);

                    /* if else statement to create an h3 element for user notification if notification does not have an element
                    it contain yet but if it does, change only the text content and color */
                    if (notification == undefined) {
                        notification = document.createElement("h3");        // create h3 element for user notif
                        notification.textContent = "Successfully withdrew $" + withdrawAmount;      // display successful withdraw amount
                        notification.style.color = "green";                 // make the text color green
                        notification.style.marginTop = "0.5rem";          // include a margin-top of 0.5rem
                        container.appendChild(notification);              // add the newly created h3 notif to main tag
                    } else {
                        notification.textContent = "Successfully withdrew $" + withdrawAmount;    // display successful withdraw amount
                        notification.style.color = "green"; // make the text color green
                    }

                    /* create transactionSection and its content if its undefined, but if its not, only add the transacation
                    contents */
                    if (transactionSection == undefined) {
                        transactionSection = document.createElement("section");
                        container.appendChild(transactionSection);
                        var transactionHeader = document.createElement("h3");
                        transactionHeader.textContent = "Transaction History";
                        transactionHeader.style.margin = "1rem 0rem 1rem"
                        transactionSection.appendChild(transactionHeader);
                        var transaction = document.createElement("p");
                        transaction.textContent = "Withdraw: $" + withdrawAmount;
                        transaction.style.backgroundColor = "lightgray";
                        transaction.style.textAlign = "left";
                        transaction.style.padding = "0.25rem";
                        transaction.style.width = "18rem";
                        transaction.style.marginBottom = "0.25rem";
                        transactionSection.appendChild(transaction);
                    } else {
                        var transaction = document.createElement("p");
                        transaction.textContent = "Withdraw: $" + withdrawAmount;
                        transaction.style.backgroundColor = "lightgray";
                        transaction.style.textAlign = "left";
                        transaction.style.padding = "0.25rem";
                        transaction.style.width = "18rem";
                        transaction.style.marginBottom = "0.25rem";
                        transactionSection.appendChild(transaction);
                    }

                    /* deduct the withdraw amount to daily withdrawal limit */
                    withdrawalLimit -= withdrawAmount;
                }
            }
        }
    }
}

/* get the HTML element buttons for withdraw and deposit to be used for DOM manipulation  */
var depositButton = document.getElementById("deposit");
var withdrawButton = document.getElementById("withdraw");

/* add an event listener to deposit button to trigger the deposit function upon clicking */
depositButton.addEventListener("click", deposit);

/* add an event listener to withdraw button to trigger the withdraw function upon clicking */
withdrawButton.addEventListener("click", withdraw);