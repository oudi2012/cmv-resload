package com.mycmv.resload.controller.image;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.mycmv.resload.constants.LogConstants;
import com.mycmv.resload.model.LongIdListVo;
import com.mycmv.resload.model.ResponseObject;
import com.mycmv.resload.model.image.ImageRemoteCate;
import com.mycmv.resload.service.image.ImageRemoteCateService;
import com.mycmv.resload.utils.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/***
 * 书籍管理
 * @author a
 */
@RestController
@RequestMapping("ImageRemoteCate")
public class ImageRemoteCateRest {

    private static final Logger logger = LoggerFactory.getLogger(LogConstants.ADM_LOG);

    @Resource
    private ImageRemoteCateService imageRemoteCateService;

    @ResponseBody
    @GetMapping("pageList")
    public ResponseObject pageList(ImageRemoteCate item, int pageIndex, int pageSize) {
        String url = "ImageRemoteCate/pageList";
        logger.info("访问 {} , 参数：{}，{}，{}", url, JSON.toJSON(item), pageIndex, pageSize);
        ResponseObject responseObject = new ResponseObject();
        PageInfo<ImageRemoteCate> pageInfo = imageRemoteCateService.pageList(item, pageIndex, pageSize);
        logger.info("返回结果 list 条数：{}", pageInfo.getSize());
        CommonUtils.executeSuccess(responseObject, pageInfo);
        return responseObject;
    }


    
    @ResponseBody
    @GetMapping("list")
    public ResponseObject list(ImageRemoteCate bookItem) {
        String url = "ImageRemoteCate/list";
        logger.info("访问 {} , 参数：{}", url, JSON.toJSON(bookItem));
        ResponseObject responseObject = new ResponseObject();
        List<ImageRemoteCate> list = imageRemoteCateService.list(bookItem);
        if (CollectionUtils.isEmpty(list)) {
            logger.info("返回结果 list 条数：0");
        } else {
            logger.info("返回结果 list 条数：{}", list.size());
        }
        CommonUtils.executeSuccess(responseObject, list);
        return responseObject;
    }


    
    @ResponseBody
    @GetMapping("findById")
    public ResponseObject findById(int id) {
        String url = "ImageRemoteCate/findById";
        logger.info("访问 {} , 参数：{}", url, id);
        ResponseObject responseObject = new ResponseObject();
        ImageRemoteCate tmp = imageRemoteCateService.findById(id);
        if (ObjectUtils.isEmpty(tmp)) {
            logger.info("返回结果 null");
        } else {
            logger.info("返回结果 {}", JSON.toJSONString(tmp));
        }
        CommonUtils.executeSuccess(responseObject, tmp);
        return responseObject;
    }


    
    @ResponseBody
    @PostMapping("create")
    public ResponseObject create(@RequestBody ImageRemoteCate item) {
        String url = "ImageRemoteCate/create";
        logger.info("访问 {} , 参数：{}", url, JSON.toJSON(item));
        ResponseObject responseObject = new ResponseObject();
        item.setOrderNo(0);
        imageRemoteCateService.insert(item);
        CommonUtils.executeSuccess(responseObject);
        return responseObject;
    }


    
    @ResponseBody
    @PostMapping("edit")
    public ResponseObject edit(@RequestBody  ImageRemoteCate item) {
        String url = "ImageRemoteCate/create";
        logger.info("访问 {} , 参数：{}", url, JSON.toJSON(item));
        ResponseObject responseObject = new ResponseObject();
        imageRemoteCateService.update(item);
        CommonUtils.executeSuccess(responseObject);
        return responseObject;
    }


    
    @ResponseBody
    @PostMapping("remove")
    public ResponseObject delete(@RequestBody LongIdListVo longIdListVo) {
        logger.info("访问 {} , 数量：{}", "ImageRemoteCate/remove", JSON.toJSON(longIdListVo));
        ResponseObject resObj = new ResponseObject();
        if (CollectionUtils.isEmpty(longIdListVo.getIds())) {
            longIdListVo.setIds(Collections.singletonList(longIdListVo.getId()));
        }
        CommonUtils.executeSuccess(resObj, imageRemoteCateService.delete(longIdListVo.getIds()));
        return resObj;
    }
}
