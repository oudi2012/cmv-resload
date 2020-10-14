package com.mycmv.resload.service.image;

public interface DownLoadImageService {

    /***
     * 下载图片
     * @param url
     * @param savePath
     */
    void download(String url, String savePath);
}
