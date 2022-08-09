package io.yupiik.kubernetes.bindings.v1_8_3.v1;

import io.yupiik.kubernetes.bindings.v1_8_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_3.Validable;
import io.yupiik.kubernetes.bindings.v1_8_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamespaceStatus implements Validable<NamespaceStatus>, Exportable {
    private String phase;

    public NamespaceStatus() {
        // no-op
    }

    public NamespaceStatus(final String phase) {
        // no-op
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceStatus)) {
            return false;
        }
        final NamespaceStatus __otherCasted = (NamespaceStatus) __other;
        return Objects.equals(phase, __otherCasted.phase);
    }

    public NamespaceStatus phase(final String phase) {
        this.phase = phase;
        return this;
    }

    @Override
    public NamespaceStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (phase != null ? "\"phase\":\"" +  JsonStrings.escapeJson(phase) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
