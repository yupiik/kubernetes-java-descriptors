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
package io.yupiik.kubernetes.bindings.v1_30_0.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceFilter implements Validable<ResourceFilter>, Exportable {
    private String driverName;
    private NamedResourcesFilter namedResources;

    public ResourceFilter() {
        // no-op
    }

    public ResourceFilter(final String driverName,
                          final NamedResourcesFilter namedResources) {
        this.driverName = driverName;
        this.namedResources = namedResources;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    public NamedResourcesFilter getNamedResources() {
        return namedResources;
    }

    public void setNamedResources(final NamedResourcesFilter namedResources) {
        this.namedResources = namedResources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driverName,
                namedResources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceFilter)) {
            return false;
        }
        final ResourceFilter __otherCasted = (ResourceFilter) __other;
        return Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(namedResources, __otherCasted.namedResources);
    }

    public ResourceFilter driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public ResourceFilter namedResources(final NamedResourcesFilter namedResources) {
        this.namedResources = namedResources;
        return this;
    }

    @Override
    public ResourceFilter validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (namedResources != null ? "\"namedResources\":" + namedResources.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
