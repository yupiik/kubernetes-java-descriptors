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
package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import io.yupiik.kubernetes.bindings.v1_23_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_8.Validable;
import io.yupiik.kubernetes.bindings.v1_23_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSIDriver implements Validable<CSIDriver>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private CSIDriverSpec spec;

    public CSIDriver() {
        // no-op
    }

    public CSIDriver(final String apiVersion,
                     final String kind,
                     final ObjectMeta metadata,
                     final CSIDriverSpec spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
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

    public CSIDriverSpec getSpec() {
        return spec;
    }

    public void setSpec(final CSIDriverSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriver)) {
            return false;
        }
        final CSIDriver __otherCasted = (CSIDriver) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public CSIDriver apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CSIDriver kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CSIDriver metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CSIDriver spec(final CSIDriverSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public CSIDriver validate() {
        if (kind == null) {
            kind = "CSIDriver";
        }
        if (apiVersion == null) {
            apiVersion = "storage.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
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
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
