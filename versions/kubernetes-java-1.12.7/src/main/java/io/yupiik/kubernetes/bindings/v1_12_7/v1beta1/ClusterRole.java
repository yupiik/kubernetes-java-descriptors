package io.yupiik.kubernetes.bindings.v1_12_7.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ClusterRole {
    private ClusterRoleAggregationRule aggregationRule;
    private String apiVersion;
    private String kind;
    private ClusterRoleMetadata metadata;
    private List<JsonValue> rules;

    public ClusterRole() {
        // no-op
    }

    public ClusterRole(final ClusterRoleAggregationRule aggregationRule,
                       final String apiVersion,
                       final String kind,
                       final ClusterRoleMetadata metadata,
                       final List<JsonValue> rules) {
        // no-op
    }

    public ClusterRoleAggregationRule getAggregationRule() {
        return aggregationRule;
    }

    public void setAggregationRule(final ClusterRoleAggregationRule aggregationRule) {
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

    public ClusterRoleMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ClusterRoleMetadata metadata) {
        this.metadata = metadata;
    }

    public List<JsonValue> getRules() {
        return rules;
    }

    public void setRules(final List<JsonValue> rules) {
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
        if (!(__other instanceof ClusterRole)) {
            return false;
        }
        final ClusterRole __otherCasted = (ClusterRole) __other;
        return Objects.equals(aggregationRule, __otherCasted.aggregationRule) &&
            Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(rules, __otherCasted.rules);
    }
}
