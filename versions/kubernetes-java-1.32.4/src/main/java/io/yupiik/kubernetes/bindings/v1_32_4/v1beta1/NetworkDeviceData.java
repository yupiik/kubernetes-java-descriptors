package io.yupiik.kubernetes.bindings.v1_32_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_32_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_4.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkDeviceData implements Validable<NetworkDeviceData>, Exportable {
    private String hardwareAddress;
    private String interfaceName;
    private List<String> ips;

    public NetworkDeviceData() {
        // no-op
    }

    public NetworkDeviceData(final String hardwareAddress,
                             final String interfaceName,
                             final List<String> ips) {
        this.hardwareAddress = hardwareAddress;
        this.interfaceName = interfaceName;
        this.ips = ips;
    }

    public String getHardwareAddress() {
        return hardwareAddress;
    }

    public void setHardwareAddress(final String hardwareAddress) {
        this.hardwareAddress = hardwareAddress;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(final String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(final List<String> ips) {
        this.ips = ips;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hardwareAddress,
                interfaceName,
                ips);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkDeviceData)) {
            return false;
        }
        final NetworkDeviceData __otherCasted = (NetworkDeviceData) __other;
        return Objects.equals(hardwareAddress, __otherCasted.hardwareAddress) &&
            Objects.equals(interfaceName, __otherCasted.interfaceName) &&
            Objects.equals(ips, __otherCasted.ips);
    }

    public NetworkDeviceData hardwareAddress(final String hardwareAddress) {
        this.hardwareAddress = hardwareAddress;
        return this;
    }

    public NetworkDeviceData interfaceName(final String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    public NetworkDeviceData ips(final List<String> ips) {
        this.ips = ips;
        return this;
    }

    @Override
    public NetworkDeviceData validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hardwareAddress != null ? "\"hardwareAddress\":\"" +  JsonStrings.escapeJson(hardwareAddress) + "\"" : ""),
                    (interfaceName != null ? "\"interfaceName\":\"" +  JsonStrings.escapeJson(interfaceName) + "\"" : ""),
                    (ips != null ? "\"ips\":" + ips.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
