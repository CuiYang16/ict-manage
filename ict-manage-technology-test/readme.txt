$(document).ready(function() {
	$.ajax({
		url: '/ictmanagetechnologytest/tectest/gettestpaper?testType=1',
		type: 'post',
		dataType: 'JSON',
		data: {},
		async: false,
		success: function(result) {
			technologyOne = eval("(" + result.technologyOne + ")");
			technologyMuch = eval("(" + result.technologyMuch + ")");
			technologyJudge = eval("(" + result.technologyJudge + ")");
			oneShow(technologyOne);
		}
	});
	
 	$('.topic-detail:not(:first)').css({
		display:'none'
	}); 
});

function oneShow(technologyOne){
	var topicDiv = new StringBuffer();
	console.log(technologyOne.length);
	for(var i=0,j=technologyOne.length;i<j;i++){
		topicDiv.append('<div class="topic-detail technologyone'+i+'"><div class="topic-content">');
		topicDiv.append((i+1)+'.'+technologyOne[i].chooseOneDetail+'</div>');
		topicDiv.append('<div class="topic-answer"><input type="radio" name="oneanswer'+i+'">A:'+technologyOne[i].chooseOneAnswer1+'<br/>');
		topicDiv.append('<input type="radio" name="oneanswer'+i+'">B:'+technologyOne[i].chooseOneAnswer2+'<br/>');
		topicDiv.append('<input type="radio" name="oneanswer'+i+'">C:'+technologyOne[i].chooseOneAnswer3+'<br/>');
		topicDiv.append('<input type="radio" name="oneanswer'+i+'">D:'+technologyOne[i].chooseOneAnswer4);
		topicDiv.append('</div><div class="topic-choose"><button type="button" id="previous-topic">上一题</button><button type="button" id="next-topic">下一题</button></div>	</div>');
		
	}
	$('.topic-area').append(topicDiv.toString());
}

//StringBuffer
function StringBuffer() {
	this.__strings__ = [];
}

StringBuffer.prototype.append = function(str) {
	var reg = new RegExp('/(^\s*)|(\s*$)/', 'g');
	str = str.toString().replace(reg, '');
	this.__strings__.push(str);
};

StringBuffer.prototype.toString = function() {
	return this.__strings__.join("");
};
