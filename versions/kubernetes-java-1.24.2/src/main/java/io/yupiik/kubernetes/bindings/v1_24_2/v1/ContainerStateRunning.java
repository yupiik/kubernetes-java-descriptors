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
package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import io.yupiik.kubernetes.bindings.v1_24_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStateRunning implements Validable<ContainerStateRunning>, Exportable {
    private String startedAt;

    public ContainerStateRunning() {
        // no-op
    }

    public ContainerStateRunning(final String startedAt) {
        this.startedAt = startedAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(final String startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                startedAt);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStateRunning)) {
            return false;
        }
        final ContainerStateRunning __otherCasted = (ContainerStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }

    public ContainerStateRunning startedAt(final String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    @Override
    public ContainerStateRunning validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (startedAt != null ? "\"startedAt\":\"" +  JsonStrings.escapeJson(startedAt) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
