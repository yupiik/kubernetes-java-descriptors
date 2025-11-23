package io.yupiik.kubernetes.bindings.v1_30_5.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_5.Validable;
import jakarta.json.JsonObject;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceRequest implements Validable<ResourceRequest>, Exportable {
    private NamedResourcesRequest namedResources;
    private JsonObject vendorParameters;

    public ResourceRequest() {
        // no-op
    }

    public ResourceRequest(final NamedResourcesRequest namedResources,
                           final JsonObject vendorParameters) {
        this.namedResources = namedResources;
        this.vendorParameters = vendorParameters;
    }

    public NamedResourcesRequest getNamedResources() {
        return namedResources;
    }

    public void setNamedResources(final NamedResourcesRequest namedResources) {
        this.namedResources = namedResources;
    }

    public JsonObject getVendorParameters() {
        return vendorParameters;
    }

    public void setVendorParameters(final JsonObject vendorParameters) {
        this.vendorParameters = vendorParameters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namedResources,
                vendorParameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceRequest)) {
            return false;
        }
        final ResourceRequest __otherCasted = (ResourceRequest) __other;
        return Objects.equals(namedResources, __otherCasted.namedResources) &&
            Objects.equals(vendorParameters, __otherCasted.vendorParameters);
    }

    public ResourceRequest namedResources(final NamedResourcesRequest namedResources) {
        this.namedResources = namedResources;
        return this;
    }

    public ResourceRequest vendorParameters(final JsonObject vendorParameters) {
        this.vendorParameters = vendorParameters;
        return this;
    }

    @Override
    public ResourceRequest validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (namedResources != null ? "\"namedResources\":" + namedResources.asJson() : ""),
                    (vendorParameters != null ? "\"vendorParameters\":" + vendorParameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
