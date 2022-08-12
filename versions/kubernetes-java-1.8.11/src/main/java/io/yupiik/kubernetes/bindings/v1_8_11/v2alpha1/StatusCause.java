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
package io.yupiik.kubernetes.bindings.v1_8_11.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_8_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_11.Validable;
import io.yupiik.kubernetes.bindings.v1_8_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatusCause implements Validable<StatusCause>, Exportable {
    private String field;
    private String message;
    private String reason;

    public StatusCause() {
        // no-op
    }

    public StatusCause(final String field,
                       final String message,
                       final String reason) {
        // no-op
    }

    public String getField() {
        return field;
    }

    public void setField(final String field) {
        this.field = field;
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
                field,
                message,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatusCause)) {
            return false;
        }
        final StatusCause __otherCasted = (StatusCause) __other;
        return Objects.equals(field, __otherCasted.field) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public StatusCause field(final String field) {
        this.field = field;
        return this;
    }

    public StatusCause message(final String message) {
        this.message = message;
        return this;
    }

    public StatusCause reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public StatusCause validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (field != null ? "\"field\":\"" +  JsonStrings.escapeJson(field) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
