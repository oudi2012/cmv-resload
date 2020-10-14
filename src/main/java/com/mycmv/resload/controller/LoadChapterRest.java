package com.mycmv.resload.controller;


import com.mycmv.resload.model.ResponseObject;
import com.mycmv.resload.service.image.DownLoadImageService;
import com.mycmv.resload.utils.CommonUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 * LoadChapterRest
 * @author a
 */
@RestController
public class LoadChapterRest {

    @Resource
    private DownLoadImageService downLoadImageService;

    private static final String SAVE_PATH = "";

    @GetMapping("loadChapter")
    public ResponseObject loadChapter() {
        ResponseObject responseObject = new ResponseObject();

        CommonUtils.executeSuccess(responseObject);
        return responseObject;
    }

}
