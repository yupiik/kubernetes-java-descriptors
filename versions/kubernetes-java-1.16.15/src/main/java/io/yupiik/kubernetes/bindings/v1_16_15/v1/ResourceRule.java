package io.yupiik.kubernetes.bindings.v1_16_15.v1;

import io.yupiik.kubernetes.bindings.v1_16_15.Validable;
import io.yupiik.kubernetes.bindings.v1_16_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceRule implements Validable<ResourceRule> {
    private List<String> apiGroups;
    private List<String> resourceNames;
    private List<String> resources;
    private List<String> verbs;

    public ResourceRule() {
        // no-op
    }

    public ResourceRule(final List<String> apiGroups,
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
                resourceNames,
                resources,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceRule)) {
            return false;
        }
        final ResourceRule __otherCasted = (ResourceRule) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(resourceNames, __otherCasted.resourceNames) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public ResourceRule apiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public ResourceRule resourceNames(final List<String> resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    public ResourceRule resources(final List<String> resources) {
        this.resources = resources;
        return this;
    }

    public ResourceRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public ResourceRule validate() {
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
