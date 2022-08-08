package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
