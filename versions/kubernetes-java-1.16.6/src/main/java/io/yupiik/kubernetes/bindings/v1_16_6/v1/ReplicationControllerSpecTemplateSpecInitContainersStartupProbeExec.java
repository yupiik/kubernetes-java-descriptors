package io.yupiik.kubernetes.bindings.v1_16_6.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
