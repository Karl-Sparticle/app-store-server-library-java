// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.client;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

class BearerTokenAuthenticatorTest {

    @Test
    void testCreatingToken() throws Exception {
        try (InputStream key = this.getClass().getClassLoader().getResourceAsStream("certs/testSigningKey.p8")) {
            Assertions.assertNotNull(key);
            BearerTokenAuthenticator tokenGenerator = new BearerTokenAuthenticator(new String(IOUtils.toByteArray(key)), "keyId", "issuerId", "bundleId");
            String token = tokenGenerator.generateToken();
            Assertions.assertNotNull(token);
        }
    }

}
