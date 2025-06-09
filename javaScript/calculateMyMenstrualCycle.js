
const prompt = require("prompt-sync")();

console.log("\n=== WELCOME TO MY MENSTRUAL CYCLE APP CALCULATOR ===");
console.log("\n ")

function showMenstrualCycles( myCycleLength, myLastPeriodDate, numberOfCycles) {
let lastPeriodDate = new Date(myLastPeriodDate);
//let month = 31;

for (let index = 1; index <= numberOfCycles; index++) {
let nextCycleDate = new Date(myLastPeriodDate);
nextCycleDate.setDate(nextCycleDate.getDate() + (myCycleLength * index));

// FORMAT DATE TO DD/MM/YYYY
let formattedDate = formatDate(nextCycleDate );
console.log("Your Next Cycle is :" + formattedDate);
    }
}

function formatDate(date) {

let day = date.getDate().toString();
let year = date.getFullYear();
let month = (date.getMonth() + 1).toString();
[day, month, year] = lastPeriod.split("/").map(Number);

return day + "/" + month + "/" + year ;
}

// COLLECT INPUT FROM USER
let lastPeriod = prompt("Enter the date of your cycle(dd/MM/yyyy): ")
let cycleLength = prompt("How may days do your cycle last: ")
let numberOfCycles = prompt("Enter number of cycles you want to check: ")

showMenstrualCycles(lastPeriod, cycleLength, numberOfCycles);



