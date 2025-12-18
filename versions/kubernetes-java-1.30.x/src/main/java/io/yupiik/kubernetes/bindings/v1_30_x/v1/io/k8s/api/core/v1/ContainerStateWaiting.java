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

public class io.k8s.api.core.v1.ContainerStateWaiting implements Validable<io.k8s.api.core.v1.ContainerStateWaiting>, Exportable {
    private String message;
    private String reason;

    public io.k8s.api.core.v1.ContainerStateWaiting() {
        // no-op
    }

    public io.k8s.api.core.v1.ContainerStateWaiting(final String message,
                                                    final String reason) {
        this.message = message;
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                message,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ContainerStateWaiting)) {
            return false;
        }
        final io.k8s.api.core.v1.ContainerStateWaiting __otherCasted = (io.k8s.api.core.v1.ContainerStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public io.k8s.api.core.v1.ContainerStateWaiting message(final String message) {
        this.message = message;
        return this;
    }

    public io.k8s.api.core.v1.ContainerStateWaiting reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ContainerStateWaiting validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
