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
package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import io.yupiik.kubernetes.bindings.v1_24_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import io.yupiik.kubernetes.bindings.v1_24_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RuntimeClass implements Validable<RuntimeClass>, Exportable {
    private String apiVersion;
    private String handler;
    private String kind;
    private ObjectMeta metadata;
    private Overhead overhead;
    private Scheduling scheduling;

    public RuntimeClass() {
        // no-op
    }

    public RuntimeClass(final String apiVersion,
                        final String handler,
                        final String kind,
                        final ObjectMeta metadata,
                        final Overhead overhead,
                        final Scheduling scheduling) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(final String handler) {
        this.handler = handler;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public Overhead getOverhead() {
        return overhead;
    }

    public void setOverhead(final Overhead overhead) {
        this.overhead = overhead;
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
                apiVersion,
                handler,
                kind,
                metadata,
                overhead,
                scheduling);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClass)) {
            return false;
        }
        final RuntimeClass __otherCasted = (RuntimeClass) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(handler, __otherCasted.handler) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(overhead, __otherCasted.overhead) &&
            Objects.equals(scheduling, __otherCasted.scheduling);
    }

    public RuntimeClass apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public RuntimeClass handler(final String handler) {
        this.handler = handler;
        return this;
    }

    public RuntimeClass kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public RuntimeClass metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public RuntimeClass overhead(final Overhead overhead) {
        this.overhead = overhead;
        return this;
    }

    public RuntimeClass scheduling(final Scheduling scheduling) {
        this.scheduling = scheduling;
        return this;
    }

    @Override
    public RuntimeClass validate() {
        if (kind == null) {
            kind = "RuntimeClass";
        }
        if (apiVersion == null) {
            apiVersion = "node.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (handler == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "handler", "handler",
                "Missing 'handler' attribute.", true));
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
                    (handler != null ? "\"handler\":\"" +  JsonStrings.escapeJson(handler) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (overhead != null ? "\"overhead\":" + overhead.asJson() : ""),
                    (scheduling != null ? "\"scheduling\":" + scheduling.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
