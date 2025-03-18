/* Number of Rounds */
rounds = 10;

/* 2 Warrior Objects (I enclosed it in array warrior) */
warrior = [{name: "Saber", hp: 100, strength: 10, attackPower:  return attack(this.strength);,},
    {name: "Berserker", hp: 100, strength: 15, attackPower:  attack(this.strength);,}
];

/* Function to calculate attack power */
function attack(strength){
    return Math.floor(Math.random() * strength);
}

console.log(warrior);