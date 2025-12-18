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
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.PersistentVolumeStatus implements Validable<io.k8s.api.core.v1.PersistentVolumeStatus>, Exportable {
    private String lastPhaseTransitionTime;
    private String message;
    private String phase;
    private String reason;

    public io.k8s.api.core.v1.PersistentVolumeStatus() {
        // no-op
    }

    public io.k8s.api.core.v1.PersistentVolumeStatus(final String lastPhaseTransitionTime,
                                                     final String message,
                                                     final String phase,
                                                     final String reason) {
        this.lastPhaseTransitionTime = lastPhaseTransitionTime;
        this.message = message;
        this.phase = phase;
        this.reason = reason;
    }

    public String getLastPhaseTransitionTime() {
        return lastPhaseTransitionTime;
    }

    public void setLastPhaseTransitionTime(final String lastPhaseTransitionTime) {
        this.lastPhaseTransitionTime = lastPhaseTransitionTime;
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
                lastPhaseTransitionTime,
                message,
                phase,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.PersistentVolumeStatus)) {
            return false;
        }
        final io.k8s.api.core.v1.PersistentVolumeStatus __otherCasted = (io.k8s.api.core.v1.PersistentVolumeStatus) __other;
        return Objects.equals(lastPhaseTransitionTime, __otherCasted.lastPhaseTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(phase, __otherCasted.phase) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public io.k8s.api.core.v1.PersistentVolumeStatus lastPhaseTransitionTime(final String lastPhaseTransitionTime) {
        this.lastPhaseTransitionTime = lastPhaseTransitionTime;
        return this;
    }

    public io.k8s.api.core.v1.PersistentVolumeStatus message(final String message) {
        this.message = message;
        return this;
    }

    public io.k8s.api.core.v1.PersistentVolumeStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    public io.k8s.api.core.v1.PersistentVolumeStatus reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.PersistentVolumeStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (lastPhaseTransitionTime != null ? "\"lastPhaseTransitionTime\":\"" +  JsonStrings.escapeJson(lastPhaseTransitionTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
