package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyMetadataInitializers {
    private List<PodSecurityPolicyMetadataInitializersPending> pending;
    private PodSecurityPolicyMetadataInitializersResult result;

    public PodSecurityPolicyMetadataInitializers() {
        // no-op
    }

    public PodSecurityPolicyMetadataInitializers(final List<PodSecurityPolicyMetadataInitializersPending> pending,
                                                 final PodSecurityPolicyMetadataInitializersResult result) {
        // no-op
    }

    public List<PodSecurityPolicyMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodSecurityPolicyMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodSecurityPolicyMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodSecurityPolicyMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyMetadataInitializers)) {
            return false;
        }
        final PodSecurityPolicyMetadataInitializers __otherCasted = (PodSecurityPolicyMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
