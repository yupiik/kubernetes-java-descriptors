/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_35_x.v1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import io.yupiik.kubernetes.bindings.v1_35_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodCertificateProjection implements Validable<PodCertificateProjection>, Exportable {
    private String certificateChainPath;
    private String credentialBundlePath;
    private String keyPath;
    private String keyType;
    private Integer maxExpirationSeconds;
    private String signerName;
    private Map<String, String> userAnnotations;

    public PodCertificateProjection() {
        // no-op
    }

    public PodCertificateProjection(final String certificateChainPath,
                                    final String credentialBundlePath,
                                    final String keyPath,
                                    final String keyType,
                                    final Integer maxExpirationSeconds,
                                    final String signerName,
                                    final Map<String, String> userAnnotations) {
        this.certificateChainPath = certificateChainPath;
        this.credentialBundlePath = credentialBundlePath;
        this.keyPath = keyPath;
        this.keyType = keyType;
        this.maxExpirationSeconds = maxExpirationSeconds;
        this.signerName = signerName;
        this.userAnnotations = userAnnotations;
    }

    public String getCertificateChainPath() {
        return certificateChainPath;
    }

    public void setCertificateChainPath(final String certificateChainPath) {
        this.certificateChainPath = certificateChainPath;
    }

    public String getCredentialBundlePath() {
        return credentialBundlePath;
    }

    public void setCredentialBundlePath(final String credentialBundlePath) {
        this.credentialBundlePath = credentialBundlePath;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(final String keyPath) {
        this.keyPath = keyPath;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(final String keyType) {
        this.keyType = keyType;
    }

    public Integer getMaxExpirationSeconds() {
        return maxExpirationSeconds;
    }

    public void setMaxExpirationSeconds(final Integer maxExpirationSeconds) {
        this.maxExpirationSeconds = maxExpirationSeconds;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(final String signerName) {
        this.signerName = signerName;
    }

    public Map<String, String> getUserAnnotations() {
        return userAnnotations;
    }

    public void setUserAnnotations(final Map<String, String> userAnnotations) {
        this.userAnnotations = userAnnotations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                certificateChainPath,
                credentialBundlePath,
                keyPath,
                keyType,
                maxExpirationSeconds,
                signerName,
                userAnnotations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodCertificateProjection)) {
            return false;
        }
        final PodCertificateProjection __otherCasted = (PodCertificateProjection) __other;
        return Objects.equals(certificateChainPath, __otherCasted.certificateChainPath) &&
            Objects.equals(credentialBundlePath, __otherCasted.credentialBundlePath) &&
            Objects.equals(keyPath, __otherCasted.keyPath) &&
            Objects.equals(keyType, __otherCasted.keyType) &&
            Objects.equals(maxExpirationSeconds, __otherCasted.maxExpirationSeconds) &&
            Objects.equals(signerName, __otherCasted.signerName) &&
            Objects.equals(userAnnotations, __otherCasted.userAnnotations);
    }

    public PodCertificateProjection certificateChainPath(final String certificateChainPath) {
        this.certificateChainPath = certificateChainPath;
        return this;
    }

    public PodCertificateProjection credentialBundlePath(final String credentialBundlePath) {
        this.credentialBundlePath = credentialBundlePath;
        return this;
    }

    public PodCertificateProjection keyPath(final String keyPath) {
        this.keyPath = keyPath;
        return this;
    }

    public PodCertificateProjection keyType(final String keyType) {
        this.keyType = keyType;
        return this;
    }

    public PodCertificateProjection maxExpirationSeconds(final Integer maxExpirationSeconds) {
        this.maxExpirationSeconds = maxExpirationSeconds;
        return this;
    }

    public PodCertificateProjection signerName(final String signerName) {
        this.signerName = signerName;
        return this;
    }

    public PodCertificateProjection userAnnotations(final Map<String, String> userAnnotations) {
        this.userAnnotations = userAnnotations;
        return this;
    }

    @Override
    public PodCertificateProjection validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (keyType == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "keyType", "keyType",
                "Missing 'keyType' attribute.", true));
        }
        if (signerName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "signerName", "signerName",
                "Missing 'signerName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (certificateChainPath != null ? "\"certificateChainPath\":\"" +  JsonStrings.escapeJson(certificateChainPath) + "\"" : ""),
                    (credentialBundlePath != null ? "\"credentialBundlePath\":\"" +  JsonStrings.escapeJson(credentialBundlePath) + "\"" : ""),
                    (keyPath != null ? "\"keyPath\":\"" +  JsonStrings.escapeJson(keyPath) + "\"" : ""),
                    (keyType != null ? "\"keyType\":\"" +  JsonStrings.escapeJson(keyType) + "\"" : ""),
                    (maxExpirationSeconds != null ? "\"maxExpirationSeconds\":" + maxExpirationSeconds : ""),
                    (signerName != null ? "\"signerName\":\"" +  JsonStrings.escapeJson(signerName) + "\"" : ""),
                    (userAnnotations != null ? "\"userAnnotations\":" + userAnnotations.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    @Override
    public String toString() {
        return asJson();
    }
}
