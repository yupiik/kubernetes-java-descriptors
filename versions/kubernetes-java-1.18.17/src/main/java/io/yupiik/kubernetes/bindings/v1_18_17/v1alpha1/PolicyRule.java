package io.yupiik.kubernetes.bindings.v1_18_17.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_17.Validable;
import io.yupiik.kubernetes.bindings.v1_18_17.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolicyRule implements Validable<PolicyRule> {
    private List<String> apiGroups;
    private List<String> nonResourceURLs;
    private List<String> resourceNames;
    private List<String> resources;
    private List<String> verbs;

    public PolicyRule() {
        // no-op
    }

    public PolicyRule(final List<String> apiGroups,
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
        if (!(__other instanceof PolicyRule)) {
            return false;
        }
        final PolicyRule __otherCasted = (PolicyRule) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(nonResourceURLs, __otherCasted.nonResourceURLs) &&
            Objects.equals(resourceNames, __otherCasted.resourceNames) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public PolicyRule apiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public PolicyRule nonResourceURLs(final List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    public PolicyRule resourceNames(final List<String> resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    public PolicyRule resources(final List<String> resources) {
        this.resources = resources;
        return this;
    }

    public PolicyRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public PolicyRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (verbs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "verbs", "verbs",
                "Missing 'verbs' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
