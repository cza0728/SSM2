package org.example.ch111.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("course")
public class User {
    @TableId(value = "id")
    private Long id;
    private String courseNo;
    private String courseName;
    private String courseType;
    private Integer credit;
    private Long teacherId;
    private String semest__er;
    private LocalDateTime create_time;


}
