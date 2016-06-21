
function changeRight(url){
	console.info('before');
	document.getElementById("page-wrapper").innerHTML=url;
	console.info('after');
}

$(function () {
	
	$('#test_table').bind('click', changeRight('test/test.jsp'));
})