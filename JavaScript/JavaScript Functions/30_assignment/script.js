/* Total Number of Rounds declared as constant data type */
const totalRounds = 10;

/* 2 constant Warrior Objects (I enclosed it in array warrior) and both possess a function to calculate their attack power*/
warrior = [
    {
        name: "Thor", 
        hp: 100, 
        strength: 12,   
        attackPower() {
            return Math.floor(Math.random() * this.strength + 1);   // returns an attack power value of 1 up to strength
        }
    },

    {
        name: "Zeus",
        hp: 90, 
        strength: 15, 
        attackPower() {
            return Math.floor(Math.random() * this.strength + 1);   // returns an attack power value of 1 up to strength
        }
    }
];

/* Function to simulate attack with parameters attacker and defender. The attacker will inflict damage to the
defender based on the return value of attackPower() function, reducing the hp of defender. 
The attack and the result will then be logged */
function attack(attacker, defender){
    damage = attacker.attackPower();
    defender.hp -= damage;
    console.log(attacker.name + " attacks " + defender.name + " and does " + damage + " damage!" );
    console.log(attacker.name + " HP: " + attacker.hp + " | " + defender.name + " HP: " + defender.hp + "\n");
} 

let round = 1;    // round variable to be used to store the round number

/* while loop to simulate the battle, in which it will loop while round doesn't exceed the total Rounds, 
1st warrior hp didn't drop to 0 and 2nd warrior hp didn't drop to 0 */
while (round <= totalRounds && warrior[0].hp > 0 && warrior[1].hp > 0) {

    console.log("=== Round " + round + " ===");

    /* Let 1st warrior attacks 2nd warrior by calling the attack function assigning 1st warrior to be the
    attacker (by taking warrior[0] as the attacker parameter) and assigning 2nd warrior to be the defender 
    (by taking warrior[1] as the defender parameter) */
    attack(warrior[0], warrior[1]);

    /* If statement to stop the battle if 2nd warrior hp is less than or equal to 0 to break the loop afterwards */
    if (warrior[1].hp <= 0) {
        break;
    }

    /* Let 2nd warrior attacks 1st warrior by calling the attack function assigning 2nd warrior to be the
    attacker (by taking warrior[1] as the attacker parameter) and assigning 1st warrior to be the defender 
    (by taking warrior[0] as the defender parameter) */
    attack(warrior[1], warrior[0]);

    /* If statement to stop the battle if 1st warrior hp is less than or equal to 0 to break the loop afterwards */
    if (warrior[0].hp <= 0) {
        break;
    } 

    round++; /* increase round by 1 */
}

/* If-else-if statement to check who won the battle based on the warrior's hp if it's less than or equal to 0 or 
based on number of rounds if its greater than total rounds (as at the end of while loop, the round is greater by 
1), with another if-else-if statement to determine winner based on hp comparison (wherein the warrior with
greater hp wins and an else statement that will declare a draw if the other conditions is not satisfied)*/
if (warrior[0].hp <= 0) {
    console.log("🏆 " + warrior[1].name + " WINS the battle! 🏆");
} else if (warrior[1].hp <= 0) {
    console.log("🏆 " + warrior[0].name + " WINS the battle! 🏆");
} else if (round > totalRounds) {
    if (warrior[0].hp > warrior[1].hp) {
        console.log("🏆 " + warrior[0].name + " WINS the battle! 🏆");
    } else if (warrior[1].hp > warrior[0].hp) {
        console.log("🏆 " + warrior[1].name + " WINS the battle! 🏆");
    } else {
        console.log("It's a DRAW!");
    }
}