package com.mycmv.resload.model.image;

import com.mycmv.resload.model.ResBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * ImageRemoteLog
 * @author a
 * id, urlId, title, url, content, state, orderNo, creator, createTime
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ImageRemoteLog extends ResBean {
    private Long id;
    private Long urlId;
    private String title;
    private String url;
    private String content;
    private Integer state;
    private Integer orderNo;
    private Long creator;
    private Long createTime;
}
