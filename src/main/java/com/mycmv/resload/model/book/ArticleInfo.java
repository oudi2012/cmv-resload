package com.mycmv.resload.model.book;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/***
 * 文章
 * @author a
 */
@Data
public class ArticleInfo {
    private Long id;
    private String title;
    private String author;
    private String content;
    private Long userId;
    private Long cateId;
    private String tags;
    private Date createDate;
    private Integer dynasty;
    private Integer grade;
    private Integer styleId;
    /** 排序编号 */
    private Integer orderNo;
    /** 收藏次数 */
    private Integer totalCollect;
    /** 点赞次数 */
    private Integer totalZan;
    /** 评论条数 */
    private Integer totalComment;
    private String href;
}
