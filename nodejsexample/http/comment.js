var http = require('http');//引入http模块，
var querystring = require('querystring');

var postData = querystring.stringify({
	'content':'hiahia,我是test一下,求不要封我',
	'cid':348
});

var options = {
	hostname:'www.imooc.com',
	port:80,
	path:'/course/docomment',
	method:'POST',
	headers:{
		'Accept':'application/json, text/javascript, */*; q=0.01',
		'Accept-Encoding':'gzip, deflate', 
		'Accept-Language':'zh-CN,zh;q=0.8,en;q=0.6,zh-TW;q=0.4',
		'Connection':'keep-alive',
		'Content-Length':postData.length,
		'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8',
		'Cookie':'imooc_uuid=b474a253-e9ef-44b3-8cf1-22077ed68f79; imooc_isnew_ct=1466383445; loginstate=1; apsid=I2YjVkMjAzMzk5NGU3ZWViZGVlZTNiYjg0MTM2Y2UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMjc3MjM1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADY3NDJkZDZkMmJjNTJhZGNhYjk3NmU5ZGM5NTg1ZGM1djxnV3Y8Z1c%3DMD; PHPSESSID=5rh4mk4jmfple5gurp9kuuhup6; jwplayer.volume=51; imooc_isnew=2; cvde=5768bc9a3b033-39; Hm_lvt_f0cfcccd7b1393990c78efdeebff3968=1466335500,1466383446,1466404682,1466481817; Hm_lpvt_f0cfcccd7b1393990c78efdeebff3968=1466489747; IMCDNS=0',
		'Host':'www.imooc.com',
		'Origin':'http://www.imooc.com',
		'Referer':'http://www.imooc.com/comment/637',
		'User-Agent':'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36',
		'X-Requested-With':'XMLHttpRequest'
	}
}

var req = http.request(options,function(res) {
	// body...
	console.log('Status:'+res.statusCode);
	console.log('headers:'+JSON.stringify(res.headers));

	res.on('data',function (chunk) {
		// body...
		console.log(Buffer.isBuffer(chunk));
		console.log(typeof chunk);
	})

	res.on('end',function () {
		// body...
		console.log('评论完毕!');
	})
	
})

req.on('error',function () {
		// body...
		console.log('Error'+e.message);
	})

req.write(postData);

req.end();