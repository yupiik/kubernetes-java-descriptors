package io.yupiik.kubernetes.bindings.v1_32_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_32_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_5.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceClassConfiguration implements Validable<DeviceClassConfiguration>, Exportable {
    private OpaqueDeviceConfiguration opaque;

    public DeviceClassConfiguration() {
        // no-op
    }

    public DeviceClassConfiguration(final OpaqueDeviceConfiguration opaque) {
        this.opaque = opaque;
    }

    public OpaqueDeviceConfiguration getOpaque() {
        return opaque;
    }

    public void setOpaque(final OpaqueDeviceConfiguration opaque) {
        this.opaque = opaque;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                opaque);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceClassConfiguration)) {
            return false;
        }
        final DeviceClassConfiguration __otherCasted = (DeviceClassConfiguration) __other;
        return Objects.equals(opaque, __otherCasted.opaque);
    }

    public DeviceClassConfiguration opaque(final OpaqueDeviceConfiguration opaque) {
        this.opaque = opaque;
        return this;
    }

    @Override
    public DeviceClassConfiguration validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (opaque != null ? "\"opaque\":" + opaque.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
