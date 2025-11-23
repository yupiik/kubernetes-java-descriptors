package io.yupiik.kubernetes.bindings.v1_32_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_32_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_2.Validable;
import io.yupiik.kubernetes.bindings.v1_32_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceAllocationConfiguration implements Validable<DeviceAllocationConfiguration>, Exportable {
    private OpaqueDeviceConfiguration opaque;
    private List<String> requests;
    private String source;

    public DeviceAllocationConfiguration() {
        // no-op
    }

    public DeviceAllocationConfiguration(final OpaqueDeviceConfiguration opaque,
                                         final List<String> requests,
                                         final String source) {
        this.opaque = opaque;
        this.requests = requests;
        this.source = source;
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

    public String getSource() {
        return source;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                opaque,
                requests,
                source);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceAllocationConfiguration)) {
            return false;
        }
        final DeviceAllocationConfiguration __otherCasted = (DeviceAllocationConfiguration) __other;
        return Objects.equals(opaque, __otherCasted.opaque) &&
            Objects.equals(requests, __otherCasted.requests) &&
            Objects.equals(source, __otherCasted.source);
    }

    public DeviceAllocationConfiguration opaque(final OpaqueDeviceConfiguration opaque) {
        this.opaque = opaque;
        return this;
    }

    public DeviceAllocationConfiguration requests(final List<String> requests) {
        this.requests = requests;
        return this;
    }

    public DeviceAllocationConfiguration source(final String source) {
        this.source = source;
        return this;
    }

    @Override
    public DeviceAllocationConfiguration validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (source == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "source", "source",
                "Missing 'source' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (opaque != null ? "\"opaque\":" + opaque.asJson() : ""),
                    (requests != null ? "\"requests\":" + requests.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (source != null ? "\"source\":\"" +  JsonStrings.escapeJson(source) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
