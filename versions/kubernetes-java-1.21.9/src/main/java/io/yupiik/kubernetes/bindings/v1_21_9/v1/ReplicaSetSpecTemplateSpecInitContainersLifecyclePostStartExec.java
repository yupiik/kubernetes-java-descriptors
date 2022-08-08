package io.yupiik.kubernetes.bindings.v1_21_9.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
