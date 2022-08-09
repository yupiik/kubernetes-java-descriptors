package io.yupiik.kubernetes.bindings.v1_8_5.v1;

import io.yupiik.kubernetes.bindings.v1_8_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_5.Validable;
import io.yupiik.kubernetes.bindings.v1_8_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClientIPConfig implements Validable<ClientIPConfig>, Exportable {
    private Integer timeoutSeconds;

    public ClientIPConfig() {
        // no-op
    }

    public ClientIPConfig(final Integer timeoutSeconds) {
        // no-op
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClientIPConfig)) {
            return false;
        }
        final ClientIPConfig __otherCasted = (ClientIPConfig) __other;
        return Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }

    public ClientIPConfig timeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    @Override
    public ClientIPConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (timeoutSeconds != null ? "\"timeoutSeconds\":" + timeoutSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
