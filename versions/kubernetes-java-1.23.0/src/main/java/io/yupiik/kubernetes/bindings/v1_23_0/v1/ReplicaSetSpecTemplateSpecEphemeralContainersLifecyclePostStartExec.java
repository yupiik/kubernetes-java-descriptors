package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
