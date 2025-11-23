package io.yupiik.kubernetes.bindings.v1_29_1.v1;

import io.yupiik.kubernetes.bindings.v1_29_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_1.Validable;
import io.yupiik.kubernetes.bindings.v1_29_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodResourceClaimStatus implements Validable<PodResourceClaimStatus>, Exportable {
    private String name;
    private String resourceClaimName;

    public PodResourceClaimStatus() {
        // no-op
    }

    public PodResourceClaimStatus(final String name,
                                  final String resourceClaimName) {
        this.name = name;
        this.resourceClaimName = resourceClaimName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getResourceClaimName() {
        return resourceClaimName;
    }

    public void setResourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                resourceClaimName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodResourceClaimStatus)) {
            return false;
        }
        final PodResourceClaimStatus __otherCasted = (PodResourceClaimStatus) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(resourceClaimName, __otherCasted.resourceClaimName);
    }

    public PodResourceClaimStatus name(final String name) {
        this.name = name;
        return this;
    }

    public PodResourceClaimStatus resourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
        return this;
    }

    @Override
    public PodResourceClaimStatus validate() {
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
                    (resourceClaimName != null ? "\"resourceClaimName\":\"" +  JsonStrings.escapeJson(resourceClaimName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
