import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ClassThatThrowsExceptionTest {

    @Test
    void testExceptionNotThrew() throws Exception {
        assertTrue(new ClassThatThrowsException().throwExceptionOrNot(false));
    }


    @Test
    void testExceptionThrown() {
        assertThrows(Exception.class, () -> new ClassThatThrowsException().throwExceptionOrNot(true));
    }

}