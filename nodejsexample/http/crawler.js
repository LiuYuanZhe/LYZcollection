//要现在cmd中安装 npm install cheerio
var http = require('http');
var cheerio = require('cheerio');//抓取模块
var url = 'http://www.imooc.com/learn/348';//要抓取的连接

function filterChapters (html) {
	// body...

	var $ = cheerio.load(html);
	var chapters = $('.chapter');
	// [{
	// 	chapterTitle:'',
	// 	videos:[
	// 		title:'',
	// 		id:''
	// 	]
	// }]
	var courseData =[];//建立数组存储
	// console.log('run reality');
	chapters.each(function (index,item) {
		console.log('run reality');
		// body...
		var chapter = $(this);
		var chapterTitle = chapter.find('strong').text();//查找标题，在strong标签中
		var videos = chapter.find('.video').children('li');//找在video下子元素li下的videos文本
		var chapterData = {
			chapterTitle:chapterTitle,
			videos:[]
		}
		videos.each(function (index,item) {
			// body...
			var video = $(this).find('.studyvideo');//获取video元素的
			var videoTitle = video.text();//将元素放入videos数组
			var id = video.attr('href').split('video/')[1];

			chapterData.videos.push({
				title:videoTitle,
				id:id
			})
		})
		console.log('videos:'+videos.length);
		courseData.push(chapterData);
	});
	return courseData;//返回数组
}

function printCourseInfo (courseData) {//打印
	// body...
	console.log(courseData.length);
	courseData.forEach(function (item) {
		// body...
		var chapterTitle = item.chapterTitle;
		console.log(chapterTitle+'\n');

		item.videos.forEach(function  (video) {
			// body...
			console.log('【' + video.id+' 】'+video.title + '\n');
		});
	});
}

http.get(url,function  (res) {
	// body...
	var html = '';
	res.on('data',function(data){
		html += data;	//获取网页全文
	})
	res.on('end',function(){
		// console.log('111');
		var courseData = filterChapters(html);
		printCourseInfo(courseData);
	});
}).on('error',function(){
	console.log('获取课程数据出错！');
});