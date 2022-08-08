package io.yupiik.kubernetes.bindings.v1_8_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_8_9.Validable;
import io.yupiik.kubernetes.bindings.v1_8_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RuleWithOperations implements Validable<RuleWithOperations> {
    private List<String> apiGroups;
    private List<String> apiVersions;
    private List<String> operations;
    private List<String> resources;

    public RuleWithOperations() {
        // no-op
    }

    public RuleWithOperations(final List<String> apiGroups,
                              final List<String> apiVersions,
                              final List<String> operations,
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

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(final List<String> operations) {
        this.operations = operations;
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
                operations,
                resources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuleWithOperations)) {
            return false;
        }
        final RuleWithOperations __otherCasted = (RuleWithOperations) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(apiVersions, __otherCasted.apiVersions) &&
            Objects.equals(operations, __otherCasted.operations) &&
            Objects.equals(resources, __otherCasted.resources);
    }

    public RuleWithOperations apiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public RuleWithOperations apiVersions(final List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public RuleWithOperations operations(final List<String> operations) {
        this.operations = operations;
        return this;
    }

    public RuleWithOperations resources(final List<String> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public RuleWithOperations validate() {
        return this;
    }
}
