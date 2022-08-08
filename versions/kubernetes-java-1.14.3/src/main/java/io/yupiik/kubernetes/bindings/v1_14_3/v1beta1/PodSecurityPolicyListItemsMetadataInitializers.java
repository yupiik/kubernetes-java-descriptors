package io.yupiik.kubernetes.bindings.v1_14_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyListItemsMetadataInitializers {
    private List<PodSecurityPolicyListItemsMetadataInitializersPending> pending;
    private PodSecurityPolicyListItemsMetadataInitializersResult result;

    public PodSecurityPolicyListItemsMetadataInitializers() {
        // no-op
    }

    public PodSecurityPolicyListItemsMetadataInitializers(final List<PodSecurityPolicyListItemsMetadataInitializersPending> pending,
                                                          final PodSecurityPolicyListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<PodSecurityPolicyListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<PodSecurityPolicyListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public PodSecurityPolicyListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final PodSecurityPolicyListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof PodSecurityPolicyListItemsMetadataInitializers)) {
            return false;
        }
        final PodSecurityPolicyListItemsMetadataInitializers __otherCasted = (PodSecurityPolicyListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
