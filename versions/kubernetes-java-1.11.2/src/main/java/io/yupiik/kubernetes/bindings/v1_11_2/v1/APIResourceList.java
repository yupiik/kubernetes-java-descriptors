package io.yupiik.kubernetes.bindings.v1_11_2.v1;

import io.yupiik.kubernetes.bindings.v1_11_2.Validable;
import io.yupiik.kubernetes.bindings.v1_11_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class APIResourceList implements Validable<APIResourceList> {
    private String apiVersion;
    private String groupVersion;
    private String kind;
    private List<APIResource> resources;

    public APIResourceList() {
        // no-op
    }

    public APIResourceList(final String apiVersion,
                           final String groupVersion,
                           final String kind,
                           final List<APIResource> resources) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getGroupVersion() {
        return groupVersion;
    }

    public void setGroupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public List<APIResource> getResources() {
        return resources;
    }

    public void setResources(final List<APIResource> resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                groupVersion,
                kind,
                resources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIResourceList)) {
            return false;
        }
        final APIResourceList __otherCasted = (APIResourceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(groupVersion, __otherCasted.groupVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(resources, __otherCasted.resources);
    }

    public APIResourceList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIResourceList groupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }

    public APIResourceList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public APIResourceList resources(final List<APIResource> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public APIResourceList validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (groupVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "groupVersion", "groupVersion",
                "Missing 'groupVersion' attribute.", true));
        }
        if (resources == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resources", "resources",
                "Missing 'resources' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
