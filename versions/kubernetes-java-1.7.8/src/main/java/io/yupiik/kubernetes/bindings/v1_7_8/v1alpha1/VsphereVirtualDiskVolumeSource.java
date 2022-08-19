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
package io.yupiik.kubernetes.bindings.v1_7_8.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_7_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_8.Validable;
import io.yupiik.kubernetes.bindings.v1_7_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VsphereVirtualDiskVolumeSource implements Validable<VsphereVirtualDiskVolumeSource>, Exportable {
    private String fsType;
    private String storagePolicyID;
    private String storagePolicyName;
    private String volumePath;

    public VsphereVirtualDiskVolumeSource() {
        // no-op
    }

    public VsphereVirtualDiskVolumeSource(final String fsType,
                                          final String storagePolicyID,
                                          final String storagePolicyName,
                                          final String volumePath) {
        this.fsType = fsType;
        this.storagePolicyID = storagePolicyID;
        this.storagePolicyName = storagePolicyName;
        this.volumePath = volumePath;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    public void setStoragePolicyID(final String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    public void setStoragePolicyName(final String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    public String getVolumePath() {
        return volumePath;
    }

    public void setVolumePath(final String volumePath) {
        this.volumePath = volumePath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                storagePolicyID,
                storagePolicyName,
                volumePath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VsphereVirtualDiskVolumeSource)) {
            return false;
        }
        final VsphereVirtualDiskVolumeSource __otherCasted = (VsphereVirtualDiskVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(storagePolicyID, __otherCasted.storagePolicyID) &&
            Objects.equals(storagePolicyName, __otherCasted.storagePolicyName) &&
            Objects.equals(volumePath, __otherCasted.volumePath);
    }

    public VsphereVirtualDiskVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public VsphereVirtualDiskVolumeSource storagePolicyID(final String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
        return this;
    }

    public VsphereVirtualDiskVolumeSource storagePolicyName(final String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
        return this;
    }

    public VsphereVirtualDiskVolumeSource volumePath(final String volumePath) {
        this.volumePath = volumePath;
        return this;
    }

    @Override
    public VsphereVirtualDiskVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (volumePath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumePath", "volumePath",
                "Missing 'volumePath' attribute.", true));
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
                    (storagePolicyID != null ? "\"storagePolicyID\":\"" +  JsonStrings.escapeJson(storagePolicyID) + "\"" : ""),
                    (storagePolicyName != null ? "\"storagePolicyName\":\"" +  JsonStrings.escapeJson(storagePolicyName) + "\"" : ""),
                    (volumePath != null ? "\"volumePath\":\"" +  JsonStrings.escapeJson(volumePath) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
