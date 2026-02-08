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
package io.yupiik.kubernetes.bindings.v1_35_x.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_35_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_35_x.Validable;
import io.yupiik.kubernetes.bindings.v1_35_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WorkloadSpec implements Validable<WorkloadSpec>, Exportable {
    private TypedLocalObjectReference controllerRef;
    private List<PodGroup> podGroups;

    public WorkloadSpec() {
        // no-op
    }

    public WorkloadSpec(final TypedLocalObjectReference controllerRef,
                        final List<PodGroup> podGroups) {
        this.controllerRef = controllerRef;
        this.podGroups = podGroups;
    }

    public TypedLocalObjectReference getControllerRef() {
        return controllerRef;
    }

    public void setControllerRef(final TypedLocalObjectReference controllerRef) {
        this.controllerRef = controllerRef;
    }

    public List<PodGroup> getPodGroups() {
        return podGroups;
    }

    public void setPodGroups(final List<PodGroup> podGroups) {
        this.podGroups = podGroups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                controllerRef,
                podGroups);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WorkloadSpec)) {
            return false;
        }
        final WorkloadSpec __otherCasted = (WorkloadSpec) __other;
        return Objects.equals(controllerRef, __otherCasted.controllerRef) &&
            Objects.equals(podGroups, __otherCasted.podGroups);
    }

    public WorkloadSpec controllerRef(final TypedLocalObjectReference controllerRef) {
        this.controllerRef = controllerRef;
        return this;
    }

    public WorkloadSpec podGroups(final List<PodGroup> podGroups) {
        this.podGroups = podGroups;
        return this;
    }

    @Override
    public WorkloadSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (podGroups == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "podGroups", "podGroups",
                "Missing 'podGroups' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (controllerRef != null ? "\"controllerRef\":" + controllerRef.asJson() : ""),
                    (podGroups != null ? "\"podGroups\":" + podGroups.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }

    @Override
    public String toString() {
        return asJson();
    }
}
