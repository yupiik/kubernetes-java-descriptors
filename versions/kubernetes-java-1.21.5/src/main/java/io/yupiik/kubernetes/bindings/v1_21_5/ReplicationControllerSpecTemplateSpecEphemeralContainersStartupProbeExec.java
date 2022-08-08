package io.yupiik.kubernetes.bindings.v1_21_5;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
