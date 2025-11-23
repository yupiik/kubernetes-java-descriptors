package io.yupiik.kubernetes.bindings.v1_31_0.v1;

import io.yupiik.kubernetes.bindings.v1_31_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_0.Validable;
import io.yupiik.kubernetes.bindings.v1_31_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceStatus implements Validable<ResourceStatus>, Exportable {
    private String name;
    private List<ResourceHealth> resources;

    public ResourceStatus() {
        // no-op
    }

    public ResourceStatus(final String name,
                          final List<ResourceHealth> resources) {
        this.name = name;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ResourceHealth> getResources() {
        return resources;
    }

    public void setResources(final List<ResourceHealth> resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                resources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceStatus)) {
            return false;
        }
        final ResourceStatus __otherCasted = (ResourceStatus) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(resources, __otherCasted.resources);
    }

    public ResourceStatus name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceStatus resources(final List<ResourceHealth> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public ResourceStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (resources != null ? "\"resources\":" + resources.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
