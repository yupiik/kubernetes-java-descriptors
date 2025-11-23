package io.yupiik.kubernetes.bindings.v1_31_2.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceClaimConfiguration implements Validable<DeviceClaimConfiguration>, Exportable {
    private OpaqueDeviceConfiguration opaque;
    private List<String> requests;

    public DeviceClaimConfiguration() {
        // no-op
    }

    public DeviceClaimConfiguration(final OpaqueDeviceConfiguration opaque,
                                    final List<String> requests) {
        this.opaque = opaque;
        this.requests = requests;
    }

    public OpaqueDeviceConfiguration getOpaque() {
        return opaque;
    }

    public void setOpaque(final OpaqueDeviceConfiguration opaque) {
        this.opaque = opaque;
    }

    public List<String> getRequests() {
        return requests;
    }

    public void setRequests(final List<String> requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                opaque,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceClaimConfiguration)) {
            return false;
        }
        final DeviceClaimConfiguration __otherCasted = (DeviceClaimConfiguration) __other;
        return Objects.equals(opaque, __otherCasted.opaque) &&
            Objects.equals(requests, __otherCasted.requests);
    }

    public DeviceClaimConfiguration opaque(final OpaqueDeviceConfiguration opaque) {
        this.opaque = opaque;
        return this;
    }

    public DeviceClaimConfiguration requests(final List<String> requests) {
        this.requests = requests;
        return this;
    }

    @Override
    public DeviceClaimConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (opaque != null ? "\"opaque\":" + opaque.asJson() : ""),
                    (requests != null ? "\"requests\":" + requests.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
