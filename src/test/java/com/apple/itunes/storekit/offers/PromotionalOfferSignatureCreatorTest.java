// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.offers;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Objects;

class PromotionalOfferSignatureCreatorTest {

    @Test
    void testConstructor() throws Exception {
        try (InputStream key = this.getClass().getClassLoader().getResourceAsStream("testSigningKey.p8")) {
            if (Objects.nonNull(key)) {
                new PromotionalOfferSignatureCreator(new String(IOUtils.toByteArray(key)), "keyId", "bundleId");
            }

        }
    }

}
