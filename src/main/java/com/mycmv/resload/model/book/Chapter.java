package com.mycmv.resload.model.book;

import com.mycmv.resload.model.ResBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * @author a
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Chapter extends ResBean {
    private Long   id;
    private String name;
    private String content;
    /** 科目 */
    private String subject;
}
