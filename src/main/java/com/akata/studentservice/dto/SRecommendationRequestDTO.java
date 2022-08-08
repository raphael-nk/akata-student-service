package com.akata.studentservice.dto;

import com.akata.studentservice.entities.Recommendation;
import com.akata.studentservice.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SRecommendationRequestDTO {
    Student student;
    Recommendation recommendation;
}
