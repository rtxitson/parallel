package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    @Test
    void twoLinesHaveSameEndPointATSameDirectionAreEqual() {
        Line l1 = new Line(0, 0, 1, 1);
        assertTrue(l1.areTwoLinesAreEqual(0, 0, 1, 1));
    }
}
