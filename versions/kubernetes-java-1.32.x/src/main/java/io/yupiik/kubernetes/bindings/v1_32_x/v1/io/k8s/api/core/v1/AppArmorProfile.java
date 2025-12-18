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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import io.yupiik.kubernetes.bindings.v1_32_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.AppArmorProfile implements Validable<io.k8s.api.core.v1.AppArmorProfile>, Exportable {
    private String localhostProfile;
    private String type;

    public io.k8s.api.core.v1.AppArmorProfile() {
        // no-op
    }

    public io.k8s.api.core.v1.AppArmorProfile(final String localhostProfile,
                                              final String type) {
        this.localhostProfile = localhostProfile;
        this.type = type;
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                localhostProfile,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.AppArmorProfile)) {
            return false;
        }
        final io.k8s.api.core.v1.AppArmorProfile __otherCasted = (io.k8s.api.core.v1.AppArmorProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }

    public io.k8s.api.core.v1.AppArmorProfile localhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
        return this;
    }

    public io.k8s.api.core.v1.AppArmorProfile type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.AppArmorProfile validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (localhostProfile != null ? "\"localhostProfile\":\"" +  JsonStrings.escapeJson(localhostProfile) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
