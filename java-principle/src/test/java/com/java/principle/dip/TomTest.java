package com.java.principle.dip;


import org.junit.jupiter.api.Test;

/**
 * @author jinglv
 * @date 2020-07-04 2:59 下午
 */
public class TomTest {

    Tom tom = new Tom();

    @Test
    public void testStudyJavaCourse() {
        tom.studyJavaCourse();
    }

    @Test
    public void testStudyPythonCourse() {
        tom.studyPythonCourse();
    }
}