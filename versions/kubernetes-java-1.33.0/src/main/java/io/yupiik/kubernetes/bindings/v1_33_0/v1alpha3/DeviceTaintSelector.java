package io.yupiik.kubernetes.bindings.v1_33_0.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceTaintSelector implements Validable<DeviceTaintSelector>, Exportable {
    private String device;
    private String deviceClassName;
    private String driver;
    private String pool;
    private List<DeviceSelector> selectors;

    public DeviceTaintSelector() {
        // no-op
    }

    public DeviceTaintSelector(final String device,
                               final String deviceClassName,
                               final String driver,
                               final String pool,
                               final List<DeviceSelector> selectors) {
        this.device = device;
        this.deviceClassName = deviceClassName;
        this.driver = driver;
        this.pool = pool;
        this.selectors = selectors;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(final String device) {
        this.device = device;
    }

    public String getDeviceClassName() {
        return deviceClassName;
    }

    public void setDeviceClassName(final String deviceClassName) {
        this.deviceClassName = deviceClassName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(final String pool) {
        this.pool = pool;
    }

    public List<DeviceSelector> getSelectors() {
        return selectors;
    }

    public void setSelectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                device,
                deviceClassName,
                driver,
                pool,
                selectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceTaintSelector)) {
            return false;
        }
        final DeviceTaintSelector __otherCasted = (DeviceTaintSelector) __other;
        return Objects.equals(device, __otherCasted.device) &&
            Objects.equals(deviceClassName, __otherCasted.deviceClassName) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(pool, __otherCasted.pool) &&
            Objects.equals(selectors, __otherCasted.selectors);
    }

    public DeviceTaintSelector device(final String device) {
        this.device = device;
        return this;
    }

    public DeviceTaintSelector deviceClassName(final String deviceClassName) {
        this.deviceClassName = deviceClassName;
        return this;
    }

    public DeviceTaintSelector driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public DeviceTaintSelector pool(final String pool) {
        this.pool = pool;
        return this;
    }

    public DeviceTaintSelector selectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
        return this;
    }

    @Override
    public DeviceTaintSelector validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (device != null ? "\"device\":\"" +  JsonStrings.escapeJson(device) + "\"" : ""),
                    (deviceClassName != null ? "\"deviceClassName\":\"" +  JsonStrings.escapeJson(deviceClassName) + "\"" : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (pool != null ? "\"pool\":\"" +  JsonStrings.escapeJson(pool) + "\"" : ""),
                    (selectors != null ? "\"selectors\":" + selectors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
