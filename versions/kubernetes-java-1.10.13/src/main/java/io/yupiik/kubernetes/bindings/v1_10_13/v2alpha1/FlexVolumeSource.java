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
package io.yupiik.kubernetes.bindings.v1_10_13.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_10_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_13.Validable;
import io.yupiik.kubernetes.bindings.v1_10_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlexVolumeSource implements Validable<FlexVolumeSource>, Exportable {
    private String driver;
    private String fsType;
    private Map<String, String> options;
    private Boolean readOnly;
    private LocalObjectReference secretRef;

    public FlexVolumeSource() {
        // no-op
    }

    public FlexVolumeSource(final String driver,
                            final String fsType,
                            final Map<String, String> options,
                            final Boolean readOnly,
                            final LocalObjectReference secretRef) {
        this.driver = driver;
        this.fsType = fsType;
        this.options = options;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(final Map<String, String> options) {
        this.options = options;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                fsType,
                options,
                readOnly,
                secretRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlexVolumeSource)) {
            return false;
        }
        final FlexVolumeSource __otherCasted = (FlexVolumeSource) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }

    public FlexVolumeSource driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public FlexVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FlexVolumeSource options(final Map<String, String> options) {
        this.options = options;
        return this;
    }

    public FlexVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public FlexVolumeSource secretRef(final LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    @Override
    public FlexVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (options != null ? "\"options\":" + options.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
