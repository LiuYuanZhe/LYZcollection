var EventEmitter = require('events').EventEmitter;//事件监听

var life = new EventEmitter();

life.setMaxListeners(11);//最大数量，长度
//addEventListener

life.on('lyz', function(who) {
	// body...
	console.log('give' + who + 'water');
});

life.on('lyz', function(who) {
	// body...
	console.log('give' + who + 'cook');
});

life.on('lyz', function(who) {
	// body...
	console.log('give' + who + 'toilet');
});

//remove

function washing (who) {
	// body...
	console.log('give' + who + 'washing');
}

life.on('lyz', washing);

life.on('lll', function(who) {
	// body...
	console.log('give' + who + 'shopping');
});

life.removeListener('lyz',washing);

// life.removeAllListeners();
life.removeAllListeners('lyz');

var hascomfortListener = life.emit('lll','wangfei')
var hasLoveListener = life.emit('lyz','liuyuanzhe');

console.log(hascomfortListener);
console.log(hasLoveListener);

console.log(life.listeners('lyz'));
console.log(life.listeners('lyz').length);

console.log(EventEmitter.listenerCount(life,'lyz'));
