package com.mycmv.resload.controller.image;


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

    //https://mmbiz.qpic.cn/mmbiz_jpg/guIn6laxV5iacUI7gm1OZwCFybTfUEZzc5eARWg2BalaS8gBU7vbz2r9huicrjr4AwILmo3rDEK3IibsLKDlianF2g/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1
    private static final String SAVE_PATH = "";

    @GetMapping("loadChapter")
    public ResponseObject loadChapter() {
        ResponseObject responseObject = new ResponseObject();

        CommonUtils.executeSuccess(responseObject);
        return responseObject;
    }

}
