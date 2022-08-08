package io.yupiik.kubernetes.bindings.v1_16_13.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
