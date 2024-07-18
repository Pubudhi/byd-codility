package com.byd.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OldPhonePadTest {
    OldPhonePad oldPhonePad = new OldPhonePad();

    @Test
    void oldPhonePadSingleCharacterTest() {
        assertEquals("A", oldPhonePad.oldPhonePad("2#"));
    }

    @Test
    void oldPhonePadEmptyCharacterTest() {
        assertEquals("", oldPhonePad.oldPhonePad("#"));
    }

    @Test
    void oldPhonePadDoubleCharactersTest() {
        assertEquals("E", oldPhonePad.oldPhonePad("33#"));
    }

    @Test
    void oldPhonePadSingleBackSpaceCharacterTest() {
        assertEquals("", oldPhonePad.oldPhonePad("*#"));
    }

    @Test
    void oldPhonePadBackSpaceSequenceCharactersTest() {
        assertEquals("", oldPhonePad.oldPhonePad("22*2*#"));
    }

    @Test
    void oldPhonePadSingleCharacterAndBackSpaceTest() {
        assertEquals("B", oldPhonePad.oldPhonePad("227*#"));
    }

    @Test
    void oldPhonePadCharacterSequenceWithSpaceTest() {
        assertEquals("HELLO", oldPhonePad.oldPhonePad("4433555 555666#"));
    }

    @Test
    void oldPhonePadCharacterSequenceWithSpaceandBackSpaceTest() {
        assertEquals("TURING", oldPhonePad.oldPhonePad("8 88777444666*664#"));
    }

    @Test
    void oldPhonePadCharacterSequenceOnSameNumberPadTest() {
        assertEquals("ABC", oldPhonePad.oldPhonePad("2 22 222#"));
    }

    @Test
    void oldPhonePadCharacterSequenceOnSameCharacterTest() {
        assertEquals("EEE", oldPhonePad.oldPhonePad("33 33 33#"));
    }
}