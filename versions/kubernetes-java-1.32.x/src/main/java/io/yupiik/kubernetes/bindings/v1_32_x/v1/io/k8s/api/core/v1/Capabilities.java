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
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.Capabilities implements Validable<io.k8s.api.core.v1.Capabilities>, Exportable {
    private List<String> add;
    private List<String> drop;

    public io.k8s.api.core.v1.Capabilities() {
        // no-op
    }

    public io.k8s.api.core.v1.Capabilities(final List<String> add,
                                           final List<String> drop) {
        this.add = add;
        this.drop = drop;
    }

    public List<String> getAdd() {
        return add;
    }

    public void setAdd(final List<String> add) {
        this.add = add;
    }

    public List<String> getDrop() {
        return drop;
    }

    public void setDrop(final List<String> drop) {
        this.drop = drop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                add,
                drop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.Capabilities)) {
            return false;
        }
        final io.k8s.api.core.v1.Capabilities __otherCasted = (io.k8s.api.core.v1.Capabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }

    public io.k8s.api.core.v1.Capabilities add(final List<String> add) {
        this.add = add;
        return this;
    }

    public io.k8s.api.core.v1.Capabilities drop(final List<String> drop) {
        this.drop = drop;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.Capabilities validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (add != null ? "\"add\":" + add.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (drop != null ? "\"drop\":" + drop.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
