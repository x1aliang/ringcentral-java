package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyDirectoryAccountInfo
{
    // Internal identifier of an account
    public String id;
    public CompanyDirectoryAccountInfo id(String id) {
        this.id = id;
        return this;
    }
}
