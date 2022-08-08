package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
