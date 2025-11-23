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
package io.yupiik.kubernetes.bindings.v1_27_2.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_27_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_2.Validable;
import io.yupiik.kubernetes.bindings.v1_27_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AuditAnnotation implements Validable<AuditAnnotation>, Exportable {
    private String key;
    private String valueExpression;

    public AuditAnnotation() {
        // no-op
    }

    public AuditAnnotation(final String key,
                           final String valueExpression) {
        this.key = key;
        this.valueExpression = valueExpression;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(final String valueExpression) {
        this.valueExpression = valueExpression;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                valueExpression);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditAnnotation)) {
            return false;
        }
        final AuditAnnotation __otherCasted = (AuditAnnotation) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(valueExpression, __otherCasted.valueExpression);
    }

    public AuditAnnotation key(final String key) {
        this.key = key;
        return this;
    }

    public AuditAnnotation valueExpression(final String valueExpression) {
        this.valueExpression = valueExpression;
        return this;
    }

    @Override
    public AuditAnnotation validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (valueExpression == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "valueExpression", "valueExpression",
                "Missing 'valueExpression' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (valueExpression != null ? "\"valueExpression\":\"" +  JsonStrings.escapeJson(valueExpression) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
