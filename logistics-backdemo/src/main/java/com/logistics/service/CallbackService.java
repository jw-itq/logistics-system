package com.logistics.service;

import com.logistics.pojo.Callbackinfo;
import org.springframework.web.bind.annotation.PathVariable;

public interface CallbackService {
    public String addInfo(Callbackinfo callbackinfo);

    public Callbackinfo findDetail(String goodsBillId, String type);
}
