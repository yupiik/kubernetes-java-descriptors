package io.yupiik.kubernetes.bindings.v1_21_6.v1;

import java.util.List;
import java.util.Objects;

public class EphemeralContainersEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public EphemeralContainersEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersLifecyclePostStartExec __otherCasted = (EphemeralContainersEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
