package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
