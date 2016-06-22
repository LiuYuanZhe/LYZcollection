function learn (something) {
	// body...
	console.log(something);
}

function we(callback,something){
	something += ' is cool';
	callback(something);
}
we(learn,'Nodejs');

we(function(something){
	console.log(something)
},'jade');

//同步，顺序执行任务，下一个任务必须等到现在的任务执行完毕才能执行
//任务的执行顺序与排列顺序是一致的
//异步：后一个任务不需要先执行完前一个任务，有多个回调函数
//