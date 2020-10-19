package com.mycmv.resload.model.image;

import com.mycmv.resload.model.ResBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * ImageRemoteCate
 * @author a
 * id, title, url, cateId, orderNo, creator, createTime
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ImageRemoteInfo extends ResBean {
    private Long id;
    private String title;
    private String url;
    private Long cateId;
    private Integer orderNo;
    private Long creator;
    private Long createTime;
}
