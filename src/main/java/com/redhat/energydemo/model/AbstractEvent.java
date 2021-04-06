package com.redhat.energydemo.model;

import java.util.Map;

public abstract class AbstractEvent implements IEvent{

    public String eventType;
    public long timestamp;
    public  Map<String,String> params;
    public String body;



    @Override
    public String getEventType() {
        return eventType;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void setEventType(String s) {
        this.eventType = s;        
    }

    @Override
    public void setParams(Map<String, String> params) {
        this.params = params;        
    }

    @Override
    public void setBody(String s) {
        this.body = s;        
    }
    
}
