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
package io.yupiik.kubernetes.bindings.v1_28_x.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1alpha1.IPAddressSpec implements Validable<io.k8s.api.networking.v1alpha1.IPAddressSpec>, Exportable {
    private ParentReference parentRef;

    public io.k8s.api.networking.v1alpha1.IPAddressSpec() {
        // no-op
    }

    public io.k8s.api.networking.v1alpha1.IPAddressSpec(final ParentReference parentRef) {
        this.parentRef = parentRef;
    }

    public ParentReference getParentRef() {
        return parentRef;
    }

    public void setParentRef(final ParentReference parentRef) {
        this.parentRef = parentRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                parentRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1alpha1.IPAddressSpec)) {
            return false;
        }
        final io.k8s.api.networking.v1alpha1.IPAddressSpec __otherCasted = (io.k8s.api.networking.v1alpha1.IPAddressSpec) __other;
        return Objects.equals(parentRef, __otherCasted.parentRef);
    }

    public io.k8s.api.networking.v1alpha1.IPAddressSpec parentRef(final ParentReference parentRef) {
        this.parentRef = parentRef;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1alpha1.IPAddressSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (parentRef != null ? "\"parentRef\":" + parentRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
