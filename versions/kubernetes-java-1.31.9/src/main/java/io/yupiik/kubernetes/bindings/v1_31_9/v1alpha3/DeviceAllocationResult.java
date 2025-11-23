package io.yupiik.kubernetes.bindings.v1_31_9.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_9.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceAllocationResult implements Validable<DeviceAllocationResult>, Exportable {
    private List<DeviceAllocationConfiguration> config;
    private List<DeviceRequestAllocationResult> results;

    public DeviceAllocationResult() {
        // no-op
    }

    public DeviceAllocationResult(final List<DeviceAllocationConfiguration> config,
                                  final List<DeviceRequestAllocationResult> results) {
        this.config = config;
        this.results = results;
    }

    public List<DeviceAllocationConfiguration> getConfig() {
        return config;
    }

    public void setConfig(final List<DeviceAllocationConfiguration> config) {
        this.config = config;
    }

    public List<DeviceRequestAllocationResult> getResults() {
        return results;
    }

    public void setResults(final List<DeviceRequestAllocationResult> results) {
        this.results = results;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                config,
                results);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceAllocationResult)) {
            return false;
        }
        final DeviceAllocationResult __otherCasted = (DeviceAllocationResult) __other;
        return Objects.equals(config, __otherCasted.config) &&
            Objects.equals(results, __otherCasted.results);
    }

    public DeviceAllocationResult config(final List<DeviceAllocationConfiguration> config) {
        this.config = config;
        return this;
    }

    public DeviceAllocationResult results(final List<DeviceRequestAllocationResult> results) {
        this.results = results;
        return this;
    }

    @Override
    public DeviceAllocationResult validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (config != null ? "\"config\":" + config.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (results != null ? "\"results\":" + results.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
