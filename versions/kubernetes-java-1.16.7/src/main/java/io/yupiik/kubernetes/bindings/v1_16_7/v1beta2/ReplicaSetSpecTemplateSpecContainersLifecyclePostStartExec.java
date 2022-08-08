package io.yupiik.kubernetes.bindings.v1_16_7.v1beta2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (ReplicaSetSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
