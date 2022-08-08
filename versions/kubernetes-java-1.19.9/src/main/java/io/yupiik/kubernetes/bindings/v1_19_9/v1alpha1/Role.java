package io.yupiik.kubernetes.bindings.v1_19_9.v1alpha1;

import java.util.List;
import java.util.Objects;

public class Role {
    private String apiVersion;
    private String kind;
    private RoleMetadata metadata;
    private List<RoleRules> rules;

    public Role() {
        // no-op
    }

    public Role(final String apiVersion,
                final String kind,
                final RoleMetadata metadata,
                final List<RoleRules> rules) {
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

    public RoleMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RoleMetadata metadata) {
        this.metadata = metadata;
    }

    public List<RoleRules> getRules() {
        return rules;
    }

    public void setRules(final List<RoleRules> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Role)) {
            return false;
        }
        final Role __otherCasted = (Role) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(rules, __otherCasted.rules);
    }
}
