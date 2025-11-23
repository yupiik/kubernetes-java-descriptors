package io.yupiik.kubernetes.bindings.v1_33_1.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimSpec implements Validable<ResourceClaimSpec>, Exportable {
    private DeviceClaim devices;

    public ResourceClaimSpec() {
        // no-op
    }

    public ResourceClaimSpec(final DeviceClaim devices) {
        this.devices = devices;
    }

    public DeviceClaim getDevices() {
        return devices;
    }

    public void setDevices(final DeviceClaim devices) {
        this.devices = devices;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                devices);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimSpec)) {
            return false;
        }
        final ResourceClaimSpec __otherCasted = (ResourceClaimSpec) __other;
        return Objects.equals(devices, __otherCasted.devices);
    }

    public ResourceClaimSpec devices(final DeviceClaim devices) {
        this.devices = devices;
        return this;
    }

    @Override
    public ResourceClaimSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (devices != null ? "\"devices\":" + devices.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
