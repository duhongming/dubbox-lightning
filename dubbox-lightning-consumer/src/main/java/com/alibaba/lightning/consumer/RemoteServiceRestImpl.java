package com.alibaba.lightning.consumer;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.lightning.api.RemoteControlRequest;
import com.alibaba.lightning.api.RemoteControlResponse;
import com.alibaba.lightning.api.RemoteControlService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by michael on 4/12/17.
 */
@Path("rss")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class RemoteServiceRestImpl implements RemoteServiceRest{

    private RemoteControlService remoteControlService;

    public void setRemoteControlService(RemoteControlService remoteControlService) {
        this.remoteControlService = remoteControlService;
    }

    @POST
    @Path("openAir")
    public RemoteControlResponse openAir(RemoteControlRequest request) {
        return remoteControlService.openAir(request);
    }
}
