package io.yupiik.kubernetes.bindings.v1_30_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_30_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_9.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MatchResources implements Validable<MatchResources>, Exportable {
    private List<NamedRuleWithOperations> excludeResourceRules;
    private String matchPolicy;
    private LabelSelector namespaceSelector;
    private LabelSelector objectSelector;
    private List<NamedRuleWithOperations> resourceRules;

    public MatchResources() {
        // no-op
    }

    public MatchResources(final List<NamedRuleWithOperations> excludeResourceRules,
                          final String matchPolicy,
                          final LabelSelector namespaceSelector,
                          final LabelSelector objectSelector,
                          final List<NamedRuleWithOperations> resourceRules) {
        this.excludeResourceRules = excludeResourceRules;
        this.matchPolicy = matchPolicy;
        this.namespaceSelector = namespaceSelector;
        this.objectSelector = objectSelector;
        this.resourceRules = resourceRules;
    }

    public List<NamedRuleWithOperations> getExcludeResourceRules() {
        return excludeResourceRules;
    }

    public void setExcludeResourceRules(final List<NamedRuleWithOperations> excludeResourceRules) {
        this.excludeResourceRules = excludeResourceRules;
    }

    public String getMatchPolicy() {
        return matchPolicy;
    }

    public void setMatchPolicy(final String matchPolicy) {
        this.matchPolicy = matchPolicy;
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public LabelSelector getObjectSelector() {
        return objectSelector;
    }

    public void setObjectSelector(final LabelSelector objectSelector) {
        this.objectSelector = objectSelector;
    }

    public List<NamedRuleWithOperations> getResourceRules() {
        return resourceRules;
    }

    public void setResourceRules(final List<NamedRuleWithOperations> resourceRules) {
        this.resourceRules = resourceRules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                excludeResourceRules,
                matchPolicy,
                namespaceSelector,
                objectSelector,
                resourceRules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MatchResources)) {
            return false;
        }
        final MatchResources __otherCasted = (MatchResources) __other;
        return Objects.equals(excludeResourceRules, __otherCasted.excludeResourceRules) &&
            Objects.equals(matchPolicy, __otherCasted.matchPolicy) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(objectSelector, __otherCasted.objectSelector) &&
            Objects.equals(resourceRules, __otherCasted.resourceRules);
    }

    public MatchResources excludeResourceRules(final List<NamedRuleWithOperations> excludeResourceRules) {
        this.excludeResourceRules = excludeResourceRules;
        return this;
    }

    public MatchResources matchPolicy(final String matchPolicy) {
        this.matchPolicy = matchPolicy;
        return this;
    }

    public MatchResources namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public MatchResources objectSelector(final LabelSelector objectSelector) {
        this.objectSelector = objectSelector;
        return this;
    }

    public MatchResources resourceRules(final List<NamedRuleWithOperations> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

    @Override
    public MatchResources validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (excludeResourceRules != null ? "\"excludeResourceRules\":" + excludeResourceRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (matchPolicy != null ? "\"matchPolicy\":\"" +  JsonStrings.escapeJson(matchPolicy) + "\"" : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (objectSelector != null ? "\"objectSelector\":" + objectSelector.asJson() : ""),
                    (resourceRules != null ? "\"resourceRules\":" + resourceRules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
