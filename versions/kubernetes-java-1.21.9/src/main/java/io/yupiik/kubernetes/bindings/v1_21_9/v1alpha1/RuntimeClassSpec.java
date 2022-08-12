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
package io.yupiik.kubernetes.bindings.v1_21_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_21_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_9.Validable;
import io.yupiik.kubernetes.bindings.v1_21_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RuntimeClassSpec implements Validable<RuntimeClassSpec>, Exportable {
    private Overhead overhead;
    private String runtimeHandler;
    private Scheduling scheduling;

    public RuntimeClassSpec() {
        // no-op
    }

    public RuntimeClassSpec(final Overhead overhead,
                            final String runtimeHandler,
                            final Scheduling scheduling) {
        // no-op
    }

    public Overhead getOverhead() {
        return overhead;
    }

    public void setOverhead(final Overhead overhead) {
        this.overhead = overhead;
    }

    public String getRuntimeHandler() {
        return runtimeHandler;
    }

    public void setRuntimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
    }

    public Scheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(final Scheduling scheduling) {
        this.scheduling = scheduling;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                overhead,
                runtimeHandler,
                scheduling);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassSpec)) {
            return false;
        }
        final RuntimeClassSpec __otherCasted = (RuntimeClassSpec) __other;
        return Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(runtimeHandler, __otherCasted.runtimeHandler) &&
            Objects.equals(scheduling, __otherCasted.scheduling);
    }

    public RuntimeClassSpec overhead(final Overhead overhead) {
        this.overhead = overhead;
        return this;
    }

    public RuntimeClassSpec runtimeHandler(final String runtimeHandler) {
        this.runtimeHandler = runtimeHandler;
        return this;
    }

    public RuntimeClassSpec scheduling(final Scheduling scheduling) {
        this.scheduling = scheduling;
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
                    (overhead != null ? "\"overhead\":" + overhead.asJson() : ""),
                    (runtimeHandler != null ? "\"runtimeHandler\":\"" +  JsonStrings.escapeJson(runtimeHandler) + "\"" : ""),
                    (scheduling != null ? "\"scheduling\":" + scheduling.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
