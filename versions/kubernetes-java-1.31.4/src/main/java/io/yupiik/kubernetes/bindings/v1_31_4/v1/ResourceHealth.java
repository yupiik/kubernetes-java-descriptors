package io.yupiik.kubernetes.bindings.v1_31_4.v1;

import io.yupiik.kubernetes.bindings.v1_31_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_4.Validable;
import io.yupiik.kubernetes.bindings.v1_31_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceHealth implements Validable<ResourceHealth>, Exportable {
    private String health;
    private String resourceID;

    public ResourceHealth() {
        // no-op
    }

    public ResourceHealth(final String health,
                          final String resourceID) {
        this.health = health;
        this.resourceID = resourceID;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(final String health) {
        this.health = health;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(final String resourceID) {
        this.resourceID = resourceID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                health,
                resourceID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceHealth)) {
            return false;
        }
        final ResourceHealth __otherCasted = (ResourceHealth) __other;
        return Objects.equals(health, __otherCasted.health) &&
            Objects.equals(resourceID, __otherCasted.resourceID);
    }

    public ResourceHealth health(final String health) {
        this.health = health;
        return this;
    }

    public ResourceHealth resourceID(final String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    @Override
    public ResourceHealth validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (resourceID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceID", "resourceID",
                "Missing 'resourceID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (health != null ? "\"health\":\"" +  JsonStrings.escapeJson(health) + "\"" : ""),
                    (resourceID != null ? "\"resourceID\":\"" +  JsonStrings.escapeJson(resourceID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
