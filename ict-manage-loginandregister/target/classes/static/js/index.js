
// 注册登录切换
$('.reg-text').click(function() {
	$('.login-right').toggle();
	$('.register-right').toggle();
})

// 非空判断
$('.non-null').blur(function() {
	let a = this;
	if ($(this).val() == '') {
		wrongful(a);
	} else {
		lawful(a);
	}
})

// 验证手机号码
$('.phone-num').keyup(function() {
	let a = this;
	if ($(this).val().match(/^1(3|4|5|7|8)\d{9}$/)) {
		lawful(a);
	} else {
		wrongful(a);
	}
})
// 验证合法的
function lawful(a) {
	$(a).css('border-color', '#46be8a');
	$(a).siblings('.ok-sign').show();
	$(a).siblings('.remove').hide();
}
// 验证不合法的
function wrongful(b) {
	$(b).css('border-color', 'red');
	$(b).siblings('.remove').show();
	$(b).siblings('.ok-sign').hide();
}

// 注册
$('.register-form').submit(function(e) {

	var flag = true;
	console.log($('.register-form .non-null').eq(0).val())

	if ($('.register-form .non-null').eq(0).val() == '') {
		alert($('.register-form .non-null').eq(0).val() == '');
		flag = false;
		wrongful('.non-null')
	} else {
		lawful('.non-null')
	}
	if ($('.phone-num').match(/^1(3|4|5|7|8)\d{9}$/)) {
		lawful('.phone-num')
	} else {
		flag = false;
		wrongful('.phone-num')
	}
	if (!flag) {
		// e.preventDefault();
		return false;
	}
});

// 登录
var login = document.getElementsByClassName('login-btn');
login[0].onclick = function() {
	location.assign('file:///G:/%E4%B8%9C%E5%8D%8E/ICT/html/home.html')
}
$(document).ready(function() {
	$("#login-btn").click(function() {
		var userName = $("#userName").val();
		var userPwd = $("#userPwd").val();
		location.href = "login?userName=" + userName + "&userPwd=" + userPwd;
	})
})