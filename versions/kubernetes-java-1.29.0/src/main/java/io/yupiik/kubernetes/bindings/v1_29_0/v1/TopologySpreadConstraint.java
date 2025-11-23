package io.yupiik.kubernetes.bindings.v1_29_0.v1;

import io.yupiik.kubernetes.bindings.v1_29_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_0.Validable;
import io.yupiik.kubernetes.bindings.v1_29_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TopologySpreadConstraint implements Validable<TopologySpreadConstraint>, Exportable {
    private LabelSelector labelSelector;
    private List<String> matchLabelKeys;
    private int maxSkew;
    private Integer minDomains;
    private String nodeAffinityPolicy;
    private String nodeTaintsPolicy;
    private String topologyKey;
    private String whenUnsatisfiable;

    public TopologySpreadConstraint() {
        // no-op
    }

    public TopologySpreadConstraint(final LabelSelector labelSelector,
                                    final List<String> matchLabelKeys,
                                    final int maxSkew,
                                    final Integer minDomains,
                                    final String nodeAffinityPolicy,
                                    final String nodeTaintsPolicy,
                                    final String topologyKey,
                                    final String whenUnsatisfiable) {
        this.labelSelector = labelSelector;
        this.matchLabelKeys = matchLabelKeys;
        this.maxSkew = maxSkew;
        this.minDomains = minDomains;
        this.nodeAffinityPolicy = nodeAffinityPolicy;
        this.nodeTaintsPolicy = nodeTaintsPolicy;
        this.topologyKey = topologyKey;
        this.whenUnsatisfiable = whenUnsatisfiable;
    }

    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public List<String> getMatchLabelKeys() {
        return matchLabelKeys;
    }

    public void setMatchLabelKeys(final List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
    }

    public int getMaxSkew() {
        return maxSkew;
    }

    public void setMaxSkew(final int maxSkew) {
        this.maxSkew = maxSkew;
    }

    public Integer getMinDomains() {
        return minDomains;
    }

    public void setMinDomains(final Integer minDomains) {
        this.minDomains = minDomains;
    }

    public String getNodeAffinityPolicy() {
        return nodeAffinityPolicy;
    }

    public void setNodeAffinityPolicy(final String nodeAffinityPolicy) {
        this.nodeAffinityPolicy = nodeAffinityPolicy;
    }

    public String getNodeTaintsPolicy() {
        return nodeTaintsPolicy;
    }

    public void setNodeTaintsPolicy(final String nodeTaintsPolicy) {
        this.nodeTaintsPolicy = nodeTaintsPolicy;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    public String getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(final String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                matchLabelKeys,
                maxSkew,
                minDomains,
                nodeAffinityPolicy,
                nodeTaintsPolicy,
                topologyKey,
                whenUnsatisfiable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TopologySpreadConstraint)) {
            return false;
        }
        final TopologySpreadConstraint __otherCasted = (TopologySpreadConstraint) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(matchLabelKeys, __otherCasted.matchLabelKeys) &&
            Objects.equals(maxSkew, __otherCasted.maxSkew) &&
            Objects.equals(minDomains, __otherCasted.minDomains) &&
            Objects.equals(nodeAffinityPolicy, __otherCasted.nodeAffinityPolicy) &&
            Objects.equals(nodeTaintsPolicy, __otherCasted.nodeTaintsPolicy) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey) &&
            Objects.equals(whenUnsatisfiable, __otherCasted.whenUnsatisfiable);
    }

    public TopologySpreadConstraint labelSelector(final LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public TopologySpreadConstraint matchLabelKeys(final List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
        return this;
    }

    public TopologySpreadConstraint maxSkew(final int maxSkew) {
        this.maxSkew = maxSkew;
        return this;
    }

    public TopologySpreadConstraint minDomains(final Integer minDomains) {
        this.minDomains = minDomains;
        return this;
    }

    public TopologySpreadConstraint nodeAffinityPolicy(final String nodeAffinityPolicy) {
        this.nodeAffinityPolicy = nodeAffinityPolicy;
        return this;
    }

    public TopologySpreadConstraint nodeTaintsPolicy(final String nodeTaintsPolicy) {
        this.nodeTaintsPolicy = nodeTaintsPolicy;
        return this;
    }

    public TopologySpreadConstraint topologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

    public TopologySpreadConstraint whenUnsatisfiable(final String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
        return this;
    }

    @Override
    public TopologySpreadConstraint validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (topologyKey == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "topologyKey", "topologyKey",
                "Missing 'topologyKey' attribute.", true));
        }
        if (whenUnsatisfiable == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "whenUnsatisfiable", "whenUnsatisfiable",
                "Missing 'whenUnsatisfiable' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (labelSelector != null ? "\"labelSelector\":" + labelSelector.asJson() : ""),
                    (matchLabelKeys != null ? "\"matchLabelKeys\":" + matchLabelKeys.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    "\"maxSkew\":" + maxSkew,
                    (minDomains != null ? "\"minDomains\":" + minDomains : ""),
                    (nodeAffinityPolicy != null ? "\"nodeAffinityPolicy\":\"" +  JsonStrings.escapeJson(nodeAffinityPolicy) + "\"" : ""),
                    (nodeTaintsPolicy != null ? "\"nodeTaintsPolicy\":\"" +  JsonStrings.escapeJson(nodeTaintsPolicy) + "\"" : ""),
                    (topologyKey != null ? "\"topologyKey\":\"" +  JsonStrings.escapeJson(topologyKey) + "\"" : ""),
                    (whenUnsatisfiable != null ? "\"whenUnsatisfiable\":\"" +  JsonStrings.escapeJson(whenUnsatisfiable) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
