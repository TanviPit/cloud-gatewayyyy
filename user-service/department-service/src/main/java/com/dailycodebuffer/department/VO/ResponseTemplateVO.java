package com.dailycodebuffer.department.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {


    private User user;
    private Department department;
}
