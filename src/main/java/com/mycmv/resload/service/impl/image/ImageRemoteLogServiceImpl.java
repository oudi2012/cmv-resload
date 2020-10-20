package com.mycmv.resload.service.impl.image;

import com.mycmv.resload.mapper.ImageRemoteLogMapper;
import com.mycmv.resload.mapper.ResBeanMapper;
import com.mycmv.resload.model.image.ImageRemoteLog;
import com.mycmv.resload.service.image.ImageRemoteLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/***
 * @author a
 */
@Service
public class ImageRemoteLogServiceImpl extends AbstractResBeanService<ImageRemoteLog> implements ImageRemoteLogService {

    @Resource
    private ImageRemoteLogMapper imageRemoteLogMapper;

    @Override
    public ResBeanMapper<ImageRemoteLog> getResBeanMapper() {
        return imageRemoteLogMapper;
    }
}
