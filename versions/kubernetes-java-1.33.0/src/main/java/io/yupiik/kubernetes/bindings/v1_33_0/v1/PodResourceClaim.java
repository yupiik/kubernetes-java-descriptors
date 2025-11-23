package io.yupiik.kubernetes.bindings.v1_33_0.v1;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodResourceClaim implements Validable<PodResourceClaim>, Exportable {
    private String name;
    private String resourceClaimName;
    private String resourceClaimTemplateName;

    public PodResourceClaim() {
        // no-op
    }

    public PodResourceClaim(final String name,
                            final String resourceClaimName,
                            final String resourceClaimTemplateName) {
        this.name = name;
        this.resourceClaimName = resourceClaimName;
        this.resourceClaimTemplateName = resourceClaimTemplateName;
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

    public String getResourceClaimTemplateName() {
        return resourceClaimTemplateName;
    }

    public void setResourceClaimTemplateName(final String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                resourceClaimName,
                resourceClaimTemplateName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodResourceClaim)) {
            return false;
        }
        final PodResourceClaim __otherCasted = (PodResourceClaim) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(resourceClaimName, __otherCasted.resourceClaimName) &&
            Objects.equals(resourceClaimTemplateName, __otherCasted.resourceClaimTemplateName);
    }

    public PodResourceClaim name(final String name) {
        this.name = name;
        return this;
    }

    public PodResourceClaim resourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
        return this;
    }

    public PodResourceClaim resourceClaimTemplateName(final String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
        return this;
    }

    @Override
    public PodResourceClaim validate() {
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
                    (resourceClaimName != null ? "\"resourceClaimName\":\"" +  JsonStrings.escapeJson(resourceClaimName) + "\"" : ""),
                    (resourceClaimTemplateName != null ? "\"resourceClaimTemplateName\":\"" +  JsonStrings.escapeJson(resourceClaimTemplateName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
