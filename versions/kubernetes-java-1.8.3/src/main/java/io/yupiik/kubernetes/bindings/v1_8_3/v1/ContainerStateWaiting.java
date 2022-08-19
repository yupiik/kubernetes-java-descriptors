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
package io.yupiik.kubernetes.bindings.v1_8_3.v1;

import io.yupiik.kubernetes.bindings.v1_8_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStateWaiting implements Validable<ContainerStateWaiting>, Exportable {
    private String message;
    private String reason;

    public ContainerStateWaiting() {
        // no-op
    }

    public ContainerStateWaiting(final String message,
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
        if (!(__other instanceof ContainerStateWaiting)) {
            return false;
        }
        final ContainerStateWaiting __otherCasted = (ContainerStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public ContainerStateWaiting message(final String message) {
        this.message = message;
        return this;
    }

    public ContainerStateWaiting reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public ContainerStateWaiting validate() {
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
