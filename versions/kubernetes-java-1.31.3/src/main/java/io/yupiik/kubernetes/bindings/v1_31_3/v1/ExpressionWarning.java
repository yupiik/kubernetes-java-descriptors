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
package io.yupiik.kubernetes.bindings.v1_31_3.v1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import io.yupiik.kubernetes.bindings.v1_31_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExpressionWarning implements Validable<ExpressionWarning>, Exportable {
    private String fieldRef;
    private String warning;

    public ExpressionWarning() {
        // no-op
    }

    public ExpressionWarning(final String fieldRef,
                             final String warning) {
        this.fieldRef = fieldRef;
        this.warning = warning;
    }

    public String getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final String fieldRef) {
        this.fieldRef = fieldRef;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(final String warning) {
        this.warning = warning;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fieldRef,
                warning);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExpressionWarning)) {
            return false;
        }
        final ExpressionWarning __otherCasted = (ExpressionWarning) __other;
        return Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(warning, __otherCasted.warning);
    }

    public ExpressionWarning fieldRef(final String fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public ExpressionWarning warning(final String warning) {
        this.warning = warning;
        return this;
    }

    @Override
    public ExpressionWarning validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (fieldRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "fieldRef", "fieldRef",
                "Missing 'fieldRef' attribute.", true));
        }
        if (warning == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "warning", "warning",
                "Missing 'warning' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fieldRef != null ? "\"fieldRef\":\"" +  JsonStrings.escapeJson(fieldRef) + "\"" : ""),
                    (warning != null ? "\"warning\":\"" +  JsonStrings.escapeJson(warning) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
