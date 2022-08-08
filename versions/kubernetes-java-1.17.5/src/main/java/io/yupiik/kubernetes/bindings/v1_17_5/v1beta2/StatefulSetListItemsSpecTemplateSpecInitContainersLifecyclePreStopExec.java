package io.yupiik.kubernetes.bindings.v1_17_5.v1beta2;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
