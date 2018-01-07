$(document).ready(function() {
	$("#form").submit(function(e) {
		e.preventDefault();
		$.getJSON("/search?search=" + $("#search").val(), function(data) {
			$("#main").html("");
			data.forEach(function(r) {
				$("#main").append("<div><h1>" + r.name + "</h1><p>" + r.body + "</p></div>");
			});
			if (data.length == 0) {
			    $("#main").html("<h1>Nothing Found</h1>");
			}
		});
	});
});