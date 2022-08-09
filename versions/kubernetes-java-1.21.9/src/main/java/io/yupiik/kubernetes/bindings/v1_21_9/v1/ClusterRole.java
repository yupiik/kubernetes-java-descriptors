package io.yupiik.kubernetes.bindings.v1_21_9.v1;

import io.yupiik.kubernetes.bindings.v1_21_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_9.Validable;
import io.yupiik.kubernetes.bindings.v1_21_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClusterRole implements Validable<ClusterRole>, Exportable {
    private AggregationRule aggregationRule;
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<PolicyRule> rules;

    public ClusterRole() {
        // no-op
    }

    public ClusterRole(final AggregationRule aggregationRule,
                       final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
                       final List<PolicyRule> rules) {
        // no-op
    }

    public AggregationRule getAggregationRule() {
        return aggregationRule;
    }

    public void setAggregationRule(final AggregationRule aggregationRule) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public List<PolicyRule> getRules() {
        return rules;
    }

    public void setRules(final List<PolicyRule> rules) {
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

    public ClusterRole aggregationRule(final AggregationRule aggregationRule) {
        this.aggregationRule = aggregationRule;
        return this;
    }

    public ClusterRole apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ClusterRole kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ClusterRole metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterRole rules(final List<PolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public ClusterRole validate() {
        if (kind == null) {
            kind = "ClusterRole";
        }
        if (apiVersion == null) {
            apiVersion = "rbac.authorization.k8s.io/v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (aggregationRule != null ? "\"aggregationRule\":" + aggregationRule.asJson() : ""),
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
