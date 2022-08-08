package io.yupiik.kubernetes.bindings.v1_21_7.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
