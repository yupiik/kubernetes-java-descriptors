package io.yupiik.kubernetes.bindings.v1_16_14.v1;

import java.util.List;
import java.util.Objects;

public class RoleRules {
    private List<String> apiGroups;
    private List<String> nonResourceURLs;
    private List<String> resourceNames;
    private List<String> resources;
    private List<String> verbs;

    public RoleRules() {
        // no-op
    }

    public RoleRules(final List<String> apiGroups,
                     final List<String> nonResourceURLs,
                     final List<String> resourceNames,
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

    public List<String> getNonResourceURLs() {
        return nonResourceURLs;
    }

    public void setNonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
    }

    public List<String> getResourceNames() {
        return resourceNames;
    }

    public void setResourceNames(final List<String> resourceNames) {
        this.resourceNames = resourceNames;
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
                nonResourceURLs,
                resourceNames,
                resources,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RoleRules)) {
            return false;
        }
        final RoleRules __otherCasted = (RoleRules) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(resourceNames, __otherCasted.resourceNames) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }
}
