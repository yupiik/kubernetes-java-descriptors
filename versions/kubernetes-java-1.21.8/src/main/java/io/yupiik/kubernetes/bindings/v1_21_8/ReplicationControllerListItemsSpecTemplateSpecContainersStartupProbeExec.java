package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
