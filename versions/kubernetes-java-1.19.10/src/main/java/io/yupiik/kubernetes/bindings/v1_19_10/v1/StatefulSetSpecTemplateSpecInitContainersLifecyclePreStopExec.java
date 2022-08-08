package io.yupiik.kubernetes.bindings.v1_19_10.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
