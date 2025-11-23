package io.yupiik.kubernetes.bindings.v1_32_0.v1;

import io.yupiik.kubernetes.bindings.v1_32_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_0.Validable;
import io.yupiik.kubernetes.bindings.v1_32_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HostIP implements Validable<HostIP>, Exportable {
    private String ip;

    public HostIP() {
        // no-op
    }

    public HostIP(final String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(final String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HostIP)) {
            return false;
        }
        final HostIP __otherCasted = (HostIP) __other;
        return Objects.equals(ip, __otherCasted.ip);
    }

    public HostIP ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public HostIP validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (ip == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "ip", "ip",
                "Missing 'ip' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
