/* select the character helmet */
let characterHelmet = document.getElementById("character_helmet");

/* select the character armor */
let characterArmor = document.getElementById("character_armor");

/* select the character leggings */
let characterLeggings = document.getElementById("character_leggings");

/* select the character boots */
let characterBoots = document.getElementById("character_boots");

/* select all selectable helmets */
let helmets = document.querySelectorAll(".helmets");

/* select all selectable armors */
let armors = document.querySelectorAll(".armors");

/* select all selectable leggings */
let leggings = document.querySelectorAll(".leggings");

/* select all selectable boots */
let boots = document.querySelectorAll(".boots");

/* select confirm button for creating character */
let confirmButton = document.getElementById("create");

/* Apply event listener to each helmet */
helmets.forEach(helmet => {
    helmet.addEventListener("click", function() {
        var selected_helmet = this.getAttribute("data-helmet");
        characterHelmet.setAttribute("src", selected_helmet);
    });
});

/* Apply event listener to each armor */
armors.forEach(armor => {
    armor.addEventListener("click", function() {
        var selected_armor = this.getAttribute("data-armor");
        characterArmor.setAttribute("src", selected_armor);
    });
});

/* Apply event listener to each legging */
leggings.forEach(legging => {
    legging.addEventListener("click", function() {
        var selected_leggings = this.getAttribute("data-leggings");
        characterLeggings.setAttribute("src", selected_leggings);
    });
});

/* Apply event listener to each boot */
boots.forEach(boot => {
    boot.addEventListener("click", function() {
        var selected_boots = this.getAttribute("data-boots");
        characterBoots.setAttribute("src", selected_boots);
    });
});

/* Apply event listener to confirm button */
confirmButton.addEventListener("click", function() {

    /* through this function, using replace keyword, the resources/, .png and underscores will be removed 
    in the string of src, replacing it as "" (no space) if its .png and /resources and replacing it as " " 
    (1 space) if its a _ (underscore)*/
    function formatItemName(src) {
        return src.replace(/^resources\/|\.png$/g, "").replace(/_/g, " ");
    }

    /* Show an alert message upon clicking the confirm button, in which it will notify the user that the character
    is created and the character build (names of helmet, armor, leggings & boots) will also be displayed */
    alert(
        "Character created." +
        "\nYour helmet is: " + formatItemName(characterHelmet.getAttribute("src")) +
        "\nYour armor is: " + formatItemName(characterArmor.getAttribute("src")) +
        "\nYour leggings is: " + formatItemName(characterLeggings.getAttribute("src")) +
        "\nYour boots is: " + formatItemName(characterBoots.getAttribute("src"))
    );

    /* change var header text content to character created */
    var header = document.getElementsByTagName("h1")[0];
    header.textContent = "Character Created.";

    /* remove the sections for selecting armors, their instruction and the confirm button in the body to show 
    "locking in" to the created character*/
    var body = document.getElementsByTagName("body")[0];
    var instruction = document.getElementsByTagName("h3");
    var helmetSelection = document.getElementById("helmet_list");
    var armorSelection = document.getElementById("armor_list");
    var leggingsSelection = document.getElementById("leggings_list");
    var bootsSelection = document.getElementById("boots_list");

    for (counter = 0; counter < 4; counter++){
        body.removeChild(instruction[0]);
    }
    
    body.removeChild(helmetSelection);
    body.removeChild(armorSelection);
    body.removeChild(leggingsSelection);
    body.removeChild(bootsSelection);
    body.removeChild(confirmButton);
});
