package io.yupiik.kubernetes.bindings.v1_31_7.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllocationResult implements Validable<AllocationResult>, Exportable {
    private String controller;
    private DeviceAllocationResult devices;
    private NodeSelector nodeSelector;

    public AllocationResult() {
        // no-op
    }

    public AllocationResult(final String controller,
                            final DeviceAllocationResult devices,
                            final NodeSelector nodeSelector) {
        this.controller = controller;
        this.devices = devices;
        this.nodeSelector = nodeSelector;
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public DeviceAllocationResult getDevices() {
        return devices;
    }

    public void setDevices(final DeviceAllocationResult devices) {
        this.devices = devices;
    }

    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                controller,
                devices,
                nodeSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllocationResult)) {
            return false;
        }
        final AllocationResult __otherCasted = (AllocationResult) __other;
        return Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(devices, __otherCasted.devices) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector);
    }

    public AllocationResult controller(final String controller) {
        this.controller = controller;
        return this;
    }

    public AllocationResult devices(final DeviceAllocationResult devices) {
        this.devices = devices;
        return this;
    }

    public AllocationResult nodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    @Override
    public AllocationResult validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (controller != null ? "\"controller\":\"" +  JsonStrings.escapeJson(controller) + "\"" : ""),
                    (devices != null ? "\"devices\":" + devices.asJson() : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
