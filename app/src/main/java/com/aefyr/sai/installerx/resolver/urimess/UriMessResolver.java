package com.aefyr.sai.installerx.resolver.urimess;

import android.net.Uri;

import java.util.Collection;
import java.util.List;

public interface UriMessResolver {

    /**
     * Parse a list of uris and try to make a list of split apks from them
     *
     * @param uris    the uris
     * @param uriHost the uri host
     * @return the list
     */
    List<UriMessResolutionResult> resolve(Collection<Uri> uris, UriHost uriHost);

}
