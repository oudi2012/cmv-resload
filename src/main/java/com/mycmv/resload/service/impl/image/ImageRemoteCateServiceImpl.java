package com.mycmv.resload.service.impl.image;

import com.mycmv.resload.mapper.ImageRemoteCateMapper;
import com.mycmv.resload.mapper.ResBeanMapper;
import com.mycmv.resload.model.image.ImageRemoteCate;
import com.mycmv.resload.service.image.ImageRemoteCateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/***
 * @author a
 */
@Service
public class ImageRemoteCateServiceImpl extends AbstractResBeanService<ImageRemoteCate> implements ImageRemoteCateService {

    @Resource
    private ImageRemoteCateMapper imageRemoteCateMapper;

    @Override
    public ResBeanMapper<ImageRemoteCate> getResBeanMapper() {
        return imageRemoteCateMapper;
    }
}
