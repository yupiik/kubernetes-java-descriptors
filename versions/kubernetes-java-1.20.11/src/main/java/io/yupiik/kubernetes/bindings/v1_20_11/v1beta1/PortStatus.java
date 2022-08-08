package io.yupiik.kubernetes.bindings.v1_20_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_11.Validable;
import io.yupiik.kubernetes.bindings.v1_20_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PortStatus implements Validable<PortStatus> {
    private String error;
    private int port;
    private String protocol;

    public PortStatus() {
        // no-op
    }

    public PortStatus(final String error,
                      final int port,
                      final String protocol) {
        // no-op
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                error,
                port,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PortStatus)) {
            return false;
        }
        final PortStatus __otherCasted = (PortStatus) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public PortStatus error(final String error) {
        this.error = error;
        return this;
    }

    public PortStatus port(final int port) {
        this.port = port;
        return this;
    }

    public PortStatus protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public PortStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (protocol == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "protocol", "protocol",
                "Missing 'protocol' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
