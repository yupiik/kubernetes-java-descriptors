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
package io.yupiik.kubernetes.bindings.v1_7_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_9.Validable;
import io.yupiik.kubernetes.bindings.v1_7_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SecretEnvSource implements Validable<SecretEnvSource>, Exportable {
    private String name;
    private Boolean optional;

    public SecretEnvSource() {
        // no-op
    }

    public SecretEnvSource(final String name,
                           final Boolean optional) {
        // no-op
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
        if (!(__other instanceof SecretEnvSource)) {
            return false;
        }
        final SecretEnvSource __otherCasted = (SecretEnvSource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public SecretEnvSource name(final String name) {
        this.name = name;
        return this;
    }

    public SecretEnvSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public SecretEnvSource validate() {
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
