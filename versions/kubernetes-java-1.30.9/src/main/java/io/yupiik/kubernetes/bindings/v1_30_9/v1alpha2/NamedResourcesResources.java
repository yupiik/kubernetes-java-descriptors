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
package io.yupiik.kubernetes.bindings.v1_30_9.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_9.Validable;
import io.yupiik.kubernetes.bindings.v1_30_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesResources implements Validable<NamedResourcesResources>, Exportable {
    private List<NamedResourcesInstance> instances;

    public NamedResourcesResources() {
        // no-op
    }

    public NamedResourcesResources(final List<NamedResourcesInstance> instances) {
        this.instances = instances;
    }

    public List<NamedResourcesInstance> getInstances() {
        return instances;
    }

    public void setInstances(final List<NamedResourcesInstance> instances) {
        this.instances = instances;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                instances);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesResources)) {
            return false;
        }
        final NamedResourcesResources __otherCasted = (NamedResourcesResources) __other;
        return Objects.equals(instances, __otherCasted.instances);
    }

    public NamedResourcesResources instances(final List<NamedResourcesInstance> instances) {
        this.instances = instances;
        return this;
    }

    @Override
    public NamedResourcesResources validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (instances == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "instances", "instances",
                "Missing 'instances' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (instances != null ? "\"instances\":" + instances.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
