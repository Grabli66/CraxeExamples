// Generated by Haxe 4.0.0-rc.2+175840a
(function () { "use strict";
var ClassUser = function(id,name,email) {
	this.id = id;
	this.name = name;
	this.email = email;
};
var TypedefTest = function() { };
TypedefTest.test = function(arr) {
	var _g = 0;
	while(_g < arr.length) {
		var it = arr[_g];
		++_g;
		console.log("src/TypedefTest.hx:22:",it.name);
	}
};
TypedefTest.main = function() {
	var arr = [];
	var _g = 0;
	while(_g < 1000000) {
		var i = _g++;
		var clsUser = new ClassUser(i,(i == null ? "null" : "" + i) + "GOOD",(i == null ? "null" : "" + i) + "HELLO");
		arr.push(clsUser);
	}
	var s = arr[100];
	console.log("src/TypedefTest.hx:58:",s.id);
	console.log("src/TypedefTest.hx:60:",arr.length);
};
TypedefTest.main();
})();