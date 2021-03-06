package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LanguageInfo
{
    // Internal identifier of a language
    public String id;
    public LanguageInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a language
    public String uri;
    public LanguageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Indicates whether a language is available as greeting language
    public Boolean greeting;
    public LanguageInfo greeting(Boolean greeting) {
        this.greeting = greeting;
        return this;
    }
    // Indicates whether a language is available as formatting locale
    public Boolean formattingLocale;
    public LanguageInfo formattingLocale(Boolean formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }
    // Localization code of a language
    public String localeCode;
    public LanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
    // Official name of a language
    public String name;
    public LanguageInfo name(String name) {
        this.name = name;
        return this;
    }
    // Indicates whether a language is available as UI language
    public Boolean ui;
    public LanguageInfo ui(Boolean ui) {
        this.ui = ui;
        return this;
    }
}
