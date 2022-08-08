package io.yupiik.kubernetes.bindings.v1_20_2;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
