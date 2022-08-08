package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
