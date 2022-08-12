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
package io.yupiik.kubernetes.bindings.v1_17_0.v1beta2;

import io.yupiik.kubernetes.bindings.v1_17_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_0.Validable;
import io.yupiik.kubernetes.bindings.v1_17_0.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PersistentVolumeClaimStatus implements Validable<PersistentVolumeClaimStatus>, Exportable {
    private List<String> accessModes;
    private JsonObject capacity;
    private List<PersistentVolumeClaimCondition> conditions;
    private String phase;

    public PersistentVolumeClaimStatus() {
        // no-op
    }

    public PersistentVolumeClaimStatus(final List<String> accessModes,
                                       final JsonObject capacity,
                                       final List<PersistentVolumeClaimCondition> conditions,
                                       final String phase) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public JsonObject getCapacity() {
        return capacity;
    }

    public void setCapacity(final JsonObject capacity) {
        this.capacity = capacity;
    }

    public List<PersistentVolumeClaimCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<PersistentVolumeClaimCondition> conditions) {
        this.conditions = conditions;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                capacity,
                conditions,
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimStatus)) {
            return false;
        }
        final PersistentVolumeClaimStatus __otherCasted = (PersistentVolumeClaimStatus) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase);
    }

    public PersistentVolumeClaimStatus accessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimStatus capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    public PersistentVolumeClaimStatus conditions(final List<PersistentVolumeClaimCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PersistentVolumeClaimStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    @Override
    public PersistentVolumeClaimStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (accessModes != null ? "\"accessModes\":" + accessModes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (capacity != null ? "\"capacity\":" + capacity : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
