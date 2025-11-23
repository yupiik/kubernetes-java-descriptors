package io.yupiik.kubernetes.bindings.v1_26_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_26_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_10.Validable;
import io.yupiik.kubernetes.bindings.v1_26_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimSpec implements Validable<ResourceClaimSpec>, Exportable {
    private String allocationMode;
    private ResourceClaimParametersReference parametersRef;
    private String resourceClassName;

    public ResourceClaimSpec() {
        // no-op
    }

    public ResourceClaimSpec(final String allocationMode,
                             final ResourceClaimParametersReference parametersRef,
                             final String resourceClassName) {
        this.allocationMode = allocationMode;
        this.parametersRef = parametersRef;
        this.resourceClassName = resourceClassName;
    }

    public String getAllocationMode() {
        return allocationMode;
    }

    public void setAllocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
    }

    public ResourceClaimParametersReference getParametersRef() {
        return parametersRef;
    }

    public void setParametersRef(final ResourceClaimParametersReference parametersRef) {
        this.parametersRef = parametersRef;
    }

    public String getResourceClassName() {
        return resourceClassName;
    }

    public void setResourceClassName(final String resourceClassName) {
        this.resourceClassName = resourceClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allocationMode,
                parametersRef,
                resourceClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimSpec)) {
            return false;
        }
        final ResourceClaimSpec __otherCasted = (ResourceClaimSpec) __other;
        return Objects.equals(allocationMode, __otherCasted.allocationMode) &&
            Objects.equals(parametersRef, __otherCasted.parametersRef) &&
            Objects.equals(resourceClassName, __otherCasted.resourceClassName);
    }

    public ResourceClaimSpec allocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
        return this;
    }

    public ResourceClaimSpec parametersRef(final ResourceClaimParametersReference parametersRef) {
        this.parametersRef = parametersRef;
        return this;
    }

    public ResourceClaimSpec resourceClassName(final String resourceClassName) {
        this.resourceClassName = resourceClassName;
        return this;
    }

    @Override
    public ResourceClaimSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (resourceClassName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resourceClassName", "resourceClassName",
                "Missing 'resourceClassName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allocationMode != null ? "\"allocationMode\":\"" +  JsonStrings.escapeJson(allocationMode) + "\"" : ""),
                    (parametersRef != null ? "\"parametersRef\":" + parametersRef.asJson() : ""),
                    (resourceClassName != null ? "\"resourceClassName\":\"" +  JsonStrings.escapeJson(resourceClassName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
