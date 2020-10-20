package com.mycmv.resload.service.image;

/***
 * @author a
 */
public interface DownLoadImageService {

    /***
     * 下载图片
     * @param url url
     * @param savePath savePath
     */
    void download(String url, String savePath);
}
