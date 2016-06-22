// var pet = {
// 	words:'...',
// 	speak:function() {
// 		// body...
// 		console.log(this.words);
// 		console.log(this ===pet);
// 	}
// }
// pet.speak();

// function pet (words) {
// 	// body...
// 	this.words = words;
// 	console.log(this.words);
// 	console.log(this === global);
// }
// pet('i am big');

function pet (words){
	this.words = words;
	this.speak = function  () {
		// body...
		console.log(this.words);
		console.log(this);
	}

}
var cat = new pet('miao');
cat.speak();
