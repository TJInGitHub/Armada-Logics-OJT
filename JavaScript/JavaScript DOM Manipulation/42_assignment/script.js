// Select all servant cards
let servants = document.querySelectorAll(".servant_card");

/* Select the main servant image */
var servantImage = document.getElementById("servant_image");

/* Select Summoned Servant for adding the description about the servant later*/
var summonedServant = document.getElementById("summoned_servant")

/* Select Servant Name */
var servantName = document.getElementById("servant_name")

/* Create var mainImageSrc for storing the main servant's image for later */
var mainImageSrc;

/* Create var description as the section to add the servants description for later */
var description;

/* Create var quote to store the servant's quote for later to be added in description */
var quote;

/* Create var servantClass to store the servant's class for later to be added in description */
var servantClass;

/* Create var noblePhantasm to store the servant's noble phantasm (ultimate attack) name for later to be added in description */
var noblePhantasm;

// Store each servant card's original image src using .dataset keyword
servants.forEach(servant => {
    servant.dataset.originalSrc = servant.getAttribute("src");
});


// Apply event listener to each servant card
servants.forEach(servant => {
    servant.addEventListener("click", function() {

        // Revert all servant cards' image src to its original (back of card), so only the selected card will 
        // have its front shown
        servants.forEach(servant => {
            servant.src = servant.dataset.originalSrc;
        });

        /* Get the front card's image src */
        var frontCard = this.getAttribute("data-new-src");

        /* change the selected cards image to its front card image */
        this.src = frontCard;

        /* Below is an if-else-if statement that changes the contents of summoned servant container (the div tag
        with the same id), in which it based the following changes on the current select card (or the current 
        front card's image). This include the servant's name, image, quote, class and their noble phantasms 
        (ultimate skills) to be shown as their information that will be added to the said container. In this 
        if-else-if statement, there is one if-else statement within which handles the additions of the quote,
        class and noble phantasms of the current servant. It does this by creating an article tag to contain the
        following (which will also be created as a p tag), that will be added to the summoned servant container, 
        but if it's already created, then the contents of the following will just be changed (as they're already
        created */

        /* For Saber Servant Altria Pendragon */
        if (frontCard == "resources/Altria_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Altria Pendragon";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ This sword is the breath of the planet itself. The King of Knights has arrived. ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Saber";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Excalibur";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ This sword is the breath of the planet itself. The King of Knights has arrived. ”";
                servantClass.textContent = "Class: Saber";
                noblePhantasm.textContent = "Noble Phantasm: Excalibur";
            }
        
        /* For Archer Servant Gilgamesh */
        } else if (frontCard == "resources/Gilgamesh_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Gilgamesh";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ The Oldest King of Heroes, descends! ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Archer";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Enuma Elish";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ The Oldest King of Heroes, descends! ”";
                servantClass.textContent = "Class: Archer";
                noblePhantasm.textContent = "Noble Phantasm: Enuma Elish";
            }

        /* For Lancer Servant Enkidu */
        } else if (frontCard == "resources/Enkidu_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Enkidu";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ The Chain of the heavens. The one formed by the gods to be the sharpest spear and the strongest shield. ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Lancer";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Enuma Elish";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ The Chain of the heavens. The one formed by the gods to be the sharpest spear and the strongest shield. ”";
                servantClass.textContent = "Class: Lancer";
                noblePhantasm.textContent = "Noble Phantasm: Enuma Elish";
            }

        /* For Rider Servant Achilles */
        } else if (frontCard == "resources/Achilles_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Achilles";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ The great hero of the Trojan War. His life was as brief and fleeting as any human's. ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Rider";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Troias Tragōidia";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ The great hero of the Trojan War. His life was as brief and fleeting as any human's. ”";
                servantClass.textContent = "Class: Rider";
                noblePhantasm.textContent = "Noble Phantasm: Troias Tragōidia";
            }

        /* For Assassin Servant First Hassan */
        } else if (frontCard == "resources/First_Hassan_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "First Hassan";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ From the mountain abyss, the will of heaven rings out. The assassin of the boundary is crowned with death. ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Assassin";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Azrael";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ From the mountain abyss, the will of heaven rings out. The assassin of the boundary is crowned with death. ”";
                servantClass.textContent = "Class: Assassin";
                noblePhantasm.textContent = "Noble Phantasm: Azrael";
            }

        /* For Caster Servant Tamamo no Mae */
        } else if (frontCard == "resources/Tamamo_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Tamamo no Mae";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ Unparalleled Beauty, making her entrance! ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Caster";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Eightfold Blessing of Amaterasu";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ Unparalleled Beauty, making her entrance! ”";
                servantClass.textContent = "Class: Caster";
                noblePhantasm.textContent = "Noble Phantasm: Eightfold Blessing of Amaterasu";
            }

        /* For Berserker Servant Morgan */
        } else if (frontCard == "resources/Morgan_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Morgan";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ The iron-fisted High Queen who reigns over Faerie Britain, and a traitor to humanity who threatens Chaldea. ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Berserker";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Roadless Camelot";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ The iron-fisted High Queen who reigns over Faerie Britain, and a traitor to humanity who threatens Chaldea. ”";
                servantClass.textContent = "Class: Berserker";
                noblePhantasm.textContent = "Noble Phantasm: Roadless Camelot";
            }

        /* For Avenger Servant Nitocris Alter */
        } else if (frontCard == "resources/Nitocris_Alter_Card.jpg"){
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Nitocris Alter";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ An avenger who seeks no vengeance. The embodiment of judgment, this improbable Servant appears with an impossible Spirit Origin. ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Avenger";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Neferu Suen Anubis";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ An avenger who seeks no vengeance. The embodiment of judgment, this improbable Servant appears with an impossible Spirit Origin. ”";
                servantClass.textContent = "Class: Avenger";
                noblePhantasm.textContent = "Noble Phantasm: Neferu Suen Anubis";
            }
        
        /* For Pretender Servant Lady Avalon */
        } else {
            mainImageSrc = this.getAttribute("data-new-main-src");
            servantImage.src = mainImageSrc;
            servantName.textContent = "Lady Avalon";

            if (description == undefined) {
                description = document.createElement("article");
                description.style.width = "300px";
                description.style.display = "flex";
                description.style.flexDirection = "column";
                description.style.gap = "0.5rem";
                quote = document.createElement("p");
                quote.textContent = "“ Hey, nice to meet you. I came all the way from paradise! Me? As you can see, I'm your pretty big sister who watches over your journey with a smile! ”";
                quote.style.textAlign = "justify";
                servantClass = document.createElement("p");
                servantClass.textContent = "Class: Pretender";
                noblePhantasm = document.createElement("p");
                noblePhantasm.textContent = "Noble Phantasm: Winds of Avalon";
                description.appendChild(quote);
                description.appendChild(servantClass);
                description.appendChild(noblePhantasm);
                summonedServant.appendChild(description);
            } else {
                quote.textContent = "“ Hey, nice to meet you. I came all the way from paradise! Me? As you can see, I'm your pretty big sister who watches over your journey with a smile! ”";
                servantClass.textContent = "Class: Pretender";
                noblePhantasm.textContent = "Noble Phantasm: Winds of Avalon";
            }
        }
    });
});