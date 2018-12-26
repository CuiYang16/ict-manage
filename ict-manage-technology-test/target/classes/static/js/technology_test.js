$(document).ready(function() {

	//showAndHide();
	$('.next-topic').eq(-1).html('提交试卷');
	$('.next-topic').eq(-1).addClass('submit-question');
	$('.previous-topic').eq(0).attr("disabled", true);

	$('.topic-detail:not(:first)').css({
		display: 'none'
	});
	//下一题
	$('.next-topic').click(function() {

		if ($(this).is($('.next-topic').eq(-1))) {
			$('.next-topic').eq(-1).html('提交试卷');
		} else {
			$(this).parent().parent().hide();
			$(this).parent().parent().next().show();
			$(this).attr("disabled", false);
			$(this).prev().attr("disabled", false);
		}
	});
	//上一题
	$('.previous-topic').click(function() {

		if ($(this).is($('.previous-topic').eq(1))) {
			$('.previous-topic').eq(0).attr("disabled", true);
		}
		if ($(this).is($('.previous-topic').eq(0))) {
			$('.previous-topic').eq(0).attr("disabled", true);
		} else {
			$(this).parent().parent().hide();
			$(this).parent().parent().prev().show();
			$(this).attr("disabled", false);
			$(this).next().attr("disabled", false);
		}
	});
	//答题卡点击
	$('.topic-span').click(function() {
		$(".topic-detail:visible").hide();
		if ($('.next-topic').eq(-1) && $('.next-topic').parent().parent().is(':hidden')) {
			$('.next-topic').eq(-1).html('提交试卷');
			$('.next-topic').eq(-1).addClass('submit-question');
		}
		if ($(this).is('.one')) {
			$('#technologyone' + ($(this).index())).show();
		}
		if ($(this).is('.much')) {
			$('#technologymuch' + ($(this).index() - $('.one').length - 1)).show();
		}
		if ($(this).is('.judge')) {
			$('#technologyjudge' + ($(this).index() - $('.one').length - $('.judge').length - 2)).show();

		}
	});
	//标记
	$('button.sign').toggle(function() {
			$(this).html('取消标记');
			$('span.' + $(this).attr('id') + '').addClass('span-sign');
		},
		function() {
			$(this).html('标记');
			$('span.' + $(this).attr('id') + '').removeClass('span-sign');
		}
	);


	//提交试卷
	var oneSubmit = [];
	var muchSubmit = [];
	var checkedVal = '';
	var judgeSubmit = [];
	
	$('.submit-question').click(function() {

		for (var i = 0; i < $('.one-answer').children('input[type="hidden"]').length; i++) {
			oneSubmit.push(new ExamSubmitDetail($('.one-answer').children('input[type="hidden"]').eq(i).val(), $(
				'.one-answer').eq(i).children('input[type="radio"]:checked').val()));
		}
		for (i = 0; i < $('.much-answer').children('input[type="hidden"]').length; i++) {
			$('.much-answer').eq(i).children('input[type="checkbox"]:checked').each(function(j) {
				console.log($(this).val());
				if(j == 0){
					checkedVal += $(this).val();
				}else{
					checkedVal+=(','+$(this).val());
				}
				

			});
			muchSubmit.push(new ExamSubmitDetail($('.much-answer').children('input[type="hidden"]').eq(i).val(),checkedVal));
			checkedVal = '';
		}
	
		for(i=0;i<$('.judge-answer').children('input[type="hidden"]').length;i++){
			console.log($(
			'.judge-answer').eq(i).children('input[type="radio"]:checked').val());
			judgeSubmit.push(new ExamSubmitDetail($('.judge-answer').children('input[type="hidden"]').eq(i).val(), $(
			'.judge-answer').eq(i).children('input[type="radio"]:checked').val()));
		}
		
		/*userSubmitDetail.push(muchSubmit);
		userSubmitDetail.push(judgeSubmit);*/
		//console.log(examSubmit(new userSubmitDetail(oneSubmit,muchSubmit,judgeSubmit)));
		$.ajax({
			url:'/ictmanagetechnologytest/tectest/getGrade',
			type:'post',
			data:{"userSubmitDetail":JSON.stringify(new userSubmitDetail(oneSubmit,muchSubmit,judgeSubmit))},
			dataType:'json',
			async: false,
			success:function(result){
				console.log(result);
			},
			error:function(){
			
		}
		});
		//examSubmit(new userSubmitDetail(oneSubmit,muchSubmit,judgeSubmit));
	});
});


//toggle事件
$.fn.toggle = function(fn, fn2) {
	var args = arguments,
		guid = fn.guid || $.guid++,
		i = 0,
		toggle = function(event) {
			var lastToggle = ($._data(this, "lastToggle" + fn.guid) || 0) % i;
			$._data(this, "lastToggle" + fn.guid, lastToggle + 1);
			event.preventDefault();
			return args[lastToggle].apply(this, arguments) || false;
		};
	toggle.guid = guid;
	while (i < args.length) {
		args[i++].guid = guid;
	}
	return this.click(toggle);
};


//考试信息对象
var ExamSubmitDetail = function(questionId, userAnswer) {
	this.questionId = questionId;
	this.userAnswer = userAnswer;
}

//用户提交信息对象
var userSubmitDetail = function(oneSubmit,muchSubmit,judgeSubmit){
	this.oneSubmit=oneSubmit;
	this.muchSubmit=muchSubmit;
	this.judgeSubmit=judgeSubmit
	}

function examSubmit(detail){
	$.ajax({
		url:'/ictmanagetechnologytest/tectest/getGrade',
		type:'post',
		data:{userSubmitDetail:detail},
		dataType:'json',
		success:function(result){
			return result;
		},
		error:function(){
		
	}
	});
}
