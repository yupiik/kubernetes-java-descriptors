package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
