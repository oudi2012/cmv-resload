package com.mycmv.resload.service.impl.image;

import com.mycmv.resload.mapper.ImageRemoteInfoMapper;
import com.mycmv.resload.mapper.ResBeanMapper;
import com.mycmv.resload.model.image.ImageRemoteInfo;
import com.mycmv.resload.service.image.ImageRemoteInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/***
 * @author a
 */
@Service
public class ImageRemoteInfoServiceImpl extends AbstractResBeanService<ImageRemoteInfo> implements ImageRemoteInfoService {

    @Resource
    private ImageRemoteInfoMapper imageRemoteInfoMapper;

    @Override
    public ResBeanMapper<ImageRemoteInfo> getResBeanMapper() {
        return imageRemoteInfoMapper;
    }
}
