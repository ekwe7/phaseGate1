
const prompt = require("prompt-sync")();
let atmCardNumber = prompt("Enter card details to be verified: ");

function validateCard(atmCardNumber ) {
const cardType = getCardType(atmCardNumber );
	if (cardType === "Invalid") {
	return "Invalid card type";
}

const isValid = cardCheck(atmCardNumber );
	if(isValid){
	return "valid " + cardType + "card";
	}else{
	return "invalid " +" " +"cardType";
	}
}


function getCardType(atmCardNumber ) {
let cardlength = atmCardNumber.length;

	if (cardlength === 16 && atmCardNumber.startsWith("4")) {
	return "Visa";
}else
	if (cardlength === 16 && atmCardNumber.startsWith("5")) {
	return "MasterCard";
	}else
	if (cardlength === 15 && atmCardNumber.startsWith("37")) {
	}else	
	if (cardlength === 16 && atmCardNumber.startsWith("6")) {
	return "Discover";
	}else


	return "Invalid";
}


function cardCheck(atmCardNumber ) {
let total = 0;
let doubleDigit = false;

for (let index = atmCardNumber .length - 1; index >= 0; index--) {

let digit = parseInt(atmCardNumber [index]);

if (doubleDigit) {
digit *= 2;
if (digit > 9) digit -= 9;
}

total += digit;
doubleDigit = !doubleDigit;
}

return total % 10 === 0;
}

console.log(validateCard(atmCardNumber));
