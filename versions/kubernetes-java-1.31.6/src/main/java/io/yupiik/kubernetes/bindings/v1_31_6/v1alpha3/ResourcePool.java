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
package io.yupiik.kubernetes.bindings.v1_31_6.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_6.Validable;
import io.yupiik.kubernetes.bindings.v1_31_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourcePool implements Validable<ResourcePool>, Exportable {
    private int generation;
    private String name;
    private int resourceSliceCount;

    public ResourcePool() {
        // no-op
    }

    public ResourcePool(final int generation,
                        final String name,
                        final int resourceSliceCount) {
        this.generation = generation;
        this.name = name;
        this.resourceSliceCount = resourceSliceCount;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(final int generation) {
        this.generation = generation;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getResourceSliceCount() {
        return resourceSliceCount;
    }

    public void setResourceSliceCount(final int resourceSliceCount) {
        this.resourceSliceCount = resourceSliceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                generation,
                name,
                resourceSliceCount);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourcePool)) {
            return false;
        }
        final ResourcePool __otherCasted = (ResourcePool) __other;
        return Objects.equals(generation, __otherCasted.generation) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(resourceSliceCount, __otherCasted.resourceSliceCount);
    }

    public ResourcePool generation(final int generation) {
        this.generation = generation;
        return this;
    }

    public ResourcePool name(final String name) {
        this.name = name;
        return this;
    }

    public ResourcePool resourceSliceCount(final int resourceSliceCount) {
        this.resourceSliceCount = resourceSliceCount;
        return this;
    }

    @Override
    public ResourcePool validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"generation\":" + generation,
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    "\"resourceSliceCount\":" + resourceSliceCount)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
