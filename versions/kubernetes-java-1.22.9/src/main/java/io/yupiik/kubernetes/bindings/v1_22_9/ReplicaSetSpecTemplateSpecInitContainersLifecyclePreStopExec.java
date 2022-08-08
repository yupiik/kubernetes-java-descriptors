package io.yupiik.kubernetes.bindings.v1_22_9;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
