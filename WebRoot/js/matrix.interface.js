
$(document).ready(function(){
	
	// === jQuery Peity  图表/图形脚本=== //
	$.fn.peity.defaults.line = {
		strokeWidth: 1,
		delimeter: ",",
		height: 24,
		max: null,
		min: 0,
		width: 50
	};
	$.fn.peity.defaults.bar = {
		delimeter: ",",
		height: 24,
		max: null,
		min: 0,
		width: 50
	};
	$(".peity_line_good span").peity("line", {
		colour: "#B1FFA9",
		strokeColour: "#459D1C"
	});
	$(".peity_line_bad span").peity("line", {
		colour: "#FFC4C7",
		strokeColour: "#BA1E20"
	});	
	$(".peity_line_neutral span").peity("line", {
		colour: "#CCCCCC",
		strokeColour: "#757575"
	});
	$(".peity_bar_good span").peity("bar", {
		colour: "#459D1C"
	});
	$(".peity_bar_bad span").peity("bar", {
		colour: "#BA1E20"
	});	
	$(".peity_bar_neutral span").peity("bar", {
		colour: "#757575"
	});
	
	// === jQeury 提示牌, 像通知一样咆哮 === //
	$.gritter.add({
		title:	'重要的未读消息',
		text:	'你有12条未读消息。',
		image: 	'img/demo/envelope.png',
		sticky: false
	});	
	$('#gritter-notify .normal').click(function(){
		$.gritter.add({
			title:	'常规通知',
			text:	'This is a normal notification',
			sticky: false
		});		
	});
	
	$('#gritter-notify .sticky').click(function(){
		$.gritter.add({
			title:	'粘性通知',
			text:	'This is a sticky notification',
			sticky: true
		});		
	});
	
	$('#gritter-notify .image').click(function(){
		var imgsrc = $(this).attr('data-image');
		$.gritter.add({
			title:	'重要的未读消息',
			text:	'你有12条未读消息。',
			image: imgsrc,
			sticky: false
		});		
	});
});
