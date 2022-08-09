package io.yupiik.kubernetes.bindings.v1_16_0.v1beta2;

import io.yupiik.kubernetes.bindings.v1_16_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_0.Validable;
import io.yupiik.kubernetes.bindings.v1_16_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TCPSocketAction implements Validable<TCPSocketAction>, Exportable {
    private String host;
    private String port;

    public TCPSocketAction() {
        // no-op
    }

    public TCPSocketAction(final String host,
                           final String port) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TCPSocketAction)) {
            return false;
        }
        final TCPSocketAction __otherCasted = (TCPSocketAction) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(port, __otherCasted.port);
    }

    public TCPSocketAction host(final String host) {
        this.host = host;
        return this;
    }

    public TCPSocketAction port(final String port) {
        this.port = port;
        return this;
    }

    @Override
    public TCPSocketAction validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (port == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "port", "port",
                "Missing 'port' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (host != null ? "\"host\":\"" +  JsonStrings.escapeJson(host) + "\"" : ""),
                    (port != null ? "\"port\":\"" +  JsonStrings.escapeJson(port) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
