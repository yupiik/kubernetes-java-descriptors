package io.yupiik.kubernetes.bindings.v1_30_12.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_12.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DriverAllocationResult implements Validable<DriverAllocationResult>, Exportable {
    private NamedResourcesAllocationResult namedResources;
    private JsonObject vendorRequestParameters;

    public DriverAllocationResult() {
        // no-op
    }

    public DriverAllocationResult(final NamedResourcesAllocationResult namedResources,
                                  final JsonObject vendorRequestParameters) {
        this.namedResources = namedResources;
        this.vendorRequestParameters = vendorRequestParameters;
    }

    public NamedResourcesAllocationResult getNamedResources() {
        return namedResources;
    }

    public void setNamedResources(final NamedResourcesAllocationResult namedResources) {
        this.namedResources = namedResources;
    }

    public JsonObject getVendorRequestParameters() {
        return vendorRequestParameters;
    }

    public void setVendorRequestParameters(final JsonObject vendorRequestParameters) {
        this.vendorRequestParameters = vendorRequestParameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namedResources,
                vendorRequestParameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DriverAllocationResult)) {
            return false;
        }
        final DriverAllocationResult __otherCasted = (DriverAllocationResult) __other;
        return Objects.equals(namedResources, __otherCasted.namedResources) &&
            Objects.equals(vendorRequestParameters, __otherCasted.vendorRequestParameters);
    }

    public DriverAllocationResult namedResources(final NamedResourcesAllocationResult namedResources) {
        this.namedResources = namedResources;
        return this;
    }

    public DriverAllocationResult vendorRequestParameters(final JsonObject vendorRequestParameters) {
        this.vendorRequestParameters = vendorRequestParameters;
        return this;
    }

    @Override
    public DriverAllocationResult validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (namedResources != null ? "\"namedResources\":" + namedResources.asJson() : ""),
                    (vendorRequestParameters != null ? "\"vendorRequestParameters\":" + vendorRequestParameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
