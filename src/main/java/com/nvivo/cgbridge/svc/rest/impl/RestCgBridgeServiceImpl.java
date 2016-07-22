package com.nvivo.cgbridge.svc.rest.impl;

import com.nvivo.cgbridge.svc.rest.RestCgBridgeService;

/**
 * Created by DiegoT on 16/07/2016.
 */
public class RestCgBridgeServiceImpl implements RestCgBridgeService {
    public String getStatus() {
        System.out.println("A call was made to this url!!!");
        return "nViVo it's alive!!";
    }
}
