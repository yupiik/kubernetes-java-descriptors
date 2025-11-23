package io.yupiik.kubernetes.bindings.v1_26_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_26_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_9.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSchedulingStatus implements Validable<PodSchedulingStatus>, Exportable {
    private List<ResourceClaimSchedulingStatus> resourceClaims;

    public PodSchedulingStatus() {
        // no-op
    }

    public PodSchedulingStatus(final List<ResourceClaimSchedulingStatus> resourceClaims) {
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
        if (!(__other instanceof PodSchedulingStatus)) {
            return false;
        }
        final PodSchedulingStatus __otherCasted = (PodSchedulingStatus) __other;
        return Objects.equals(resourceClaims, __otherCasted.resourceClaims);
    }

    public PodSchedulingStatus resourceClaims(final List<ResourceClaimSchedulingStatus> resourceClaims) {
        this.resourceClaims = resourceClaims;
        return this;
    }

    @Override
    public PodSchedulingStatus validate() {
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
