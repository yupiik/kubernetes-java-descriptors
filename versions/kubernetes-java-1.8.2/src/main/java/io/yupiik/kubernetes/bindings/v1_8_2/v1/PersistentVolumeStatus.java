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
package io.yupiik.kubernetes.bindings.v1_8_2.v1;

import io.yupiik.kubernetes.bindings.v1_8_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_2.Validable;
import io.yupiik.kubernetes.bindings.v1_8_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PersistentVolumeStatus implements Validable<PersistentVolumeStatus>, Exportable {
    private String message;
    private String phase;
    private String reason;

    public PersistentVolumeStatus() {
        // no-op
    }

    public PersistentVolumeStatus(final String message,
                                  final String phase,
                                  final String reason) {
        // no-op
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
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
                phase,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeStatus)) {
            return false;
        }
        final PersistentVolumeStatus __otherCasted = (PersistentVolumeStatus) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public PersistentVolumeStatus message(final String message) {
        this.message = message;
        return this;
    }

    public PersistentVolumeStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    public PersistentVolumeStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public PersistentVolumeStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
