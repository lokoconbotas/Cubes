//Calculate area of the cube created
//in the other 2 cubes intersection.

var cube1 = {
	x: 10,
	y: 10,
	z: 5,
	length: 5
};

var cube2 = {
	x: 9,
	y: 9,
	z: 5,
	length: 2
};

calcAreaPlease(cube1, cube2);



function calcAreaPlease(c1, c2){

	makeSomeOperations(c1,c2);
	
	if(wrongZ(c1, c2)){
		alert("Wrong Z index. You can't go to the dark side!!");
		return;
	}

	//Calculate the intersecctions
	//Check this: https://developer.mozilla.org/es/docs/Web/JavaScript/Referencia/Objetos_globales/Math/max
	//and this: http://jsfiddle.net/uthyZ/
	x_overlap = Math.max(0, Math.min(c1.xmax, c2.xmax) - Math.max(c1.xmin, c2.xmin));
	y_overlap = Math.max(0, Math.min(c1.ymax, c2.ymax) - Math.max(c1.ymin, c2.ymin));
	z_overlap = Math.max(0, Math.min(c1.zmax, c2.zmax) - Math.max(c1.zmin, c2.zmin));

	console.log("Same X: " + x_overlap);
	console.log("Same Y: " + y_overlap);
	console.log("Same Z: " + z_overlap);

	return console.log('Your fucking intersection area: ' + x_overlap * y_overlap * z_overlap + ' m3');
}

function makeSomeOperations(c1, c2){

	c1.xmin = c1.x - (c1.length/2);
	c1.xmax = c1.x + (c1.length/2);
	c1.ymin = c1.y - (c1.length/2);
	c1.ymax = c1.y + (c1.length/2);
	c1.zmax = c1.z + (c1.length/2);
	c1.zmin = c1.z - (c1.length/2);

	c2.xmin = c2.x - (c2.length/2);
	c2.xmax = c2.x + (c2.length/2);
	c2.ymin = c2.y - (c2.length/2);
	c2.ymax = c2.y + (c2.length/2);
	c2.zmax = c2.z + (c2.length/2);
	c2.zmin = c2.z - (c2.length/2);
}

function wrongZ(c1, c2){    
	return (c1.z - c1.length/2) < 0 || (c2.z - c2.length/2) < 0;
}