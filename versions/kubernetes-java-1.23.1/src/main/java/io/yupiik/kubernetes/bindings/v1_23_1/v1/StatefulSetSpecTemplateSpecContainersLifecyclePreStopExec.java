package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
