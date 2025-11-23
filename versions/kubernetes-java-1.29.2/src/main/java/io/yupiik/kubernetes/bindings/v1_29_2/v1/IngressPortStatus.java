package io.yupiik.kubernetes.bindings.v1_29_2.v1;

import io.yupiik.kubernetes.bindings.v1_29_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_2.Validable;
import io.yupiik.kubernetes.bindings.v1_29_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressPortStatus implements Validable<IngressPortStatus>, Exportable {
    private String error;
    private int port;
    private String protocol;

    public IngressPortStatus() {
        // no-op
    }

    public IngressPortStatus(final String error,
                             final int port,
                             final String protocol) {
        this.error = error;
        this.port = port;
        this.protocol = protocol;
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
        if (!(__other instanceof IngressPortStatus)) {
            return false;
        }
        final IngressPortStatus __otherCasted = (IngressPortStatus) __other;
        return Objects.equals(error, __otherCasted.error) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public IngressPortStatus error(final String error) {
        this.error = error;
        return this;
    }

    public IngressPortStatus port(final int port) {
        this.port = port;
        return this;
    }

    public IngressPortStatus protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public IngressPortStatus validate() {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (error != null ? "\"error\":\"" +  JsonStrings.escapeJson(error) + "\"" : ""),
                    "\"port\":" + port,
                    (protocol != null ? "\"protocol\":\"" +  JsonStrings.escapeJson(protocol) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
