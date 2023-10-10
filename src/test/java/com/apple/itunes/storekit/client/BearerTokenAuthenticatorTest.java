// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.client;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Objects;

class BearerTokenAuthenticatorTest {

    @Test
    void testConstructor() throws Exception {
        try (InputStream key = this.getClass().getClassLoader().getResourceAsStream("testSigningKey.p8")) {
            if (Objects.nonNull(key)) {
                new BearerTokenAuthenticator(new String(IOUtils.toByteArray(key)), "keyId", "issuerId", "bundleId");
            }
        }
    }

}
