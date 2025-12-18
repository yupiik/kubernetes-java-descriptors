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
package io.yupiik.kubernetes.bindings.v1_30_x.v1;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ConfigMapEnvSource implements Validable<io.k8s.api.core.v1.ConfigMapEnvSource>, Exportable {
    private String name;
    private Boolean optional;

    public io.k8s.api.core.v1.ConfigMapEnvSource() {
        // no-op
    }

    public io.k8s.api.core.v1.ConfigMapEnvSource(final String name,
                                                 final Boolean optional) {
        this.name = name;
        this.optional = optional;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ConfigMapEnvSource)) {
            return false;
        }
        final io.k8s.api.core.v1.ConfigMapEnvSource __otherCasted = (io.k8s.api.core.v1.ConfigMapEnvSource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public io.k8s.api.core.v1.ConfigMapEnvSource name(final String name) {
        this.name = name;
        return this;
    }

    public io.k8s.api.core.v1.ConfigMapEnvSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ConfigMapEnvSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (optional != null ? "\"optional\":" + optional : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
