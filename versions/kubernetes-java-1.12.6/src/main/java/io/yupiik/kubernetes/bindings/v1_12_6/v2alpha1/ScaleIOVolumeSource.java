/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_12_6.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_12_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_6.Validable;
import io.yupiik.kubernetes.bindings.v1_12_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ScaleIOVolumeSource implements Validable<ScaleIOVolumeSource>, Exportable {
    private String fsType;
    private String gateway;
    private String protectionDomain;
    private Boolean readOnly;
    private LocalObjectReference secretRef;
    private Boolean sslEnabled;
    private String storageMode;
    private String storagePool;
    private String system;
    private String volumeName;

    public ScaleIOVolumeSource() {
        // no-op
    }

    public ScaleIOVolumeSource(final String fsType,
                               final String gateway,
                               final String protectionDomain,
                               final Boolean readOnly,
                               final LocalObjectReference secretRef,
                               final Boolean sslEnabled,
                               final String storageMode,
                               final String storagePool,
                               final String system,
                               final String volumeName) {
        // no-op
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(final String gateway) {
        this.gateway = gateway;
    }

    public String getProtectionDomain() {
        return protectionDomain;
    }

    public void setProtectionDomain(final String protectionDomain) {
        this.protectionDomain = protectionDomain;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(final Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(final String storageMode) {
        this.storageMode = storageMode;
    }

    public String getStoragePool() {
        return storagePool;
    }

    public void setStoragePool(final String storagePool) {
        this.storagePool = storagePool;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(final String system) {
        this.system = system;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                gateway,
                protectionDomain,
                readOnly,
                secretRef,
                sslEnabled,
                storageMode,
                storagePool,
                system,
                volumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScaleIOVolumeSource)) {
            return false;
        }
        final ScaleIOVolumeSource __otherCasted = (ScaleIOVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(gateway, __otherCasted.gateway) &&
            Objects.equals(protectionDomain, __otherCasted.protectionDomain) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(sslEnabled, __otherCasted.sslEnabled) &&
            Objects.equals(storageMode, __otherCasted.storageMode) &&
            Objects.equals(storagePool, __otherCasted.storagePool) &&
            Objects.equals(system, __otherCasted.system) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }

    public ScaleIOVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public ScaleIOVolumeSource gateway(final String gateway) {
        this.gateway = gateway;
        return this;
    }

    public ScaleIOVolumeSource protectionDomain(final String protectionDomain) {
        this.protectionDomain = protectionDomain;
        return this;
    }

    public ScaleIOVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public ScaleIOVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public ScaleIOVolumeSource sslEnabled(final Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    public ScaleIOVolumeSource storageMode(final String storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    public ScaleIOVolumeSource storagePool(final String storagePool) {
        this.storagePool = storagePool;
        return this;
    }

    public ScaleIOVolumeSource system(final String system) {
        this.system = system;
        return this;
    }

    public ScaleIOVolumeSource volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    @Override
    public ScaleIOVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (gateway == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "gateway", "gateway",
                "Missing 'gateway' attribute.", true));
        }
        if (secretRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "secretRef", "secretRef",
                "Missing 'secretRef' attribute.", true));
        }
        if (system == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "system", "system",
                "Missing 'system' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (gateway != null ? "\"gateway\":\"" +  JsonStrings.escapeJson(gateway) + "\"" : ""),
                    (protectionDomain != null ? "\"protectionDomain\":\"" +  JsonStrings.escapeJson(protectionDomain) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (sslEnabled != null ? "\"sslEnabled\":" + sslEnabled : ""),
                    (storageMode != null ? "\"storageMode\":\"" +  JsonStrings.escapeJson(storageMode) + "\"" : ""),
                    (storagePool != null ? "\"storagePool\":\"" +  JsonStrings.escapeJson(storagePool) + "\"" : ""),
                    (system != null ? "\"system\":\"" +  JsonStrings.escapeJson(system) + "\"" : ""),
                    (volumeName != null ? "\"volumeName\":\"" +  JsonStrings.escapeJson(volumeName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
