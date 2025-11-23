package io.yupiik.kubernetes.bindings.v1_33_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceRequestAllocationResult implements Validable<DeviceRequestAllocationResult>, Exportable {
    private Boolean adminAccess;
    private String device;
    private String driver;
    private String pool;
    private String request;
    private List<DeviceToleration> tolerations;

    public DeviceRequestAllocationResult() {
        // no-op
    }

    public DeviceRequestAllocationResult(final Boolean adminAccess,
                                         final String device,
                                         final String driver,
                                         final String pool,
                                         final String request,
                                         final List<DeviceToleration> tolerations) {
        this.adminAccess = adminAccess;
        this.device = device;
        this.driver = driver;
        this.pool = pool;
        this.request = request;
        this.tolerations = tolerations;
    }

    public Boolean getAdminAccess() {
        return adminAccess;
    }

    public void setAdminAccess(final Boolean adminAccess) {
        this.adminAccess = adminAccess;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(final String device) {
        this.device = device;
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

    public String getRequest() {
        return request;
    }

    public void setRequest(final String request) {
        this.request = request;
    }

    public List<DeviceToleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<DeviceToleration> tolerations) {
        this.tolerations = tolerations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                adminAccess,
                device,
                driver,
                pool,
                request,
                tolerations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceRequestAllocationResult)) {
            return false;
        }
        final DeviceRequestAllocationResult __otherCasted = (DeviceRequestAllocationResult) __other;
        return Objects.equals(adminAccess, __otherCasted.adminAccess) &&
            Objects.equals(device, __otherCasted.device) &&
            Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(pool, __otherCasted.pool) &&
            Objects.equals(request, __otherCasted.request) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }

    public DeviceRequestAllocationResult adminAccess(final Boolean adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }

    public DeviceRequestAllocationResult device(final String device) {
        this.device = device;
        return this;
    }

    public DeviceRequestAllocationResult driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public DeviceRequestAllocationResult pool(final String pool) {
        this.pool = pool;
        return this;
    }

    public DeviceRequestAllocationResult request(final String request) {
        this.request = request;
        return this;
    }

    public DeviceRequestAllocationResult tolerations(final List<DeviceToleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    @Override
    public DeviceRequestAllocationResult validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (device == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "device", "device",
                "Missing 'device' attribute.", true));
        }
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (pool == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "pool", "pool",
                "Missing 'pool' attribute.", true));
        }
        if (request == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "request", "request",
                "Missing 'request' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (adminAccess != null ? "\"adminAccess\":" + adminAccess : ""),
                    (device != null ? "\"device\":\"" +  JsonStrings.escapeJson(device) + "\"" : ""),
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (pool != null ? "\"pool\":\"" +  JsonStrings.escapeJson(pool) + "\"" : ""),
                    (request != null ? "\"request\":\"" +  JsonStrings.escapeJson(request) + "\"" : ""),
                    (tolerations != null ? "\"tolerations\":" + tolerations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
