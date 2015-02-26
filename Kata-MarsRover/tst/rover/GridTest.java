package rover;

import junit.framework.TestCase;
import org.junit.Test;

public class GridTest extends TestCase{
	private Grid grid;
	private int height = 10;
	int width = 11;

	protected void setUp(){
		createGrid(height, width);
	}

	private void createGrid(int height, int width) {
		grid = new Grid(height,width);
	}

	@Test
	public void testGridHeightAndWidth() {
		assertEquals(10,grid.getHeight());
		assertEquals(11,grid.getWidth());
	}

	@Test
	public void testDifferentHeightAndWidth() {
		int height = 12;
		int width = 13;
		createGrid(height, width);
		assertEquals(12,grid.getHeight());
		assertEquals(13,grid.getWidth());
	}

	@Test
	public void testHasObstacleAt() {
		assertEquals(false, grid.hasObstacleAt(1, 1));
	}

	@Test
	public void testAddObstacleAt() {
		grid.addObstacleAt(1, 1);
		assertEquals(true, grid.hasObstacleAt(1, 1));
	}

	@Test
	public void testAddMultiObstacleAt() {
		grid.addObstacleAt(1, 1);
		grid.addObstacleAt(2, 3);
		assertEquals(true, grid.hasObstacleAt(1, 1));
		assertEquals(false, grid.hasObstacleAt(1, 2));
		assertEquals(true, grid.hasObstacleAt(2, 3));
	}
}