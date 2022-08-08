package io.yupiik.kubernetes.bindings.v1_17_14;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (DaemonSetSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
