

const prompt = require("prompt-sync")();

console.log("=== STUDENT SCORE SHEET ===");
console.log("\n");


function getNumber(type) {
  let number = prompt("Enter number of " + type + ": ");
  return parseInt(number); 
}


//COLLECT SUBJECT NAMES

function getSubjectNames(count){

let subjects = [];

for (let index = 0; index < count; index++) {

let name = prompt("Enter name of subject " + (index + 1) + ": ");
subjects.push(name);
}
	return subjects;
}



function getStudentData(studentCount, subjectNames){

let studentNames = [];
let scores = [];

for (let index = 0; index < studentCount; index++) {
let name = prompt("Enter name of student " + (index + 1) + ": ");
studentNames.push(name);

let studentScores = [];

for (let count = 0; count < subjectNames.length; count++) {
let score = prompt("Enter score for " + subjectNames[count] + ": ");
studentScores.push(parseInt(score));
	}

scores.push(studentScores);

}
console.log("\n");
console.log("=== MY STUDENTS SCORE SHEET ===");
console.log("\n");

  return studentNames, scores

}



function showResults(studentNames, subjectNames, scores){


let output = "Student Scores: ";

output += "StudentName\t";

for (let subject of subjectNames){
	output += subject + "\t";
}

	output += "Total \ tAverage";

for (let index = 0; index < studentNames; index++){

let name = studentNames[index];
let total = 0;
output += name + "\t";

for (let count = 0; count < subjectNames.length; count++){

let score = scores[index][count];
total += score;
output += score + "\t";
	}

let average = total / subjectNames.length;
output += total + "\t" + average;
	}

console.log(output);
}




  let studentCount = getNumber("students");
  let subjectCount = getNumber("subjects");

  let subjectNames = getSubjectNames(subjectCount);
  let studentData = getStudentData(studentCount, subjectNames);

  showResults(studentData.studentNames, subjectNames, studentData.scores);

