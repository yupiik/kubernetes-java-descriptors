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
package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StorageVersionMigrationStatus implements Validable<StorageVersionMigrationStatus>, Exportable {
    private List<MigrationCondition> conditions;
    private String resourceVersion;

    public StorageVersionMigrationStatus() {
        // no-op
    }

    public StorageVersionMigrationStatus(final List<MigrationCondition> conditions,
                                         final String resourceVersion) {
        this.conditions = conditions;
        this.resourceVersion = resourceVersion;
    }

    public List<MigrationCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<MigrationCondition> conditions) {
        this.conditions = conditions;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions,
                resourceVersion);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageVersionMigrationStatus)) {
            return false;
        }
        final StorageVersionMigrationStatus __otherCasted = (StorageVersionMigrationStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion);
    }

    public StorageVersionMigrationStatus conditions(final List<MigrationCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public StorageVersionMigrationStatus resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    @Override
    public StorageVersionMigrationStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (resourceVersion != null ? "\"resourceVersion\":\"" +  JsonStrings.escapeJson(resourceVersion) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
