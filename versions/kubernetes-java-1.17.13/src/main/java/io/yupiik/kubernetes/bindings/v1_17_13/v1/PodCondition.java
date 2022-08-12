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
package io.yupiik.kubernetes.bindings.v1_17_13.v1;

import io.yupiik.kubernetes.bindings.v1_17_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_13.Validable;
import io.yupiik.kubernetes.bindings.v1_17_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodCondition implements Validable<PodCondition>, Exportable {
    private String lastProbeTime;
    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public PodCondition() {
        // no-op
    }

    public PodCondition(final String lastProbeTime,
                        final String lastTransitionTime,
                        final String message,
                        final String reason,
                        final String status,
                        final String type) {
        // no-op
    }

    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(final String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lastProbeTime,
                lastTransitionTime,
                message,
                reason,
                status,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodCondition)) {
            return false;
        }
        final PodCondition __otherCasted = (PodCondition) __other;
        return Objects.equals(lastProbeTime, __otherCasted.lastProbeTime) &&
            Objects.equals(lastTransitionTime, __otherCasted.lastTransitionTime) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason) &&
            Objects.equals(status, __otherCasted.status) &&
            Objects.equals(type, __otherCasted.type);
    }

    public PodCondition lastProbeTime(final String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    public PodCondition lastTransitionTime(final String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public PodCondition message(final String message) {
        this.message = message;
        return this;
    }

    public PodCondition reason(final String reason) {
        this.reason = reason;
        return this;
    }

    public PodCondition status(final String status) {
        this.status = status;
        return this;
    }

    public PodCondition type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public PodCondition validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (status == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "status", "status",
                "Missing 'status' attribute.", true));
        }
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (lastProbeTime != null ? "\"lastProbeTime\":\"" +  JsonStrings.escapeJson(lastProbeTime) + "\"" : ""),
                    (lastTransitionTime != null ? "\"lastTransitionTime\":\"" +  JsonStrings.escapeJson(lastTransitionTime) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""),
                    (status != null ? "\"status\":\"" +  JsonStrings.escapeJson(status) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
