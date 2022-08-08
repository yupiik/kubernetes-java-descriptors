package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (DaemonSetSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
