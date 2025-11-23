package io.yupiik.kubernetes.bindings.v1_31_10.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimSpec implements Validable<ResourceClaimSpec>, Exportable {
    private String controller;
    private DeviceClaim devices;

    public ResourceClaimSpec() {
        // no-op
    }

    public ResourceClaimSpec(final String controller,
                             final DeviceClaim devices) {
        this.controller = controller;
        this.devices = devices;
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
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
                controller,
                devices);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceClaimSpec)) {
            return false;
        }
        final ResourceClaimSpec __otherCasted = (ResourceClaimSpec) __other;
        return Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(devices, __otherCasted.devices);
    }

    public ResourceClaimSpec controller(final String controller) {
        this.controller = controller;
        return this;
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
                    (controller != null ? "\"controller\":\"" +  JsonStrings.escapeJson(controller) + "\"" : ""),
                    (devices != null ? "\"devices\":" + devices.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
