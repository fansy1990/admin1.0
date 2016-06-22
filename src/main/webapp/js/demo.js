
function changeRight(url){
	console.info('before');
	document.getElementById("page-wrapper").innerHTML=url;
	console.info('after');
}

$(function () {
	
	$('.nav-second-level a').bind('click', function(){
		
		var tt_url = $(this).attr('tt');
		console.info('tt'+tt_url);
		$('#page-content').prop('src',tt_url);
	});
})