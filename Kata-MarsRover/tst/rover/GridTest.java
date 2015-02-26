package rover;

import junit.framework.TestCase;

import org.junit.Test;

public class GridTest extends TestCase{
	private Grid grid;
	private int height = 10;
	int width = 11;

	private void createGrid(int height, int width) {
		grid = new Grid(height,width);
	}

	@Test
	public void testGridHeightAndWidth() {
		createGrid(height, width);	
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
}
