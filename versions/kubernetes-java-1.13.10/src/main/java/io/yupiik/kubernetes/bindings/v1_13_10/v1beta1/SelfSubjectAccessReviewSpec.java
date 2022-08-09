package io.yupiik.kubernetes.bindings.v1_13_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_10.Validable;
import io.yupiik.kubernetes.bindings.v1_13_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
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
        // no-op
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
