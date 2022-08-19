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
package io.yupiik.kubernetes.bindings.v1_7_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIVersion implements Validable<APIVersion>, Exportable {
    private String name;

    public APIVersion() {
        // no-op
    }

    public APIVersion(final String name) {
        this.name = name;
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
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIVersion)) {
            return false;
        }
        final APIVersion __otherCasted = (APIVersion) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public APIVersion name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public APIVersion validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
