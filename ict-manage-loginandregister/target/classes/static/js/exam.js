
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