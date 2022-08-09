package io.yupiik.kubernetes.bindings.v1_16_8.v1;

import io.yupiik.kubernetes.bindings.v1_16_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_8.Validable;
import io.yupiik.kubernetes.bindings.v1_16_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonEndpoint implements Validable<DaemonEndpoint>, Exportable {
    private int Port;

    public DaemonEndpoint() {
        // no-op
    }

    public DaemonEndpoint(final int Port) {
        // no-op
    }

    public int getPort() {
        return Port;
    }

    public void setPort(final int Port) {
        this.Port = Port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonEndpoint)) {
            return false;
        }
        final DaemonEndpoint __otherCasted = (DaemonEndpoint) __other;
        return Objects.equals(Port, __otherCasted.Port);
    }

    public DaemonEndpoint Port(final int Port) {
        this.Port = Port;
        return this;
    }

    @Override
    public DaemonEndpoint validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"Port\":" + Port)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
