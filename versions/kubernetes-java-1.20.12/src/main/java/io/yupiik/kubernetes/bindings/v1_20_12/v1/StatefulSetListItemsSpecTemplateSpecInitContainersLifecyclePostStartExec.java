package io.yupiik.kubernetes.bindings.v1_20_12.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
