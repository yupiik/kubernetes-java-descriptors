package io.yupiik.kubernetes.bindings.v1_20_15.v1beta1;

import java.util.Objects;

public class PodSecurityPolicyListItems {
    private String apiVersion;
    private String kind;
    private PodSecurityPolicyListItemsMetadata metadata;
    private PodSecurityPolicyListItemsSpec spec;

    public PodSecurityPolicyListItems() {
        // no-op
    }

    public PodSecurityPolicyListItems(final String apiVersion,
                                      final String kind,
                                      final PodSecurityPolicyListItemsMetadata metadata,
                                      final PodSecurityPolicyListItemsSpec spec) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodSecurityPolicyListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodSecurityPolicyListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public PodSecurityPolicyListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodSecurityPolicyListItemsSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyListItems)) {
            return false;
        }
        final PodSecurityPolicyListItems __otherCasted = (PodSecurityPolicyListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
