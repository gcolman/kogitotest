package com.redhat.energydemo.model;

/**
 * A Smart Meter event. 
 * 
 * implements the Event interface using the Abstract Event.
 * 
 */
public class SmartMeterEvent extends AbstractEvent {
    
    public boolean powerOn;

    public SmartMeterEvent() {

    }

    public boolean isPowerOn(){
        return this.powerOn;
    }

    public void setPowerOn(boolean powerSwitch) {
        this.powerOn = powerSwitch;
    }


}

