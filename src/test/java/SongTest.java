import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    private Object ArrayList;

    @Test
    void approvalTest() {
//        Approvals.verify(Song.makeSong());
        // old lady cow -> dog -> cat -> bird -> spider -> fly

        String[] animals = {"fly","spider","bird","cat","dog","cow"};
        Approvals.verify(Song.makeSong(animals));
    }
}