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
package io.yupiik.kubernetes.bindings.v1_7_14.v1;

import io.yupiik.kubernetes.bindings.v1_7_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_14.Validable;
import io.yupiik.kubernetes.bindings.v1_7_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamespaceStatus implements Validable<NamespaceStatus>, Exportable {
    private String phase;

    public NamespaceStatus() {
        // no-op
    }

    public NamespaceStatus(final String phase) {
        // no-op
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceStatus)) {
            return false;
        }
        final NamespaceStatus __otherCasted = (NamespaceStatus) __other;
        return Objects.equals(phase, __otherCasted.phase);
    }

    public NamespaceStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    @Override
    public NamespaceStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
