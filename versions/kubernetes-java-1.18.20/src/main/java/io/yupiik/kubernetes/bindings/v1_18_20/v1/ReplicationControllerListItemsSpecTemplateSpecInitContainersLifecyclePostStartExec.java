package io.yupiik.kubernetes.bindings.v1_18_20.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
