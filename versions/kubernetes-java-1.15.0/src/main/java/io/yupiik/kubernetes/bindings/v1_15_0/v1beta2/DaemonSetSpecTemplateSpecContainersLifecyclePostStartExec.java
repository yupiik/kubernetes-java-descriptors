package io.yupiik.kubernetes.bindings.v1_15_0.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (DaemonSetSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
