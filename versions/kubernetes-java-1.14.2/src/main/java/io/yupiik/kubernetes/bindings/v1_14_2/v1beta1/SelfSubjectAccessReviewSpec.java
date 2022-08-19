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
package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelfSubjectAccessReviewSpec implements Validable<SelfSubjectAccessReviewSpec>, Exportable {
    private NonResourceAttributes nonResourceAttributes;
    private ResourceAttributes resourceAttributes;

    public SelfSubjectAccessReviewSpec() {
        // no-op
    }

    public SelfSubjectAccessReviewSpec(final NonResourceAttributes nonResourceAttributes,
                                       final ResourceAttributes resourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
    }

    public NonResourceAttributes getNonResourceAttributes() {
        return nonResourceAttributes;
    }

    public void setNonResourceAttributes(final NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
    }

    public ResourceAttributes getResourceAttributes() {
        return resourceAttributes;
    }

    public void setResourceAttributes(final ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nonResourceAttributes,
                resourceAttributes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelfSubjectAccessReviewSpec)) {
            return false;
        }
        final SelfSubjectAccessReviewSpec __otherCasted = (SelfSubjectAccessReviewSpec) __other;
        return Objects.equals(nonResourceAttributes, __otherCasted.nonResourceAttributes) &&
            Objects.equals(resourceAttributes, __otherCasted.resourceAttributes);
    }

    public SelfSubjectAccessReviewSpec nonResourceAttributes(final NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    public SelfSubjectAccessReviewSpec resourceAttributes(final ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

    @Override
    public SelfSubjectAccessReviewSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nonResourceAttributes != null ? "\"nonResourceAttributes\":" + nonResourceAttributes.asJson() : ""),
                    (resourceAttributes != null ? "\"resourceAttributes\":" + resourceAttributes.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
