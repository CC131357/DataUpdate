package com.example.spring_dingshi.service;

import org.springframework.web.multipart.MultipartFile;

public interface PlateService {
    public int addPlate(MultipartFile file) throws Exception;
}
