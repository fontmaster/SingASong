import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    private Object ArrayList;

    @Test
    void approvalTest() {
        Approvals.verify(Song.makeSong());

    }
}