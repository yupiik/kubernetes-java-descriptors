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
package io.yupiik.kubernetes.bindings.v1_31_0.v1;

import io.yupiik.kubernetes.bindings.v1_31_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_0.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeResourceRequirements implements Validable<VolumeResourceRequirements>, Exportable {
    private JsonObject limits;
    private JsonObject requests;

    public VolumeResourceRequirements() {
        // no-op
    }

    public VolumeResourceRequirements(final JsonObject limits,
                                      final JsonObject requests) {
        this.limits = limits;
        this.requests = requests;
    }

    public JsonObject getLimits() {
        return limits;
    }

    public void setLimits(final JsonObject limits) {
        this.limits = limits;
    }

    public JsonObject getRequests() {
        return requests;
    }

    public void setRequests(final JsonObject requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limits,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeResourceRequirements)) {
            return false;
        }
        final VolumeResourceRequirements __otherCasted = (VolumeResourceRequirements) __other;
        return Objects.equals(limits, __otherCasted.limits) &&
            Objects.equals(requests, __otherCasted.requests);
    }

    public VolumeResourceRequirements limits(final JsonObject limits) {
        this.limits = limits;
        return this;
    }

    public VolumeResourceRequirements requests(final JsonObject requests) {
        this.requests = requests;
        return this;
    }

    @Override
    public VolumeResourceRequirements validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (limits != null ? "\"limits\":" + limits : ""),
                    (requests != null ? "\"requests\":" + requests : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
