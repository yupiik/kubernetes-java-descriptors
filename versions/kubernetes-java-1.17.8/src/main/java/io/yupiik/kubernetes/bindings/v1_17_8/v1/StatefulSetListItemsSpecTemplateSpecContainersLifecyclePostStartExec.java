package io.yupiik.kubernetes.bindings.v1_17_8.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
