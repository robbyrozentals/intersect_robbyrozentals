double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()

CSG roundedCylinder = new RoundedCylinder(50,60.0).toCSG()
CSG simpleSyntax =new Cylinder(20,40).toCSG() // a one line Cylinder
CSG sphere = new Sphere(size/20*12.5).toCSG()
sphere =simpleSyntax.intersect(roundedCylinder)			
//create a sphere

// perform a union
CSG cubePlusSphere = cube.intersect(sphere);

return [cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)]