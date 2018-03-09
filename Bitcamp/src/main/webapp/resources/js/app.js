var app = app || {}; // 객체 생성
var route = route || {};
app = (()=>{
	return {init:x=>{
				 route.init(x);
				 location.href = route.$()+"/move/main/home";
//				 location.href = route.$()+"/board/list";
			 }, move:x=>{
				 location.href = route.$()+"/move/"+x;
			 }
	};
})();
route = (()=>{
	return {
				init:x => {
					sessionStorage.setItem('x', x);
				},
				$:() =>{
					return sessionStorage.getItem('x');
				},
				$s:() => {
					return sessionStorage.getItem('x'+'/resources/js');
				},
				$c:() => {
					return sessionStorage.getItem('x'+'/resources/css');
				},
				$i:() => {
					return sessionStorage.getItem('x'+'/resources/img');
				}
	};
})();