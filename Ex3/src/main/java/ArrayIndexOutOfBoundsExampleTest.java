import org.junit.Test;

public class ArrayIndexOutOfBoundsExampleTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        ArrayIndexOutOfBoundsExample testarrayManager = new ArrayIndexOutOfBoundsExample();
        int[] array = {1, 2, 3,4};
        testarrayManager.getElement(array, 5);
    }
}