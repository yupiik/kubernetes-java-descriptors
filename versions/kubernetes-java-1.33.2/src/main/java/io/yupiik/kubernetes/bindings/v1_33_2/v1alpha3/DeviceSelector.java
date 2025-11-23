package io.yupiik.kubernetes.bindings.v1_33_2.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceSelector implements Validable<DeviceSelector>, Exportable {
    private CELDeviceSelector cel;

    public DeviceSelector() {
        // no-op
    }

    public DeviceSelector(final CELDeviceSelector cel) {
        this.cel = cel;
    }

    public CELDeviceSelector getCel() {
        return cel;
    }

    public void setCel(final CELDeviceSelector cel) {
        this.cel = cel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cel);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceSelector)) {
            return false;
        }
        final DeviceSelector __otherCasted = (DeviceSelector) __other;
        return Objects.equals(cel, __otherCasted.cel);
    }

    public DeviceSelector cel(final CELDeviceSelector cel) {
        this.cel = cel;
        return this;
    }

    @Override
    public DeviceSelector validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (cel != null ? "\"cel\":" + cel.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
