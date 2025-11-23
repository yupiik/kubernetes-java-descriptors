package io.yupiik.kubernetes.bindings.v1_26_13.v1;

import io.yupiik.kubernetes.bindings.v1_26_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_13.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClaimSource implements Validable<ClaimSource>, Exportable {
    private String resourceClaimName;
    private String resourceClaimTemplateName;

    public ClaimSource() {
        // no-op
    }

    public ClaimSource(final String resourceClaimName,
                       final String resourceClaimTemplateName) {
        this.resourceClaimName = resourceClaimName;
        this.resourceClaimTemplateName = resourceClaimTemplateName;
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
                resourceClaimName,
                resourceClaimTemplateName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClaimSource)) {
            return false;
        }
        final ClaimSource __otherCasted = (ClaimSource) __other;
        return Objects.equals(resourceClaimName, __otherCasted.resourceClaimName) &&
            Objects.equals(resourceClaimTemplateName, __otherCasted.resourceClaimTemplateName);
    }

    public ClaimSource resourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
        return this;
    }

    public ClaimSource resourceClaimTemplateName(final String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
        return this;
    }

    @Override
    public ClaimSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceClaimName != null ? "\"resourceClaimName\":\"" +  JsonStrings.escapeJson(resourceClaimName) + "\"" : ""),
                    (resourceClaimTemplateName != null ? "\"resourceClaimTemplateName\":\"" +  JsonStrings.escapeJson(resourceClaimTemplateName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
