function Pet (words) {
	// body...
	this.words = words;
	this.speak = function(){
		console.log(this.words);
	}
}
function Dog (words) {
	// body...
	Pet.call(this,words);
	//Pet.apply(this,arguments);
}
var dog = new Dog('wang');
dog.speak();