package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.List;
import java.util.Objects;

public class EphemeralContainersEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public EphemeralContainersEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersLifecyclePreStopExec __otherCasted = (EphemeralContainersEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
