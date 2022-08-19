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
package io.yupiik.kubernetes.bindings.v1_14_8.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_14_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_8.Validable;
import io.yupiik.kubernetes.bindings.v1_14_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PortworxVolumeSource implements Validable<PortworxVolumeSource>, Exportable {
    private String fsType;
    private Boolean readOnly;
    private String volumeID;

    public PortworxVolumeSource() {
        // no-op
    }

    public PortworxVolumeSource(final String fsType,
                                final Boolean readOnly,
                                final String volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.volumeID = volumeID;
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

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(final String volumeID) {
        this.volumeID = volumeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                readOnly,
                volumeID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PortworxVolumeSource)) {
            return false;
        }
        final PortworxVolumeSource __otherCasted = (PortworxVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeID, __otherCasted.volumeID);
    }

    public PortworxVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public PortworxVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public PortworxVolumeSource volumeID(final String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

    @Override
    public PortworxVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (volumeID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumeID", "volumeID",
                "Missing 'volumeID' attribute.", true));
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
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (volumeID != null ? "\"volumeID\":\"" +  JsonStrings.escapeJson(volumeID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
