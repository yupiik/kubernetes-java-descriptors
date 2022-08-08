package io.yupiik.kubernetes.bindings.v1_9_5.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_9_5.Validable;
import io.yupiik.kubernetes.bindings.v1_9_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rule implements Validable<Rule> {
    private List<String> apiGroups;
    private List<String> apiVersions;
    private List<String> resources;

    public Rule() {
        // no-op
    }

    public Rule(final List<String> apiGroups,
                final List<String> apiVersions,
                final List<String> resources) {
        // no-op
    }

    public List<String> getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
    }

    public List<String> getApiVersions() {
        return apiVersions;
    }

    public void setApiVersions(final List<String> apiVersions) {
        this.apiVersions = apiVersions;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(final List<String> resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroups,
                apiVersions,
                resources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Rule)) {
            return false;
        }
        final Rule __otherCasted = (Rule) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(apiVersions, __otherCasted.apiVersions) &&
            Objects.equals(resources, __otherCasted.resources);
    }

    public Rule apiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public Rule apiVersions(final List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public Rule resources(final List<String> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public Rule validate() {
        return this;
    }
}
