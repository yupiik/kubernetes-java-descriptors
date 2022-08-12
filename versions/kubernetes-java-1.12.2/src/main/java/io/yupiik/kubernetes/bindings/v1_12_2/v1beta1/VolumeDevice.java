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
package io.yupiik.kubernetes.bindings.v1_12_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_12_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_2.Validable;
import io.yupiik.kubernetes.bindings.v1_12_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeDevice implements Validable<VolumeDevice>, Exportable {
    private String devicePath;
    private String name;

    public VolumeDevice() {
        // no-op
    }

    public VolumeDevice(final String devicePath,
                        final String name) {
        // no-op
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(final String devicePath) {
        this.devicePath = devicePath;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                devicePath,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeDevice)) {
            return false;
        }
        final VolumeDevice __otherCasted = (VolumeDevice) __other;
        return Objects.equals(devicePath, __otherCasted.devicePath) &&
            Objects.equals(name, __otherCasted.name);
    }

    public VolumeDevice devicePath(final String devicePath) {
        this.devicePath = devicePath;
        return this;
    }

    public VolumeDevice name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public VolumeDevice validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (devicePath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "devicePath", "devicePath",
                "Missing 'devicePath' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (devicePath != null ? "\"devicePath\":\"" +  JsonStrings.escapeJson(devicePath) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
