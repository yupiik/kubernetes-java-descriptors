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
package io.yupiik.kubernetes.bindings.v1_17_12.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_17_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_12.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CronJob implements Validable<CronJob>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private CronJobSpec spec;
    private CronJobStatus status;

    public CronJob() {
        // no-op
    }

    public CronJob(final String apiVersion,
                   final String kind,
                   final ObjectMeta metadata,
                   final CronJobSpec spec,
                   final CronJobStatus status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
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

    public CronJobSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobSpec spec) {
        this.spec = spec;
    }

    public CronJobStatus getStatus() {
        return status;
    }

    public void setStatus(final CronJobStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJob)) {
            return false;
        }
        final CronJob __otherCasted = (CronJob) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public CronJob apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CronJob kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CronJob metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CronJob spec(final CronJobSpec spec) {
        this.spec = spec;
        return this;
    }

    public CronJob status(final CronJobStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public CronJob validate() {
        if (kind == null) {
            kind = "CronJob";
        }
        if (apiVersion == null) {
            apiVersion = "batch/v2alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
