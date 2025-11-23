package io.yupiik.kubernetes.bindings.v1_30_3.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_30_3.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DriverRequests implements Validable<DriverRequests>, Exportable {
    private String driverName;
    private List<ResourceRequest> requests;
    private JsonObject vendorParameters;

    public DriverRequests() {
        // no-op
    }

    public DriverRequests(final String driverName,
                          final List<ResourceRequest> requests,
                          final JsonObject vendorParameters) {
        this.driverName = driverName;
        this.requests = requests;
        this.vendorParameters = vendorParameters;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    public List<ResourceRequest> getRequests() {
        return requests;
    }

    public void setRequests(final List<ResourceRequest> requests) {
        this.requests = requests;
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
                driverName,
                requests,
                vendorParameters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DriverRequests)) {
            return false;
        }
        final DriverRequests __otherCasted = (DriverRequests) __other;
        return Objects.equals(driverName, __otherCasted.driverName) &&
            Objects.equals(requests, __otherCasted.requests) &&
            Objects.equals(vendorParameters, __otherCasted.vendorParameters);
    }

    public DriverRequests driverName(final String driverName) {
        this.driverName = driverName;
        return this;
    }

    public DriverRequests requests(final List<ResourceRequest> requests) {
        this.requests = requests;
        return this;
    }

    public DriverRequests vendorParameters(final JsonObject vendorParameters) {
        this.vendorParameters = vendorParameters;
        return this;
    }

    @Override
    public DriverRequests validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driverName != null ? "\"driverName\":\"" +  JsonStrings.escapeJson(driverName) + "\"" : ""),
                    (requests != null ? "\"requests\":" + requests.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (vendorParameters != null ? "\"vendorParameters\":" + vendorParameters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
