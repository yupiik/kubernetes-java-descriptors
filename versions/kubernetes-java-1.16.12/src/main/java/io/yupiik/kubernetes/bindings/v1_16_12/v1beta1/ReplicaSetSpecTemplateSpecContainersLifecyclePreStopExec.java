package io.yupiik.kubernetes.bindings.v1_16_12.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (ReplicaSetSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
