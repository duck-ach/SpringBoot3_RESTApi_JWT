package com.boot3.myrestapi.lectures;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    @Test
    public void builder() {
        Lecture lecture = Lecture.builder() // LectureBuilder Class 생성
                .name("Spring REST API")
                .description("REST API developmemt with Spring")
                .build();
        assertEquals("Spring REST API", lecture.getName());
    }
    @Test
    public void javaBean() {
        String name = "Lecture";
        //Give
        String description  = "Spring";
        Lecture lecture = new Lecture();
        //When
        lecture.setName(name);
        lecture.setDescription(description);
        assertThat(lecture.getName()).isEqualTo("Lecture");
        //Then
        assertThat(lecture.getDescription()).isEqualTo("Spring");
    }
}