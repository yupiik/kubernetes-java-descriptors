package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
