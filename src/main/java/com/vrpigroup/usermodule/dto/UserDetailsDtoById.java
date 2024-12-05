package com.vrpigroup.usermodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDetailsDtoById {

    //    user entity data
    private DocResponseByUserGetId user;
    private ResponseDto responseDto;

    //    courses data from course entity
    List<EnrollCourseListDto> courseList;

    //    getting data from eduation Entity
    private EducationDetailsDto educationDetails;

    private String statusMessage;

    public UserDetailsDtoById(DocResponseByUserGetId user, List<EnrollCourseListDto> enrolledCourses, EducationDetailsDto educationDetailsDto, String httpStatusOk) {
        this.user = user;
        this.courseList = enrolledCourses;
        this.educationDetails = educationDetailsDto;
        this.statusMessage = httpStatusOk;
    }
}

