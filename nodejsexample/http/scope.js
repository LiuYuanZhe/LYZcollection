var globalVariable = 'this is global variable';

function globalFunction () {
	// body...
	var localVariable = 'this is local variable';

	console.log('Visit global/local Variable');
	console.log(globalVariable);
	console.log(localVariable);

	var globalVariable = 'this is changed variable';

	console.log(globalVariable);

	function localfunction () {
		// body...
		var innerLocalVariable = 'this is inner localVariable';
		console.log(globalVariable);
		console.log(localVariable);
		console.log(innerLocalVariable);
	}
	localfunction();
}

globalFunction();