package com.technosoft.demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Practice2Test {

    @Test
    public void testAboveBelow(){
        Practice2 testClass = new Practice2();
        List<Integer> inputList = List.of(1, 5, 2, 1, 10);
        final int key = 6;
        Map<String, Long> stringLongMap = testClass.aboveBelow(inputList, key);
        assertAll(()-> assertEquals(Long.valueOf(1), stringLongMap.get("above")),
                ()-> assertEquals(Long.valueOf(4), stringLongMap.get("below")));
    }

    @Test
    public void testStringRotation(){
        Practice2 testClass = new Practice2();
        assertAll(() -> assertEquals("ngMyStri", testClass.stringRotation("MyString", 2)),
                () -> assertEquals("eabcd", testClass.stringRotation("abcde", 1)));
    }

}