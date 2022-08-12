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
package io.yupiik.kubernetes.bindings.v1_24_1.v1;

import io.yupiik.kubernetes.bindings.v1_24_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_1.Validable;
import io.yupiik.kubernetes.bindings.v1_24_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidationRule implements Validable<ValidationRule>, Exportable {
    private String message;
    private String rule;

    public ValidationRule() {
        // no-op
    }

    public ValidationRule(final String message,
                          final String rule) {
        // no-op
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                message,
                rule);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ValidationRule)) {
            return false;
        }
        final ValidationRule __otherCasted = (ValidationRule) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public ValidationRule message(final String message) {
        this.message = message;
        return this;
    }

    public ValidationRule rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public ValidationRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rule == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rule", "rule",
                "Missing 'rule' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (rule != null ? "\"rule\":\"" +  JsonStrings.escapeJson(rule) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
