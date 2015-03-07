package rover;

abstract class Direction {
	abstract Compass getDirection();
	abstract Direction turnRight();
	abstract Direction turnLeft();
	abstract Point goForward(Point position, Grid planet);
	abstract Point goBackward(Point position, Grid planet);
}
