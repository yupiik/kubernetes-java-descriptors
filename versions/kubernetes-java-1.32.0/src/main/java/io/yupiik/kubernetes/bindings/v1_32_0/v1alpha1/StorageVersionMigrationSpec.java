package io.yupiik.kubernetes.bindings.v1_32_0.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_32_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_0.Validable;
import io.yupiik.kubernetes.bindings.v1_32_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StorageVersionMigrationSpec implements Validable<StorageVersionMigrationSpec>, Exportable {
    private String continueToken;
    private GroupVersionResource resource;

    public StorageVersionMigrationSpec() {
        // no-op
    }

    public StorageVersionMigrationSpec(final String continueToken,
                                       final GroupVersionResource resource) {
        this.continueToken = continueToken;
        this.resource = resource;
    }

    public String getContinueToken() {
        return continueToken;
    }

    public void setContinueToken(final String continueToken) {
        this.continueToken = continueToken;
    }

    public GroupVersionResource getResource() {
        return resource;
    }

    public void setResource(final GroupVersionResource resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                continueToken,
                resource);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageVersionMigrationSpec)) {
            return false;
        }
        final StorageVersionMigrationSpec __otherCasted = (StorageVersionMigrationSpec) __other;
        return Objects.equals(continueToken, __otherCasted.continueToken) &&
            Objects.equals(resource, __otherCasted.resource);
    }

    public StorageVersionMigrationSpec continueToken(final String continueToken) {
        this.continueToken = continueToken;
        return this;
    }

    public StorageVersionMigrationSpec resource(final GroupVersionResource resource) {
        this.resource = resource;
        return this;
    }

    @Override
    public StorageVersionMigrationSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (resource == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resource", "resource",
                "Missing 'resource' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (continueToken != null ? "\"continueToken\":\"" +  JsonStrings.escapeJson(continueToken) + "\"" : ""),
                    (resource != null ? "\"resource\":" + resource.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
