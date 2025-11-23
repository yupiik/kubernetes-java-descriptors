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
package io.yupiik.kubernetes.bindings.v1_31_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import io.yupiik.kubernetes.bindings.v1_31_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Validation implements Validable<Validation>, Exportable {
    private String expression;
    private String message;
    private String messageExpression;
    private String reason;

    public Validation() {
        // no-op
    }

    public Validation(final String expression,
                      final String message,
                      final String messageExpression,
                      final String reason) {
        this.expression = expression;
        this.message = message;
        this.messageExpression = messageExpression;
        this.reason = reason;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(final String expression) {
        this.expression = expression;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getMessageExpression() {
        return messageExpression;
    }

    public void setMessageExpression(final String messageExpression) {
        this.messageExpression = messageExpression;
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
                expression,
                message,
                messageExpression,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Validation)) {
            return false;
        }
        final Validation __otherCasted = (Validation) __other;
        return Objects.equals(expression, __otherCasted.expression) &&
            Objects.equals(message, __otherCasted.message) &&
            Objects.equals(messageExpression, __otherCasted.messageExpression) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public Validation expression(final String expression) {
        this.expression = expression;
        return this;
    }

    public Validation message(final String message) {
        this.message = message;
        return this;
    }

    public Validation messageExpression(final String messageExpression) {
        this.messageExpression = messageExpression;
        return this;
    }

    public Validation reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public Validation validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (expression == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "expression", "expression",
                "Missing 'expression' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expression != null ? "\"expression\":\"" +  JsonStrings.escapeJson(expression) + "\"" : ""),
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (messageExpression != null ? "\"messageExpression\":\"" +  JsonStrings.escapeJson(messageExpression) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
