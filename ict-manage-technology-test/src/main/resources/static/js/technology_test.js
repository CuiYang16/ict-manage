$(document).ready(function() {

	//showAndHide();
	
 	$('.topic-detail:not(:first)').css({
		display:'none'
	}); 
 	
 	$('.next-topic').click(function(){
		
		if($(this).is($('.next-topic').eq(-1))){
			$('.next-topic').attr("disabled",true);
		}else{
			$(this).parent().parent().hide();
			$(this).parent().parent().next().show();
			$('.next-topic').attr("disabled",false);
			$('.previous-topic').attr("disabled",false);
		}
	});
 	
 	$('.previous-topic').click(function(){
		
		if($(this).is($('.previous-topic').eq(0))){
			$('.previous-topic').attr("disabled",true);
		}else{
			$(this).parent().parent().hide();
			$(this).parent().parent().prev().show();
			$('.previous-topic').attr("disabled",false);
			$('.next-topic').attr("disabled",false);
		}
	});
 	
 	$('.topic-span').click(function(){
		$(".topic-detail:visible").hide();
		$('.technologyone'+($(this).index()+1)).show();
		//showAndHide();
	});
});

