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
package io.yupiik.kubernetes.bindings.v1_8_0.v1beta2;

import io.yupiik.kubernetes.bindings.v1_8_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_0.Validable;
import io.yupiik.kubernetes.bindings.v1_8_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectFieldSelector implements Validable<ObjectFieldSelector>, Exportable {
    private String apiVersion;
    private String fieldPath;

    public ObjectFieldSelector() {
        // no-op
    }

    public ObjectFieldSelector(final String apiVersion,
                               final String fieldPath) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                fieldPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectFieldSelector)) {
            return false;
        }
        final ObjectFieldSelector __otherCasted = (ObjectFieldSelector) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath);
    }

    public ObjectFieldSelector apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ObjectFieldSelector fieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    @Override
    public ObjectFieldSelector validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (fieldPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "fieldPath", "fieldPath",
                "Missing 'fieldPath' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (fieldPath != null ? "\"fieldPath\":\"" +  JsonStrings.escapeJson(fieldPath) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
