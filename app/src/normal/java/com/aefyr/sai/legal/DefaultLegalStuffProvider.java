package com.aefyr.sai.legal;

public class DefaultLegalStuffProvider implements LegalStuffProvider {

    private static DefaultLegalStuffProvider sInstance;


    public static synchronized DefaultLegalStuffProvider getInstance() {
        return sInstance != null ? sInstance : new DefaultLegalStuffProvider();
    }

    private DefaultLegalStuffProvider() {
        sInstance = this;
    }

    @Override
    public boolean hasPrivacyPolicy() {
        return true;
    }

    @Override
    public String getPrivacyPolicyUrl() {
        return "https://aefyr.github.io/sai/privacy_en.html";
    }

    @Override
    public boolean hasEula() {
        return true;
    }

    @Override
    public String getEulaUrl() {
        return "https://aefyr.github.io/sai/eula_en";
    }
}
