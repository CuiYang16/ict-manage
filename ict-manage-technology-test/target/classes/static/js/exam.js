
$('.exam-feature>li').eq(0).click(function(){
	test2();
	$('.technology').hide();
	$('.psychological').show();
})
$('.exam-feature>li').eq(1).click(function(){
	test2();
	$('.psychological').hide();
	$('.technology').show();
})

function test2(){
	$('.exam-con').hide();
	$('.exam-explain').show();

}


// 答题页面
// 生成答题卡

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



