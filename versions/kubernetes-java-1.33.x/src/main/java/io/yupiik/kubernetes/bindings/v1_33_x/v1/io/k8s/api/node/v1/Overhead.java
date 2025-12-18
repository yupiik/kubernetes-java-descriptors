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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.node.v1.Overhead implements Validable<io.k8s.api.node.v1.Overhead>, Exportable {
    private JsonObject podFixed;

    public io.k8s.api.node.v1.Overhead() {
        // no-op
    }

    public io.k8s.api.node.v1.Overhead(final JsonObject podFixed) {
        this.podFixed = podFixed;
    }

    public JsonObject getPodFixed() {
        return podFixed;
    }

    public void setPodFixed(final JsonObject podFixed) {
        this.podFixed = podFixed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                podFixed);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.node.v1.Overhead)) {
            return false;
        }
        final io.k8s.api.node.v1.Overhead __otherCasted = (io.k8s.api.node.v1.Overhead) __other;
        return Objects.equals(podFixed, __otherCasted.podFixed);
    }

    public io.k8s.api.node.v1.Overhead podFixed(final JsonObject podFixed) {
        this.podFixed = podFixed;
        return this;
    }

    @Override
    public io.k8s.api.node.v1.Overhead validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (podFixed != null ? "\"podFixed\":" + podFixed : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
