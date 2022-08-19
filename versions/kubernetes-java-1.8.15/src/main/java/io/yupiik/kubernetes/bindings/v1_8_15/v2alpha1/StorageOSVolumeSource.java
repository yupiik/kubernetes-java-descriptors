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
package io.yupiik.kubernetes.bindings.v1_8_15.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_8_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_15.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StorageOSVolumeSource implements Validable<StorageOSVolumeSource>, Exportable {
    private String fsType;
    private Boolean readOnly;
    private LocalObjectReference secretRef;
    private String volumeName;
    private String volumeNamespace;

    public StorageOSVolumeSource() {
        // no-op
    }

    public StorageOSVolumeSource(final String fsType,
                                 final Boolean readOnly,
                                 final LocalObjectReference secretRef,
                                 final String volumeName,
                                 final String volumeNamespace) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
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

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }

    public String getVolumeNamespace() {
        return volumeNamespace;
    }

    public void setVolumeNamespace(final String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                readOnly,
                secretRef,
                volumeName,
                volumeNamespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageOSVolumeSource)) {
            return false;
        }
        final StorageOSVolumeSource __otherCasted = (StorageOSVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef) &&
            Objects.equals(volumeName, __otherCasted.volumeName) &&
            Objects.equals(volumeNamespace, __otherCasted.volumeNamespace);
    }

    public StorageOSVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public StorageOSVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public StorageOSVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public StorageOSVolumeSource volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    public StorageOSVolumeSource volumeNamespace(final String volumeNamespace) {
        this.volumeNamespace = volumeNamespace;
        return this;
    }

    @Override
    public StorageOSVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""),
                    (volumeName != null ? "\"volumeName\":\"" +  JsonStrings.escapeJson(volumeName) + "\"" : ""),
                    (volumeNamespace != null ? "\"volumeNamespace\":\"" +  JsonStrings.escapeJson(volumeNamespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
