package io.yupiik.kubernetes.bindings.v1_7_15.v1;

import io.yupiik.kubernetes.bindings.v1_7_15.Validable;
import io.yupiik.kubernetes.bindings.v1_7_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaemonEndpoint implements Validable<DaemonEndpoint> {
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
}
