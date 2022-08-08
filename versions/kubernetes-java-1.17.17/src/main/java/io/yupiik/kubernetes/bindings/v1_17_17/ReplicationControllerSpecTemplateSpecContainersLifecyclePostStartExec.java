package io.yupiik.kubernetes.bindings.v1_17_17;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
