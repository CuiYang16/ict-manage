
$('.exam-feature>li').eq(0).click(function(){
	test();
	$('.technology').hide();
	$('.psychological').show();
})
$('.exam-feature>li').eq(1).click(function(){
	test();
	$('.psychological').hide();
	$('.technology').show();
})

function test(){
	$('.exam-con').hide();
	$('.exam-explain').show();

}


// 答题页面
// 生成答题卡
var test = [{
	num1:0,
	title:"1.有人像老朋友似的向你打招呼，但你一点也记不起他（她）是谁，此时你会_____？",
	option1:"A.装作没听见似的不搭理1",
	option2:"A.装作没听见似的不搭理1",
	option3:"A.装作没听见似的不搭理1"
},
{
	num1:1,
	title:"2.有人像老朋友似的向你打招呼，但你一点也记不起他（她）是谁，此时你会_____？",
	option1:"A.装作没听见似的不搭理2",
	option2:"A.装作没听见似的不搭理2",
	option3:"A.装作没听见似的不搭理2"
},
{
	num1:2,
	title:"3.有人像老朋友似的向你打招呼，但你一点也记不起他（她）是谁，此时你会_____？",
	option1:"A.装作没听见似的不搭理3",
	option2:"A.装作没听见似的不搭理3",
	option3:"A.装作没听见似的不搭理3"
}]
function test1(a){
	$('.exam-question label').eq(0).html(test[a].num1);
	$('.exam-question label').eq(1).html(test[a].title);
	$('.exam-question label').eq(2).html(test[a].option1);
	$('.exam-question label').eq(3).html(test[a].option2);
	$('.exam-question label').eq(4).html(test[a].option3);
}
test1(0)
for (var i = 1;i<=test.length;i++) {
 	let tag = `<li>${i}</li>`;
 	$('.dart ol').append(tag);
 } 

// 倒计时

// 设置据当前时间开始，考试的结束时间
  var endtime = new Date(), endseconds = endtime.getTime() + 60 *60* 1000;
  var h = m = s = 0;
  var id = setInterval(seckill, 1000);
  function seckill() {
    var nowtime = new Date();    // 获取当前时间
    var remaining = parseInt((endseconds - nowtime.getTime()) / 1000);
    if (remaining > 0) {
      h = parseInt((remaining / 3600) % 24);  
      m = parseInt((remaining / 60) % 60);   
      s = parseInt(remaining % 60);          
      // 统一利用两位数表示剩余的小时、分钟、秒
      h = h < 10 ? '0' + h : h;
      m = m < 10 ? '0' + m : m;
      s = s < 10 ? '0' + s : s;
    } else {
      clearInterval(id);     
       h = m = s = '00';
    }
   	let time = `${h}:${m}：${s}`
   	$('.exam-time>span').html(time)
  }
// 答题卡
  $('.scantron-icon').click(function(){
  	$(this).toggle();
  	$(this).siblings('.scantron-icon').toggle();
  	$(this).parent('p').siblings('.scantron-num').toggle();
  })

$('.scantron li').click(function(){
	$('.scantron li').removeClass('current');
	$(this).addClass('current');
	
})
$('.dart li').click(function(event) {
	let num = $(this).html()-1;
	test1(num)
});
// 上一题
$('.exam-question .pre').click(function(event) {
	let num = $('.exam-question label').eq(0).html();
		console.log(num)
	if (num==0) {
		alert('这已经是第一题了！');
		same(num)

	}else{
		num--
		test1(num)
		same(num)
	}
});

// 下一题
$('.exam-question .next').click(function(event) {
	let num = $('.exam-question label').eq(0).html();
	let index = test.length-1;
	console.log(index)
	if (num==index) {
		same(num)
		alert('这已经是最后一题了！');
	}else{
		num++
		test1(num)
		same(num)
	}
});



// 题号一致
function same(a){
	$('.scantron li').removeClass('current');
	$('.scantron li').eq(a).addClass('current');
}

