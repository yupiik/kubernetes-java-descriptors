package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.List;
import java.util.Objects;

public class ClusterRoleListItems {
    private ClusterRoleListItemsAggregationRule aggregationRule;
    private String apiVersion;
    private String kind;
    private ClusterRoleListItemsMetadata metadata;
    private List<ClusterRoleListItemsRules> rules;

    public ClusterRoleListItems() {
        // no-op
    }

    public ClusterRoleListItems(final ClusterRoleListItemsAggregationRule aggregationRule,
                                final String apiVersion,
                                final String kind,
                                final ClusterRoleListItemsMetadata metadata,
                                final List<ClusterRoleListItemsRules> rules) {
        // no-op
    }

    public ClusterRoleListItemsAggregationRule getAggregationRule() {
        return aggregationRule;
    }

    public void setAggregationRule(final ClusterRoleListItemsAggregationRule aggregationRule) {
        this.aggregationRule = aggregationRule;
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

    public ClusterRoleListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ClusterRoleListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<ClusterRoleListItemsRules> getRules() {
        return rules;
    }

    public void setRules(final List<ClusterRoleListItemsRules> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                aggregationRule,
                apiVersion,
                kind,
                metadata,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterRoleListItems)) {
            return false;
        }
        final ClusterRoleListItems __otherCasted = (ClusterRoleListItems) __other;
        return Objects.equals(aggregationRule, __otherCasted.aggregationRule) &&
            Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(rules, __otherCasted.rules);
    }
}
