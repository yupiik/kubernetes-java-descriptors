package io.yupiik.kubernetes.bindings.v1_16_1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (StatefulSetSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
