package T4;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class TestCalc {
    @Test
    void calcTest(){
        assertEquals(3, new Calc().add(1,2));
        assertEquals(1,new Calc().subtract(3,2));
    }
}
