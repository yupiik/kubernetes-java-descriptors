package io.yupiik.kubernetes.bindings.v1_15_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyList {
    private String apiVersion;
    private List<PodSecurityPolicyListItems> items;
    private String kind;
    private PodSecurityPolicyListMetadata metadata;

    public PodSecurityPolicyList() {
        // no-op
    }

    public PodSecurityPolicyList(final String apiVersion,
                                 final List<PodSecurityPolicyListItems> items,
                                 final String kind,
                                 final PodSecurityPolicyListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PodSecurityPolicyListItems> getItems() {
        return items;
    }

    public void setItems(final List<PodSecurityPolicyListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PodSecurityPolicyListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodSecurityPolicyListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyList)) {
            return false;
        }
        final PodSecurityPolicyList __otherCasted = (PodSecurityPolicyList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
