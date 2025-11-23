package io.yupiik.kubernetes.bindings.v1_29_10.v1;

import io.yupiik.kubernetes.bindings.v1_29_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStateWaiting implements Validable<ContainerStateWaiting>, Exportable {
    private String message;
    private String reason;

    public ContainerStateWaiting() {
        // no-op
    }

    public ContainerStateWaiting(final String message,
                                 final String reason) {
        this.message = message;
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                message,
                reason);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStateWaiting)) {
            return false;
        }
        final ContainerStateWaiting __otherCasted = (ContainerStateWaiting) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(reason, __otherCasted.reason);
    }

    public ContainerStateWaiting message(final String message) {
        this.message = message;
        return this;
    }

    public ContainerStateWaiting reason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public ContainerStateWaiting validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (reason != null ? "\"reason\":\"" +  JsonStrings.escapeJson(reason) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
