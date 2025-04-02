/* Task 1: Create an object called character with following properties: name (default value "Hero") & 
health (default value 100) */

let character = {
    name: "Hero",
    health: 100,
    /* Task 2: property called class that is also a function to randomly chose character job/class from: 
    "Warrior", "Mage", "Archer", "Healer", "Assassin". */
    class() {
        // Array to contain the possible classes
        let classArray = ["Warrior", "Mage", "Archer", "Healer", "Assassin"];
        /* i variable to serve as the index in which value may range from 0 t0 4 through Math.floor rounding off 
        the output of Math.random() * classArray.length to the nearest integer, in which Math.random value is 
        obtained between 0 to 1 randomly, times the classArray length of 5*/
        let i = Math.floor(Math.random() * classArray.length); 
        return classArray[i]; // return the random possible class from the classArray based on i variable value
    },
    /* Task 4: property called specialAbility that is also a function to randomly chose character special abilities/skills
    from: "Fireball", "Healing Touch", "Stealth", "Lightning Strike", "Power Slash".*/
    specialAbility() {
        // Array to contain the possible special abilities
        let abilityArray = ["Fireball", "Healing Touch", "Stealth", "Lightning Strike", "Power Slash"];
        /* i variable to serve as the index in which value may range from 0 t0 4 through Math.floor rounding off 
        the output of Math.random() * abilityArray.length to the nearest integer, in which Math.random value is 
        obtained between 0 to 1 randomly, times the abilityArray length of 5*/
        let i = Math.floor(Math.random() * abilityArray.length); 
        return abilityArray[i]; // return the random possible special ability from the abilityArray based on i variable value
    }
};

/* Task 3: randomizeHealth() method to set the character’s health to a random number between 50 and 150 through
Math.floor and Math.random, returning the character health afterwards*/
character.randomizeHealth = function() {
    this.health =  Math.floor(Math.random() * 101 + 50); 
    return this.health;
}

/* randomizeHealth() method testing */
console.log("Test randomizeHealth()"); // Should log a random value between 50 and 150
character.randomizeHealth();
console.log(character.health); // Should log a random value between 50 and 150

/* Added function defaultName to choose a default name  from "Thorin", "Elara", "Zane", "Ivy", "Dante" for the 
character object, returning the default name*/
character.defaultName = function() {
    // Array that contains the default names to choose from
    let namesArray = ["Thorin", "Elara", "Zane", "Ivy", "Dante"];
    /* i variable to serve as the index in which value may range from 0 t0 4 through Math.floor rounding off 
    the output of Math.random() *namesArray.length to the nearest integer, in which Math.random value is 
    obtained between 0 to 1 randomly, times the namesArray length of 5*/
    let i = Math.floor(Math.random() * namesArray.length); 
    this.name = namesArray[i]; // let the new character name be a random default name from namesArray based on the value of i
    return this.name;
}

/* Task 6: battle(otherCharacter) method to make one character attacks another character, reducingthe opponent’s 
health by a random amount between 5 and 20, logging also a message */
character.battle = function(otherCharacter) {
    damage = Math.floor(Math.random() * 16 + 5);    // damage variable to contain damage value between 5 to 20
    initialHealth = otherCharacter.health;          // initialHealth variable to contain original health before being damage
    otherCharacter.health -= damage;                // reduce the opponent's health by damage
    console.log("Character " + this.name + " attacked Character " + otherCharacter.name + " with " + this.specialAbility + ". " + otherCharacter.name + "'s health dropped from " + initialHealth + " to " + otherCharacter.health + ".");
}


/* Task 5: Function generateCharacter() to create and return a new character object */
function generateCharacter(name) {
    /* create a new character object named newCharacter */
    let newCharacter = {
        /* ternary operator to use the name provided if its not undefined, but if it is, then call
        character.default name function to get a random default name*/
        name: name !== undefined ? name : character.defaultName(),  
        health: character.randomizeHealth(), // use character.randomizeHealth() function to get a random health
        class: character.class(),           // use character.class() function to get a random class
        specialAbility: character.specialAbility(),     // use character.specialAbility() function to get a random 
                                                        // special ability
        battle: character.battle,    // make battle as a function reference to battle(otherCharacter) method
                                     //through character.battle allowing battle method to be used
    };
    return newCharacter;        // return the newCharacter object created
}

/* Test generateCharacter() function */
console.log("Test generateCharacter()");  
const randomCharacter = generateCharacter();
console.dir(randomCharacter);  // Logs a character with random attributes

const namedCharacter = generateCharacter("Drake");
console.dir(namedCharacter);  // Logs a character named "Drake"

/* Test battle(otherCharacter) method */
console.log("Test battle(otherCharacter)");  
const character1 = generateCharacter("Zane");
const character2 = generateCharacter("Elara");

character1.battle(character2);
// Logs: "Character Zane attacked Character Elara with (specialAbility). Elara's health dropped from initialHealth to character2.health."

/* Task 7: Function generateMultipleCharacters(x) that returns an array of x characters. */
function generateMultipleCharacters(x){
    let party = [];          // empty array party to store the characters generated as party[i] (party elements)
    /* for loop to generate an x number of characters as the array party elements using index i to determine
    its position */
    for (let i = 0; i < x; i++) {
        party[i] = generateCharacter();
        /* another for let loop to determine if there are name similarities between each party array elements,
        using index i and j to be the position of party array elements to be compared through while loop. If they are both
        have the same name, the name of the party array element in the position of index i will have its name 
        changed  */
        for (let j = 0; j < i; j++) {  
            while (party[i].name === party[j].name) {
                party[i].name = character.defaultName();  // change the name by calling character.defaultName() 
                                                          // function, if the name is the same with party[j];
            }
        }
    }
    return party;
}

/* Test generateMultipleCharacters() function */
console.log("Test generateMultipleCharacters()");  
/* create a constant variable party to have an party array of 5 characters by calling generateMultipleCharacters(5) */
const party = generateMultipleCharacters(5);
console.dir(party);  

/* Test battle(otherCharacter) with party characters */
console.log("Test battle(otherCharacter) with party characters");  
/* Simulate a mockup battle between party member 1 and party member 2 through battle(otherCharacter) method */
party[0].battle(party[1]);