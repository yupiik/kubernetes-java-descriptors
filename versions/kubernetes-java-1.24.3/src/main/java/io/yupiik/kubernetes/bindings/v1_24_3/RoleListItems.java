package io.yupiik.kubernetes.bindings.v1_24_3;

import java.util.List;
import java.util.Objects;

public class RoleListItems {
    private String apiVersion;
    private String kind;
    private RoleListItemsMetadata metadata;
    private List<RoleListItemsRules> rules;

    public RoleListItems() {
        // no-op
    }

    public RoleListItems(final String apiVersion,
                         final String kind,
                         final RoleListItemsMetadata metadata,
                         final List<RoleListItemsRules> rules) {
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

    public RoleListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final RoleListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<RoleListItemsRules> getRules() {
        return rules;
    }

    public void setRules(final List<RoleListItemsRules> rules) {
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
        if (!(__other instanceof RoleListItems)) {
            return false;
        }
        final RoleListItems __otherCasted = (RoleListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(rules, __otherCasted.rules);
    }
}
