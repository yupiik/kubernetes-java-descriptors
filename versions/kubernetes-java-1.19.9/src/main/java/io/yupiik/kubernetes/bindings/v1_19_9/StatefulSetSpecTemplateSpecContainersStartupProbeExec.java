package io.yupiik.kubernetes.bindings.v1_19_9;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersStartupProbeExec __otherCasted = (StatefulSetSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
