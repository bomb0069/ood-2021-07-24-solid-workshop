package dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateIdServiceTest {

    @Test
    public void case01() {
        GenerateIdService generateIdService = new GenerateIdService();
        String id = generateIdService.getId();
        assertEquals("XYZ7", id);
    }

}