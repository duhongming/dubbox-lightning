package com.alibaba.lightning.consumer;

import com.alibaba.lightning.api.RemoteControlRequest;
import com.alibaba.lightning.api.RemoteControlResponse;

/**
 * Created by michael on 4/12/17.
 */
public interface RemoteServiceRest {


    public RemoteControlResponse openAir(RemoteControlRequest request);
}
