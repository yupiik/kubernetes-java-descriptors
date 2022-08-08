package io.yupiik.kubernetes.bindings.v1_16_6;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
