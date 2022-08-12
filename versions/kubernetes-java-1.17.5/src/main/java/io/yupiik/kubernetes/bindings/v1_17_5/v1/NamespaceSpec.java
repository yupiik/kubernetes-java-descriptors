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
package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import io.yupiik.kubernetes.bindings.v1_17_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_5.Validable;
import io.yupiik.kubernetes.bindings.v1_17_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamespaceSpec implements Validable<NamespaceSpec>, Exportable {
    private List<String> finalizers;

    public NamespaceSpec() {
        // no-op
    }

    public NamespaceSpec(final List<String> finalizers) {
        // no-op
    }

    public List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                finalizers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceSpec)) {
            return false;
        }
        final NamespaceSpec __otherCasted = (NamespaceSpec) __other;
        return Objects.equals(finalizers, __otherCasted.finalizers);
    }

    public NamespaceSpec finalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }

    @Override
    public NamespaceSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (finalizers != null ? "\"finalizers\":" + finalizers.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
