package com.xxl.job.core.biz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuxueli on 2017-05-10 20:22:42
 */
public class RegistryParam implements Serializable {
    private static final long serialVersionUID = 42L;

    private String registryGroup;
    private String registryKey;
    private String registryValue;
    private List<String> registryJobHandlerList;

    public RegistryParam(){}

    public RegistryParam(String registryGroup, String registryKey, String registryValue) {
        this.registryGroup = registryGroup;
        this.registryKey = registryKey;
        this.registryValue = registryValue;
        this.registryJobHandlerList = new ArrayList<>();
    }

    public RegistryParam(String registryGroup, String registryKey, String registryValue, List<String> registryJobHandlerList) {
        this.registryGroup = registryGroup;
        this.registryKey = registryKey;
        this.registryValue = registryValue;
        this.registryJobHandlerList = registryJobHandlerList;
    }

    public String getRegistryGroup() {
        return registryGroup;
    }

    public void setRegistryGroup(String registryGroup) {
        this.registryGroup = registryGroup;
    }

    public String getRegistryKey() {
        return registryKey;
    }

    public void setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
    }

    public String getRegistryValue() {
        return registryValue;
    }

    public void setRegistryValue(String registryValue) {
        this.registryValue = registryValue;
    }

    public List<String> getRegistryJobHandlerList() {
        return registryJobHandlerList;
    }

    public void setRegistryJobHandlerList(List<String> registryJobHandlerList) {
        this.registryJobHandlerList = registryJobHandlerList;
    }


    @Override
    public String toString() {
        String registryJobHandlerListStr = "";
        for (String item:registryJobHandlerList) {
            registryJobHandlerListStr += "'" + item + "',";
        }
        if(registryJobHandlerListStr.length()>0) {
            registryJobHandlerListStr = registryJobHandlerListStr.substring(0, registryJobHandlerListStr.length()-1);
        }

        return "RegistryParam {" +
                "registryGroup='" + registryGroup + '\'' +
                ", registryKey='" + registryKey + '\'' +
                ", registryValue='" + registryValue + '\'' +
                ", registryJobHandlerList:[" + registryJobHandlerListStr +
                "]" +
                '}';
    }
}
