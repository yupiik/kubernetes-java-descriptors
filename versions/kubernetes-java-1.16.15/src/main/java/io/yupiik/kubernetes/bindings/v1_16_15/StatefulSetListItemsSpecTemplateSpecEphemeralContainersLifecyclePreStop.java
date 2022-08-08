package io.yupiik.kubernetes.bindings.v1_16_15;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop {
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec,
                                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
