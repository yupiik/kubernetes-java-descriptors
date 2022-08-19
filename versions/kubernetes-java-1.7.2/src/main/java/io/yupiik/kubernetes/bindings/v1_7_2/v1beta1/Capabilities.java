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
package io.yupiik.kubernetes.bindings.v1_7_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Capabilities implements Validable<Capabilities>, Exportable {
    private List<String> add;
    private List<String> drop;

    public Capabilities() {
        // no-op
    }

    public Capabilities(final List<String> add,
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
        if (!(__other instanceof Capabilities)) {
            return false;
        }
        final Capabilities __otherCasted = (Capabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }

    public Capabilities add(final List<String> add) {
        this.add = add;
        return this;
    }

    public Capabilities drop(final List<String> drop) {
        this.drop = drop;
        return this;
    }

    @Override
    public Capabilities validate() {
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
