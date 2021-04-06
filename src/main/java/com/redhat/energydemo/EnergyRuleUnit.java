package com.redhat.energydemo;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;
import com.redhat.energydemo.model.SmartMeterEvent;

public class EnergyRuleUnit implements RuleUnitData{
    
    private DataStore<SmartMeterEvent> events = DataSource.createStore();

    public EnergyRuleUnit() {}

    public DataStore<SmartMeterEvent> getEvents() {
        return events;
    }
  
    public void setEvents(DataStore<SmartMeterEvent> events) {
        this.events = events;
    } 


}



