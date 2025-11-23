package io.yupiik.kubernetes.bindings.v1_29_2.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_29_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSchedulingContextStatus implements Validable<PodSchedulingContextStatus>, Exportable {
    private List<ResourceClaimSchedulingStatus> resourceClaims;

    public PodSchedulingContextStatus() {
        // no-op
    }

    public PodSchedulingContextStatus(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
    }

    public List<ResourceClaimSchedulingStatus> getResourceClaims() {
        return resourceClaims;
    }

    public void setResourceClaims(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceClaims);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSchedulingContextStatus)) {
            return false;
        }
        final PodSchedulingContextStatus __otherCasted = (PodSchedulingContextStatus) __other;
        return Objects.equals(resourceClaims, __otherCasted.resourceClaims);
    }

    public PodSchedulingContextStatus resourceClaims(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
        return this;
    }

    @Override
    public PodSchedulingContextStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceClaims != null ? "\"resourceClaims\":" + resourceClaims.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
