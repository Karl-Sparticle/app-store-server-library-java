package com.apple.itunes.storekit.client;

public enum GetTransactionHistoryVersion {

    @Deprecated
    V1("v1"),
    V2("v2");

    private final String urlVersion;

    GetTransactionHistoryVersion(String urlVersion) {
        this.urlVersion = urlVersion;
    }

    String getUrlVersion() {
        return urlVersion;
    }
}
