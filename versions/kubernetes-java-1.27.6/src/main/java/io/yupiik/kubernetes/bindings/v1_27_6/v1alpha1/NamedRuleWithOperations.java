package io.yupiik.kubernetes.bindings.v1_27_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_27_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_6.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedRuleWithOperations implements Validable<NamedRuleWithOperations>, Exportable {
    private List<String> apiGroups;
    private List<String> apiVersions;
    private List<String> operations;
    private List<String> resourceNames;
    private List<String> resources;
    private String scope;

    public NamedRuleWithOperations() {
        // no-op
    }

    public NamedRuleWithOperations(final List<String> apiGroups,
                                   final List<String> apiVersions,
                                   final List<String> operations,
                                   final List<String> resourceNames,
                                   final List<String> resources,
                                   final String scope) {
        this.apiGroups = apiGroups;
        this.apiVersions = apiVersions;
        this.operations = operations;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.scope = scope;
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

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroups,
                apiVersions,
                operations,
                resourceNames,
                resources,
                scope);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedRuleWithOperations)) {
            return false;
        }
        final NamedRuleWithOperations __otherCasted = (NamedRuleWithOperations) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(apiVersions, __otherCasted.apiVersions) &&
            Objects.equals(operations, __otherCasted.operations) &&
            Objects.equals(resourceNames, __otherCasted.resourceNames) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(scope, __otherCasted.scope);
    }

    public NamedRuleWithOperations apiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public NamedRuleWithOperations apiVersions(final List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public NamedRuleWithOperations operations(final List<String> operations) {
        this.operations = operations;
        return this;
    }

    public NamedRuleWithOperations resourceNames(final List<String> resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    public NamedRuleWithOperations resources(final List<String> resources) {
        this.resources = resources;
        return this;
    }

    public NamedRuleWithOperations scope(final String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public NamedRuleWithOperations validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiGroups != null ? "\"apiGroups\":" + apiGroups.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (apiVersions != null ? "\"apiVersions\":" + apiVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (operations != null ? "\"operations\":" + operations.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (resourceNames != null ? "\"resourceNames\":" + resourceNames.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (resources != null ? "\"resources\":" + resources.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (scope != null ? "\"scope\":\"" +  JsonStrings.escapeJson(scope) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
