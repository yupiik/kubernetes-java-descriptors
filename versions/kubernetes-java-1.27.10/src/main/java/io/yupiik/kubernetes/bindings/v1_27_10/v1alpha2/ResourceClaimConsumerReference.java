package io.yupiik.kubernetes.bindings.v1_27_10.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_27_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_10.Validable;
import io.yupiik.kubernetes.bindings.v1_27_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimConsumerReference implements Validable<ResourceClaimConsumerReference>, Exportable {
    private String apiGroup;
    private String name;
    private String resource;
    private String uid;

    public ResourceClaimConsumerReference() {
        // no-op
    }

    public ResourceClaimConsumerReference(final String apiGroup,
                                          final String name,
                                          final String resource,
                                          final String uid) {
        this.apiGroup = apiGroup;
        this.name = name;
        this.resource = resource;
        this.uid = uid;
    }

    public String getApiGroup() {
        return apiGroup;
    }

    public void setApiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroup,
                name,
                resource,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimConsumerReference)) {
            return false;
        }
        final ResourceClaimConsumerReference __otherCasted = (ResourceClaimConsumerReference) __other;
        return Objects.equals(apiGroup, __otherCasted.apiGroup) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public ResourceClaimConsumerReference apiGroup(final String apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }

    public ResourceClaimConsumerReference name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceClaimConsumerReference resource(final String resource) {
        this.resource = resource;
        return this;
    }

    public ResourceClaimConsumerReference uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public ResourceClaimConsumerReference validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (resource == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resource", "resource",
                "Missing 'resource' attribute.", true));
        }
        if (uid == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "uid", "uid",
                "Missing 'uid' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiGroup != null ? "\"apiGroup\":\"" +  JsonStrings.escapeJson(apiGroup) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
