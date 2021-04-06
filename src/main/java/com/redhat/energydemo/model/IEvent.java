package com.redhat.energydemo.model;

import java.util.Map;

public interface IEvent {

    public String getEventType();
    public long getTimestamp();
    public Map<String,String> getParams();
    public String getBody();
    public String toString();
    public void setEventType(String s);
    public void setParams(Map<String,String> params);
    public void setBody(String s);

}
