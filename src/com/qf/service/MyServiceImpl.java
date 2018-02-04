package com.qf.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.qf.service.MyService")
public class MyServiceImpl implements MyService{
    String [] msgs={"桃花运","财运","官运"};
    @Override
    public String sm() {
        return null;
    }
}
