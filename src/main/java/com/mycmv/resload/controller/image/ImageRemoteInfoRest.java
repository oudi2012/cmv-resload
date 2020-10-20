package com.mycmv.resload.controller.image;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.mycmv.resload.constants.LogConstants;
import com.mycmv.resload.model.LongIdListVo;
import com.mycmv.resload.model.ResponseObject;
import com.mycmv.resload.model.image.ImageRemoteInfo;
import com.mycmv.resload.service.image.ImageRemoteInfoService;
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
@RequestMapping("ImageRemoteInfo")
public class ImageRemoteInfoRest {

    private static final Logger logger = LoggerFactory.getLogger(LogConstants.ADM_LOG);

    @Resource
    private ImageRemoteInfoService imageRemoteInfoService;

    @ResponseBody
    @GetMapping("pageList")
    public ResponseObject pageList(ImageRemoteInfo item, int pageIndex, int pageSize) {
        String url = "ImageRemoteInfo/pageList";
        logger.info("访问 {} , 参数：{}，{}，{}", url, JSON.toJSON(item), pageIndex, pageSize);
        ResponseObject responseObject = new ResponseObject();
        PageInfo<ImageRemoteInfo> pageInfo = imageRemoteInfoService.pageList(item, pageIndex, pageSize);
        logger.info("返回结果 list 条数：{}", pageInfo.getSize());
        CommonUtils.executeSuccess(responseObject, pageInfo);
        return responseObject;
    }


    
    @ResponseBody
    @GetMapping("list")
    public ResponseObject list(ImageRemoteInfo item) {
        String url = "ImageRemoteInfo/list";
        logger.info("访问 {} , 参数：{}", url, JSON.toJSON(item));
        ResponseObject responseObject = new ResponseObject();
        List<ImageRemoteInfo> list = imageRemoteInfoService.list(item);
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
        String url = "ImageRemoteInfo/findById";
        logger.info("访问 {} , 参数：{}", url, id);
        ResponseObject responseObject = new ResponseObject();
        ImageRemoteInfo tmp = imageRemoteInfoService.findById(id);
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
    public ResponseObject create(@RequestBody ImageRemoteInfo item) {
        String url = "ImageRemoteInfo/create";
        logger.info("访问 {} , 参数：{}", url, JSON.toJSON(item));
        ResponseObject responseObject = new ResponseObject();
        item.setOrderNo(0);
        imageRemoteInfoService.insert(item);
        CommonUtils.executeSuccess(responseObject);
        return responseObject;
    }


    
    @ResponseBody
    @PostMapping("edit")
    public ResponseObject edit(@RequestBody  ImageRemoteInfo item) {
        String url = "ImageRemoteInfo/create";
        logger.info("访问 {} , 参数：{}", url, JSON.toJSON(item));
        ResponseObject responseObject = new ResponseObject();
        imageRemoteInfoService.update(item);
        CommonUtils.executeSuccess(responseObject);
        return responseObject;
    }


    
    @ResponseBody
    @PostMapping("remove")
    public ResponseObject delete(@RequestBody LongIdListVo longIdListVo) {
        logger.info("访问 {} , 数量：{}", "ImageRemoteInfo/remove", JSON.toJSON(longIdListVo));
        ResponseObject resObj = new ResponseObject();
        if (CollectionUtils.isEmpty(longIdListVo.getIds())) {
            longIdListVo.setIds(Collections.singletonList(longIdListVo.getId()));
        }
        CommonUtils.executeSuccess(resObj, imageRemoteInfoService.delete(longIdListVo.getIds()));
        return resObj;
    }
}
