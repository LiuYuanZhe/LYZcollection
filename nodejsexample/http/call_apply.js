var pet = {
	words:'...',
	speak:function  (say) {
		// body...
		console.log(say+ ' '+ this.words);
	}
}
// pet.speak('speak');

var dog = {
	words : 'wang'
}
pet.speak.call(dog,'speak');