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
import io.yupiik.kubernetes.bindings.v1_33_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement implements Validable<io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement>, Exportable {
    private String key;
    private String operator;
    private List<String> values;

    public io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement() {
        // no-op
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement(final String key,
                                                                         final String operator,
                                                                         final List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String operator) {
        this.operator = operator;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(final List<String> values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                operator,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement)) {
            return false;
        }
        final io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement __otherCasted = (io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement key(final String key) {
        this.key = key;
        return this;
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement operator(final String operator) {
        this.operator = operator;
        return this;
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (operator == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "operator", "operator",
                "Missing 'operator' attribute.", true));
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
                    (operator != null ? "\"operator\":\"" +  JsonStrings.escapeJson(operator) + "\"" : ""),
                    (values != null ? "\"values\":" + values.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
