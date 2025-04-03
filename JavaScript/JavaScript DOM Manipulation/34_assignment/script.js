/* function addTask(event) that will add the task inputted when the Submit button was clicked */
function addTask(event){

    /* the event which is onclick event (or just the button click) will be used to execute the preventDefault()
    function, in order to prevent the submit button treating the submission as another link to be opened making
    the addTask(event) function work properly */
    event.preventDefault();
   
    /* variable addedTaskName to store the inputted task name value obtained from an element with an id of 
    task_name */
    var addedTaskName = document.getElementById("task_name").value;

    /* if-else statement in which if the value of task_name is not empty add the task and the remove button
    to be displayed in the browser, but if its empty, it will log that empty task can't be added*/
    if (addedTaskName !== ""){
        /* create an li element to serve as the container of the added task and close button */
        var taskContainer = document.createElement("li");

        /* get the ul element to where the taskContainer will be added */
        var list = document.getElementsByTagName("ul")[0];

        /* add the newly created taskContainer element to the ul */
        list.appendChild(taskContainer);

        /* create a p tag for the added task */
        var task = document.createElement("p");

        /* put the addedTaskName as the textcontent of added task p tag*/
        task.innerText = addedTaskName;

        /* create a remove button */
        var removeButton = document.createElement("button");

        /* Set the remove button text content */
        removeButton.innerText = "Remove";

        /* set an onclick attribute on the remove button, which will contain a function to remove the added task*/
        removeButton.onclick = function () {
            list.removeChild(taskContainer);
            console.log("Task removed: " + addedTaskName )
        };

        /* add the task and remove button on the newly created task container*/
        taskContainer.appendChild(task);
        taskContainer.appendChild(removeButton);
  
        console.log("Task added: " + addedTaskName);
    } else {
        console.log("Empty task can't be added");
    }
}
    
    
    