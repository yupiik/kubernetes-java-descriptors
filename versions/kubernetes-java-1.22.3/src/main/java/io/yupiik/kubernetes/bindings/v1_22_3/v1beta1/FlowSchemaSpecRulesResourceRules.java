package io.yupiik.kubernetes.bindings.v1_22_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class FlowSchemaSpecRulesResourceRules {
    private List<String> apiGroups;
    private Boolean clusterScope;
    private List<String> namespaces;
    private List<String> resources;
    private List<String> verbs;

    public FlowSchemaSpecRulesResourceRules() {
        // no-op
    }

    public FlowSchemaSpecRulesResourceRules(final List<String> apiGroups,
                                            final Boolean clusterScope,
                                            final List<String> namespaces,
                                            final List<String> resources,
                                            final List<String> verbs) {
        // no-op
    }

    public List<String> getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
    }

    public Boolean getClusterScope() {
        return clusterScope;
    }

    public void setClusterScope(final Boolean clusterScope) {
        this.clusterScope = clusterScope;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(final List<String> resources) {
        this.resources = resources;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(final List<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroups,
                clusterScope,
                namespaces,
                resources,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaSpecRulesResourceRules)) {
            return false;
        }
        final FlowSchemaSpecRulesResourceRules __otherCasted = (FlowSchemaSpecRulesResourceRules) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(clusterScope, __otherCasted.clusterScope) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }
}
