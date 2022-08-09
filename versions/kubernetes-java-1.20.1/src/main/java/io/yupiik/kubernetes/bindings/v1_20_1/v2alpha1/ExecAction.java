package io.yupiik.kubernetes.bindings.v1_20_1.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_20_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_1.Validable;
import io.yupiik.kubernetes.bindings.v1_20_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExecAction implements Validable<ExecAction>, Exportable {
    private List<String> command;

    public ExecAction() {
        // no-op
    }

    public ExecAction(final List<String> command) {
        // no-op
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(final List<String> command) {
        this.command = command;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                command);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExecAction)) {
            return false;
        }
        final ExecAction __otherCasted = (ExecAction) __other;
        return Objects.equals(command, __otherCasted.command);
    }

    public ExecAction command(final List<String> command) {
        this.command = command;
        return this;
    }

    @Override
    public ExecAction validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (command != null ? "\"command\":" + command.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
