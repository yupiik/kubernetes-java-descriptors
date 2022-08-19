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
package io.yupiik.kubernetes.bindings.v1_10_6.v1;

import io.yupiik.kubernetes.bindings.v1_10_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeleteOptions implements Validable<DeleteOptions>, Exportable {
    private String apiVersion;
    private Integer gracePeriodSeconds;
    private String kind;
    private Boolean orphanDependents;
    private Preconditions preconditions;
    private String propagationPolicy;

    public DeleteOptions() {
        // no-op
    }

    public DeleteOptions(final String apiVersion,
                         final Integer gracePeriodSeconds,
                         final String kind,
                         final Boolean orphanDependents,
                         final Preconditions preconditions,
                         final String propagationPolicy) {
        this.apiVersion = apiVersion;
        this.gracePeriodSeconds = gracePeriodSeconds;
        this.kind = kind;
        this.orphanDependents = orphanDependents;
        this.preconditions = preconditions;
        this.propagationPolicy = propagationPolicy;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Integer getGracePeriodSeconds() {
        return gracePeriodSeconds;
    }

    public void setGracePeriodSeconds(final Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public Boolean getOrphanDependents() {
        return orphanDependents;
    }

    public void setOrphanDependents(final Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
    }

    public Preconditions getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(final Preconditions preconditions) {
        this.preconditions = preconditions;
    }

    public String getPropagationPolicy() {
        return propagationPolicy;
    }

    public void setPropagationPolicy(final String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                gracePeriodSeconds,
                kind,
                orphanDependents,
                preconditions,
                propagationPolicy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeleteOptions)) {
            return false;
        }
        final DeleteOptions __otherCasted = (DeleteOptions) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(gracePeriodSeconds, __otherCasted.gracePeriodSeconds) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(orphanDependents, __otherCasted.orphanDependents) &&
            Objects.equals(preconditions, __otherCasted.preconditions) &&
            Objects.equals(propagationPolicy, __otherCasted.propagationPolicy);
    }

    public DeleteOptions apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DeleteOptions gracePeriodSeconds(final Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
        return this;
    }

    public DeleteOptions kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public DeleteOptions orphanDependents(final Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
        return this;
    }

    public DeleteOptions preconditions(final Preconditions preconditions) {
        this.preconditions = preconditions;
        return this;
    }

    public DeleteOptions propagationPolicy(final String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
        return this;
    }

    @Override
    public DeleteOptions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (gracePeriodSeconds != null ? "\"gracePeriodSeconds\":" + gracePeriodSeconds : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (orphanDependents != null ? "\"orphanDependents\":" + orphanDependents : ""),
                    (preconditions != null ? "\"preconditions\":" + preconditions.asJson() : ""),
                    (propagationPolicy != null ? "\"propagationPolicy\":\"" +  JsonStrings.escapeJson(propagationPolicy) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
