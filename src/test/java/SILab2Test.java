import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    public void everyStatementCriteria(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("#", "0", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        assertEquals(Arrays.asList("#", "2", "#", "2", "1", "#", "#", "2", "#"), SILab2.function(Arrays.asList("#", "0", "#", "0", "0", "#", "#", "0", "#")));
    }

    @Test
    public void everyBranchCriteria(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("#", "0", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
        assertEquals(Arrays.asList("#", "2", "#", "2", "1", "#", "#", "2", "#"), SILab2.function(Arrays.asList("#", "0", "#", "0", "0", "#", "#", "0", "#")));
    }
}