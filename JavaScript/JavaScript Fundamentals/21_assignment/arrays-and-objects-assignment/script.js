//Task 1: Create and Use an Object
//Step 1: Create an object named "book" with the following properties: 
//        title (string), author (string), pages (number) and isRead: (boolean)
console.log("Task 1: Create and Use an Object");

let book = {
    title: "Harry Potter and the Chamber of Secrets",
    author: "J. K. Rowling",
    pages: 251,
    isRead: false,
};

//Step 2: Access and print each property of the book object using:
//*dot notation
console.log("Using Dot Notation");
console.log("title:",book.title);
console.log("author:",book.author);
console.log("pages:",book.pages);
console.log("isRead:",book.isRead);

//*block notation
console.log("Using Block Notation");
console.log("title:",book["title"]);
console.log("author:",book["author"]);
console.log("pages:",book["pages"]);
console.log("isRead:",book["isRead"]);

//Step 3: Update the isRead property to true 
// and add a new property called genre with a value of your choice.
book.isRead = true;
book.genre = "fantasy";

//Step 4: Print the updated book object
console.log("Updated Book Object:");

for (let key in book) {
    console.log(key + ": " + book[key]);
}

//Task 2: Create and Modify an Array of Objects
//Step 1: Create an array named movies containing three objects with the 
//        following properties: title (string), director (string) & year (number)
console.log("Task 2: Create and Modify an Array of Objects");

movies = [{title: "Isekai Quartet: The Movie – Another World", director: "Minoru Ashina", year: 2022},
    {title: "Ready Player One", director: "Steven Spielberg", year: 2018},
    {title: "Resident Evil: Death Island", director: "Eiichiro Hasumi", year: 2023}];

//Step 2: Print the title of the second movie in the array.
console.log("The 2nd movie title is:",movies[1].title);

//Step 3: Add a new movie object to the end of the movies array.
movies.push({title: "Transformers: Dark of the Moon", director: "Michael Bay", year: 2011});

//Step 4: Update the year of the first movie to 2023.
movies[0].year = 2023;

//Step 5: Print the entire updated array.
console.log("Entire Updated Array:");

for (let i=0; i < 4; i++) {
    for (let key in movies[i]) {
        console.log(key + ": " + movies[i][key]);
    }
}

//Task 3: Combine Objects and Arrays
//Step 1: Create an object named student with the following properties:
//        name (string), age (number) & subjects (array): An array of three subjects (e.g., ['Math', 'Science', 'History'])
console.log("Task 3: Combine Objects and Arrays");

student = {
    name: "Timothy",
    age: 22,
    subjects: ["CPE Design 2", "On-the-Job Training", "Programming"],
};

//Step 2: Print the first subject in the subjects array.
console.log("The first subject in the array is:",student.subjects[0]);

//Step 3: Add a new subject to the subjects array.
student.subjects.push("Networking");

//Step 4: Print the updated student object.
console.log("Updated Student Object:");

for (let key in student) {
    console.log(key + ": " + student[key]);
}

//Task 4: Challenge Task (Optional)
//Step 1: Create an object named recipe with the following properties:
//        name (string), ingredients (array): An array of ingredient objects. 
//        Each object should have: (name (string), quantity (string) and
//        isVegetarian (boolean)
console.log("Task 4: Challenge Task (Optional)");

recipe = {
    name: "fried egg",
    ingredients: [{name: "egg", quantity: "1 piece"},
        {name: "cooking oil", quantity: "1-2 teaspoons"},
        {name: "salt", quantity: "1 pinch"}
    ],
    isVegetarian: false,
};

//Step 2: Add a new ingredient to the ingredients array.
recipe.ingredients.push({name: "pepper", quantity: "1 small pinch or a couple of grinds"});

//Step 3: Print the name of the second ingredient in the ingredients array.
console.log("The name of the second ingredient in the ingredient array is:", recipe.ingredients[1].name);

//Step 4: Print the entire recipe object.
console.log("Entire Recipe Object:");
console.log("name:",recipe.name);
console.log("ingredients:")
for (let i = 0; i < 4; i++) {
    for (let key in recipe.ingredients[i]) {
        console.log(key + ": " + recipe.ingredients[i][key]);
    }
}
console.log("isVegetarian:",recipe.isVegetarian);