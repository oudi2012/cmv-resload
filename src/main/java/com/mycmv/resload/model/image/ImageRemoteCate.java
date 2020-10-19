package com.mycmv.resload.model.image;

import com.mycmv.resload.model.ResBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * ImageRemoteCate
 * @author a
 * id, title, orderNo, creator, createTime
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ImageRemoteCate extends ResBean {
    private Long id;
    private String title;
    private Integer orderNo;
    private Long creator;
    private Long createTime;
}
