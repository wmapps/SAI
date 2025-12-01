package com.aefyr.sai.installerx.resolver.meta;

public interface SplitApkSourceMetaResolver {

    //TODO resolution progress listener would be nice

    /**
     * Resolve for apk source meta resolution result.
     *
     * @param apkSourceFile apk source file
     * @return the apk source meta resolution result
     * @throws Exception the exception
     */
    ApkSourceMetaResolutionResult resolveFor(ApkSourceFile apkSourceFile) throws Exception;

}
