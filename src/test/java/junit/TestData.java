package junit;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestData {

        @Test
        public void testLogic() {
            int a[] = {1,2,3,4};

            Calculate c = new Calculate();
            int max = c.max(a);

            assertEquals(4, max);

        }
}
