package com.alibaba.lightning.provider;

import com.alibaba.lightning.api.RemoteControlRequest;
import com.alibaba.lightning.api.RemoteControlResponse;
import com.alibaba.lightning.api.RemoteControlService;

/**
 * Created by michael on 4/12/17.
 */
public class RemoteControlServiceIml implements RemoteControlService {
    @Override
    public RemoteControlResponse openAir(RemoteControlRequest request) {
        RemoteControlResponse response=new RemoteControlResponse();
        response.setCode("200");
        response.setMessage("成功");
        return response;
    }
}
