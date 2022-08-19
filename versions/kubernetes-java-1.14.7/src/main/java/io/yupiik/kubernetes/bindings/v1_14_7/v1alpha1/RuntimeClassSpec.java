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
package io.yupiik.kubernetes.bindings.v1_14_7.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_14_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_7.Validable;
import io.yupiik.kubernetes.bindings.v1_14_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RuntimeClassSpec implements Validable<RuntimeClassSpec>, Exportable {
    private String runtimeHandler;

    public RuntimeClassSpec() {
        // no-op
    }

    public RuntimeClassSpec(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    public String getRuntimeHandler() {
        return runtimeHandler;
    }

    public void setRuntimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                runtimeHandler);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassSpec)) {
            return false;
        }
        final RuntimeClassSpec __otherCasted = (RuntimeClassSpec) __other;
        return Objects.equals(runtimeHandler, __otherCasted.runtimeHandler);
    }

    public RuntimeClassSpec runtimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
        return this;
    }

    @Override
    public RuntimeClassSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (runtimeHandler == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "runtimeHandler", "runtimeHandler",
                "Missing 'runtimeHandler' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (runtimeHandler != null ? "\"runtimeHandler\":\"" +  JsonStrings.escapeJson(runtimeHandler) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
