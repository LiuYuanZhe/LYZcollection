// <script src='a.js'></script>
// <script src='b.js'></script>
// <script src='c.js'></script>

// var i = 0;
// while(true){
// 	i++;
// }

var c = 0;

function printIn () {
	// body...
	console.log(c);
}
function plus (callback) {
	// body...
	setTimeout(function(){
		c += 1;
		callback();
	},1000);
}

plus(printIn)