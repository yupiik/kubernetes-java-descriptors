package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersStartupProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
