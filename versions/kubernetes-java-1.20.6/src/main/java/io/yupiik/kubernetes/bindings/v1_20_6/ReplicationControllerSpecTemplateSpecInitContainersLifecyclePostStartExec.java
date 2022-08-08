package io.yupiik.kubernetes.bindings.v1_20_6;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
