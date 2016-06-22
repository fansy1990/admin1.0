function autoHeight(){
    var iframe = document.getElementById("page-content");
    if(iframe.Document){//ie自有属性
        iframe.style.height = iframe.Document.documentElement.scrollHeight;
    }else if(iframe.contentDocument){//ie,firefox,chrome,opera,safari
        iframe.height = iframe.contentDocument.body.offsetHeight ;
    }
}

$(function () {
	
	$('.nav-second-level a').bind('click', function(){
		
		var tt_url = $(this).attr('tt');
		console.info('tt'+tt_url);
		$('#page-content').prop('src',tt_url);
	});
})