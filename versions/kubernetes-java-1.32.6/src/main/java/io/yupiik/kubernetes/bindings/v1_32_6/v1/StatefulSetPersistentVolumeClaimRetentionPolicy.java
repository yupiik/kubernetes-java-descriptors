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
package io.yupiik.kubernetes.bindings.v1_32_6.v1;

import io.yupiik.kubernetes.bindings.v1_32_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetPersistentVolumeClaimRetentionPolicy implements Validable<StatefulSetPersistentVolumeClaimRetentionPolicy>, Exportable {
    private String whenDeleted;
    private String whenScaled;

    public StatefulSetPersistentVolumeClaimRetentionPolicy() {
        // no-op
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy(final String whenDeleted,
                                                           final String whenScaled) {
        this.whenDeleted = whenDeleted;
        this.whenScaled = whenScaled;
    }

    public String getWhenDeleted() {
        return whenDeleted;
    }

    public void setWhenDeleted(final String whenDeleted) {
        this.whenDeleted = whenDeleted;
    }

    public String getWhenScaled() {
        return whenScaled;
    }

    public void setWhenScaled(final String whenScaled) {
        this.whenScaled = whenScaled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                whenDeleted,
                whenScaled);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetPersistentVolumeClaimRetentionPolicy)) {
            return false;
        }
        final StatefulSetPersistentVolumeClaimRetentionPolicy __otherCasted = (StatefulSetPersistentVolumeClaimRetentionPolicy) __other;
        return Objects.equals(whenDeleted, __otherCasted.whenDeleted) &&
            Objects.equals(whenScaled, __otherCasted.whenScaled);
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy whenDeleted(final String whenDeleted) {
        this.whenDeleted = whenDeleted;
        return this;
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy whenScaled(final String whenScaled) {
        this.whenScaled = whenScaled;
        return this;
    }

    @Override
    public StatefulSetPersistentVolumeClaimRetentionPolicy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (whenDeleted != null ? "\"whenDeleted\":\"" +  JsonStrings.escapeJson(whenDeleted) + "\"" : ""),
                    (whenScaled != null ? "\"whenScaled\":\"" +  JsonStrings.escapeJson(whenScaled) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
